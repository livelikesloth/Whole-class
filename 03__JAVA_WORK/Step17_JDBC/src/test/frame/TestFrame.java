package test.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

import test.dao.MemberDao;
import test.dto.MemberDto;

public class TestFrame extends JFrame implements ActionListener{
   //필드
   JTextField inputName, inputAddr;
   DefaultTableModel model;
   JTable table;
   
   JButton saveBtn;
   JButton deleteBtn;
   
   //생성자
   public TestFrame() {
      setLayout(new BorderLayout());
      
      JLabel label1=new JLabel("이름");
      inputName=new JTextField(10);
      
      JLabel label2=new JLabel("주소");
      inputAddr=new JTextField(10);
      
      saveBtn=new JButton("저장");
      saveBtn.setActionCommand("save");
      
      //삭제 버튼 추가
      deleteBtn=new JButton("삭제");
      deleteBtn.setActionCommand("delete");
      
      JPanel panel=new JPanel();
      panel.add(label1);
      panel.add(inputName);
      panel.add(label2);
      panel.add(inputAddr);
      panel.add(saveBtn);
      panel.add(deleteBtn);
      
      add(panel, BorderLayout.NORTH);
      
      //표형식으로 정보를 출력하기 위한 JTable
      table=new JTable();
      //칼럼명을 String[] 에 순서대로 준비
      String[] colNames= {"번호", "이름", "주소"};
      //테이블에 출력할 정보를 가지고 있는 모델 객체 (칼럼명, row 갯수)
      model=new DefaultTableModel(colNames, 0);
      //모델을 테이블에 연결한다.
      table.setModel(model);
      //스크롤이 가능 하도록 테이블을 JScrollPane 에 감싼다.
      JScrollPane scroll=new JScrollPane(table);
      //JScrollPane  을 프레임의 가운데에 배치하기 
      add(scroll, BorderLayout.CENTER);
      
      saveBtn.addActionListener(this);
      saveBtn.setActionCommand("save");
      deleteBtn.addActionListener(this);
      deleteBtn.setActionCommand("delete");
      
      displayMember();
   }
   
   //테이블에 데이터 출력하는 메소드
   public void displayMember() {
      
      List<MemberDto> list=new MemberDao().getList();  
      //JTable테이블에 출력된 데이터 reset 
      model.setRowCount(0); 
      for(MemberDto tmp:list){
         Object[] row={tmp.getNum(), tmp.getName(), tmp.getAddr()};
         model.addRow(row);
      }        
   }
   
   //main  메소드
   public static void main(String[] args) {
      TestFrame f=new TestFrame();
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setBounds(100, 100, 800, 500);
      f.setVisible(true);
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      MemberDao dao=new MemberDao();
      MemberDto dto=new MemberDto();

      String name=inputName.getText();
      String addr=inputAddr.getText();
      String command=e.getActionCommand();
      
      if(command.equals("save")) {
         if(name.equals("")) {
            JOptionPane.showMessageDialog(this, "최소한의 정보를 입력해주세요.");   
         }else{
            dto.setName(name);
            dto.setAddr(addr);
            dao.insert(dto);
            displayMember();
            
            JOptionPane.showMessageDialog(this, "정보가 추가되었습니다.");
            
            inputName.setText("");
            inputAddr.setText("");
         }

      }else if(command.equals("delete")) {
         //선택된 row  인덱스를 읽어온다.
          int selectedIndex=table.getSelectedRow();
          //선택된 row 의 첫번째(0번째) 칼럼의 숫자를 읽어온다 (삭제할 회원의 번호)
           int num=(int)model.getValueAt(selectedIndex, 0);
           dao.delete(num);
           displayMember();
           JOptionPane.showMessageDialog(this, "선택하신 정보가 삭제되었습니다.");              
      }
   }
}