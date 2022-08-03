package frame07;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{
	JTextField inputMsg1, inputMsg2;
	JButton btn;
	
	//생성자
	public MyFrame(String title) {
		super(title);
		//레이아웃
		setLayout(new FlowLayout());
		inputMsg1 = new JTextField(10);
		inputMsg2 = new JTextField(10);
		btn=new JButton("눌러보세요");
				
		add(inputMsg1);
		add(btn);
		add(inputMsg2);		
		btn.addActionListener(this);
	}
		
	public static void main(String[] args) {
		JFrame f = new MyFrame("나의 프레임");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100, 100, 500, 500);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String msg = inputMsg1.getText();
		inputMsg2.setText(msg);
		inputMsg1.setText("");
	}	
}
