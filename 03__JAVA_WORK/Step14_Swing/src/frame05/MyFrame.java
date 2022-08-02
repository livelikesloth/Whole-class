package frame05;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame {

	public MyFrame(String title) {
		// 부모 생성자에 프레임의 제목 넘겨주기
		super(title);

		this.setLayout(new FlowLayout());

		JButton sendBtn = new JButton("전송");
		add(sendBtn);

		// 버튼의 동작을 리스닝할 interface type 객체
		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Sending?");
				JOptionPane.showMessageDialog(MyFrame.this, "전송합니다.");
			}
		};
		sendBtn.addActionListener(listener);

		// 삭제 버튼을 만들어서
		JButton deleteBtn = new JButton("삭제");
		// 프레임에 추가하기
		add(deleteBtn);
		ActionListener listener2 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Delete");
				JOptionPane.showMessageDialog(MyFrame.this, "삭제합니다");
			}
		};
		deleteBtn.addActionListener(listener2);

		// 매개변수 안만들고 만들기
		JButton hiBtn = new JButton("안녕?");
		// 프레임에 추가하기
		add(hiBtn);
		hiBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(MyFrame.this, "안녕하세요?");
			}
		});

	}

	public static void main(String[] args) {

		JFrame f = new MyFrame("나의 프레임");
		f.setBounds(100, 100, 500, 500);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setVisible(true);

	}
}
