package test.main;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Frame07 extends JFrame implements ActionListener {
	JTextField tf;

	// 생성자
	public Frame07(String title) {
		super(title);
		// 레이아웃 설정
		setLayout(new FlowLayout());

		tf = new JTextField(10);
		JButton printBtn = new JButton("출력하기");

		add(tf);
		add(printBtn);

		// 버튼에 리스너 등록
		printBtn.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		new Thread(()->{
			// 입력한 문자열을 읽어온다.
			String inputNum = tf.getText();
			// 입력한 숫자 형태의 문자열을 실제 정수로 바꾸기
			int num = Integer.parseInt(inputNum);
			for (int i = 0; i < 9; i++) {
				// 1초씩 지연시키기
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {

					e1.printStackTrace();
				}
				int result = num * (i + 1);
				System.out.println(num + " X " + (i + 1) + " = " + result);
			}			
		}).start();
		//바로 리턴한다.
		System.out.println("actionPerformed() 메소드가 리턴 됩니다.");
	}

	public static void main(String[] args) {
		JFrame frame = new Frame07("구구단 예제");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 500, 500);
		frame.setVisible(true);
		// 프로그램을 닫으면 자동으로 프로세스가 종료되도록 한다.
	}

}
