package frame08;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalcFrame extends JFrame implements ActionListener {
	// 필드
	JTextField tf_num1, tf_num2;
	JLabel label_result;

	// default 생성자
	public CalcFrame() {
		// 프레임의 레이아웃 법칙 설정하기
		setLayout(new BorderLayout());

		// JPanel
		JPanel topPanel = new JPanel();
		topPanel.setBackground(Color.YELLOW);
		// Panel 을 북쪽에 배치하기

		add(topPanel, BorderLayout.NORTH);

		// JTextField 객체를 만들에서 JPanel 에 추가하기
		tf_num1 = new JTextField(10);
		topPanel.add(tf_num1);

		// 기능 버튼 객체를 만들어서 JPanel 에 추가하기
		JButton plusBtn = new JButton("+");
		JButton minusBtn = new JButton("-");
		JButton multiBtn = new JButton("*"); // actionCommand를 지정하지 않으면 버튼 텍스트가 actionCommand가 됨
		JButton divideBtn = new JButton("/");
		topPanel.add(plusBtn);
		topPanel.add(minusBtn);
		topPanel.add(multiBtn);
		topPanel.add(divideBtn);

		// 두번째 JTextField 만들어서 페널에 추가 하기
		tf_num2 = new JTextField(10);
		topPanel.add(tf_num2);

		// JLabel
		JLabel label1 = new JLabel("=");
		label_result = new JLabel("0");

		// 페널에 레이블 추가하기
		topPanel.add(label1);
		topPanel.add(label_result);

		// 버튼에 액션 리스너 등록
		plusBtn.addActionListener(this);
		minusBtn.addActionListener(this);
		multiBtn.addActionListener(this);
		divideBtn.addActionListener(this);

	}

	public static void main(String[] args) {

		CalcFrame frame = new CalcFrame();
		// 프레임의 제목 설정
		frame.setTitle("계산기");
		// 프레임을 닫으면 자동으로 프로세스가 종료 되도록 한다.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 500, 500);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		// 입력한 문자열을 읽어낸다
		String strNum1 = tf_num1.getText();
		String strNum2 = tf_num2.getText();
		// 활용할 지역 변수를 미리 만들어 놓고
		double result = 0;
		try {
			// 문자열을 숫자로 바꿔서
			double num1 = Double.parseDouble(strNum1);
			double num2 = Double.parseDouble(strNum2);
			// 버튼에 액션 command를 지정하지 않으면 버튼 text가 액션 command가 된다.
			if (command.equals("+")) {
				// 미리 만들어 놓은 지역변수에 연산의 결과를 대입한다.
				result = num1 + num2;
			} else if (command.equals("-")) {
				result = num1 - num2;
			} else if (command.equals("*")) {
				result = num1 * num2;
			} else if (command.equals("/")) {
				if (num2 == 0) {
					JOptionPane.showMessageDialog(this, "0으로 나눌 수 없어요");
					return; // 메소드를 여기서 끝내기ㅣ
				}
				result = num1 / num2;
			}
			// 숫자를 문자열로 바꾸기
			String strResult = Double.toString(result);
			// 연산의 결과를 JLabel에 출력하기
			label_result.setText(strResult);
		} catch (NumberFormatException nfe) {
			JOptionPane.showMessageDialog(this, "숫자 형식으로 입력하세요!");
		}
	}
}