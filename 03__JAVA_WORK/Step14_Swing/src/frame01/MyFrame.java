package frame01;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

	public MyFrame(String title) {
		// 부모 생성자에 프레임의 제목 넘겨주기
		super(title);
		// setBounds(x,y, width, height)
		setBounds(100, 100, 500, 500);
		// 창을 닫았을 때 프로세스도 같이 종료되도록 한다.
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// 프레임의 레이아웃 매니저를 사용하지 않기 때문에 UI를 절대 좌표에 직접 배치해야 한다.
		setLayout(null);

		JButton btn1 = new JButton("버튼1");
		// 버튼의 위치
		btn1.setLocation(10, 10);
		// 버튼의 크기
		btn1.setSize(100, 30);
		add(btn1); // 프레임에 btn1 추가하기
		
		JButton btn2=new JButton("버튼2");
		//setLocation(), setSize() 메소드 대신에 한번에 설정할 수 있는 메소드
		btn2.setBounds(120, 10, 100, 30);
		add(btn2); //프레임에 btn2 추가하기
	
		JButton btn3=new JButton("버튼3");
		btn3.setBounds(230, 10, 100, 30);
		add(btn3);
		
		// 프레임이 화면상에 보이도록 한다.
		setVisible(true);
		
		
	}

	public static void main(String[] args) {

		new MyFrame("나의 프레임");

	}
}
