package test.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;

import test.dao.MemberDao;
import test.dto.MemberDto;

/*
 *  //1. 선택된 row  인덱스를 읽어온다.
   int selectedIndex=table.getSelectedRow();
   
   //2. 선택된 row 의 첫번째(0번째) 칼럼의 숫자를 읽어온다 (삭제할 회원의 번호)
   int num=(int)model.getValueAt(selectedIndex, 0);
   
   
   -------------------------------------
   
   List<MemberDto>  list=dao.getList();
   
   for(MemberDto tmp:list){
      Object[] row={tmp.getNum(), tmp.getName(), tmp.getAddr()};
      model.addRow(row);
   }
 * 
 */
public class MemberFrame extends JFrame implements ActionListener, PropertyChangeListener {
	// 필드
	JTextField inputName, inputAddr;
	DefaultTableModel model;
	JTable table;

	// 생성자
	public MemberFrame() {
		setLayout(new BorderLayout());

		JLabel label1 = new JLabel("이름");
		inputName = new JTextField(10);

		JLabel label2 = new JLabel("주소");
		inputAddr = new JTextField(10);

		JButton saveBtn = new JButton("저장");
		saveBtn.setActionCommand("save");

		// 삭제 버튼 추가
		JButton deleteBtn = new JButton("삭제");
		deleteBtn.setActionCommand("delete");

		JPanel panel = new JPanel();
		panel.add(label1);
		panel.add(inputName);
		panel.add(label2);
		panel.add(inputAddr);
		panel.add(saveBtn);
		panel.add(deleteBtn);

		add(panel, BorderLayout.NORTH);

		// 표형식으로 정보를 출력하기 위한 JTable
		table = new JTable();
		// 칼럼명을 String[] 에 순서대로 준비
		String[] colNames = { "번호", "이름", "주소" };
		// 테이블에 출력할 정보를 가지고 있는 모델 객체 (칼럼명, row 갯수)
		model = new DefaultTableModel(colNames, 0) {
			@Override
			public boolean isCellEditable(int row, int column) {
				if (column == 0) {// 만일 0번째 칼럼이면 수정이 불가능 하도록 false를 리턴해준다.
					return false;
				} else {//0번째 칼럼 이외으 칼럼은 모두 수정가능하도록 true를 리턴해준다.
					return true;
				}
			}
		};

		// 모델을 테이블에 연결한다.
		table.setModel(model);
		// 스크롤이 가능 하도록 테이블을 JScrollPane 에 감싼다.
		JScrollPane scroll = new JScrollPane(table);
		// JScrollPane 을 프레임의 가운데에 배치하기
		add(scroll, BorderLayout.CENTER);
		// 생성자에서 displayMember()메소드를 호출해서 회원 목록을 한번 출력해 준다.
		this.displayMember();

		// 버튼에 액션리스너 등록
		saveBtn.addActionListener(this);
		deleteBtn.addActionListener(this);
		//테이블에 값이 바뀌었는지 감시할 리스너 등록
		table.addPropertyChangeListener(this);
	}

	// 테이블에 데이터 출력하는 메소드
	public void displayMember() {
		// 이미 테이블에 출력된 내용 삭제
		model.setRowCount(0);

		// 회원 전체 목록을 얻어와서
		List<MemberDto> list = new MemberDao().getList();

		for (MemberDto tmp : list) {
			// MemberDto 객체에 있는 내용을 Object[] 에 순서대로 담애서
			Object[] row = { tmp.getNum(), tmp.getName(), tmp.getAddr() };
			model.addRow(row);
		}

		Object[] row = { 1, "Dubu", "Fairfax" };
		// 출력하기
		model.addRow(row);

	}

	// main 메소드
	public static void main(String[] args) {
		MemberFrame f = new MemberFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100, 100, 800, 500);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 눌러진 버튼의 action command 값을 읽어와서
		String command = e.getActionCommand();
		// 분기한다.
		if (command.equals("save")) {
			// 1. 입력한 이름과, 주소를 읽어온다.
			String name = inputName.getText();
			String addr = inputAddr.getText();
			// 2. 읽어온 이름과 주소를 MemberDto 객체를 생성해서 담는다.
			MemberDto dto = new MemberDto();
			dto.setName(name);
			dto.setAddr(addr);
			// 3.MemberDao 객체를 이용해서 DB에 저장을 한다.
			MemberDao dao = new MemberDao();
			dao.insert(dto);
			// 4. 목록이 다시 출력되도록 한다.
			displayMember();
		} else if (command.equals("delete")) {
			// 선택된 row 인덱스를 int[] 로 얻어내기
			int[] rows = table.getSelectedRows();
			// 만일 어떤 row도 선택하지 않았다면
			if (rows.length == 0) {
				JOptionPane.showMessageDialog(this, "선택된 row가 없습니다.");
				// 메소드를 여기서 끝낸다
				return;
			}
			// 사용할 MemberDao 객체를 생성해서
			MemberDao dao = new MemberDao();
			// 반복문 사용해 선택한 row 인덱스를 참조한다.
			for (int selectedRow : rows) {
				// 선택한 row의 가장 첫번째 칼럼에 있는 숫자 얻어내기
				int num = (int) model.getValueAt(selectedRow, 0);
				// MemberDao 객체를 이용해서 해당 번호의 회원정보 삭제하기
				dao.delete(num);
			}

			displayMember();
		}
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		System.out.println("property change!");
		System.out.println("property name:"+evt.getPropertyName());
		System.out.println("isEdditing:"+table.isEditing());
		//만일 property name 이 tableCellEditor 와 같고 table이 수정중이 아니면
		if(evt.getPropertyName().equals("tableCellEditor") && !table.isEditing()) {
			//현재 선택된 row의 정보를 읽어와서 수정 반영 한다.
			int selectedRow=table.getSelectedRow();
			int num=(int)model.getValueAt(selectedRow, 0);
			String name=(String)model.getValueAt(selectedRow, 1);
			String addr=(String)model.getValueAt(selectedRow, 2);
			
			//MemberDto 객체에 담고
			MemberDto dto = new MemberDto(num, name, addr);
			//MemberDao 객첼르 이용해서 수정 반영한다.
			new MemberDao().update(dto);
			
		}		
	}
}
