package frame06;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame2 extends JFrame implements ActionListener{
   //생성자
   public MyFrame2(String title) {
      //부모생성자에 프레임의 제목 넘겨주기 
      super(title);      
      setLayout(new FlowLayout());
      
      
      
      JButton sendBtn=new JButton("전송");
      //프레임에 버튼 추가하기 ( FlowLayout 의 영향을 받는다 )
      add(sendBtn);
      sendBtn.addActionListener(this);
      
      
      
      //삭제 버튼을 만들어서 
      JButton deleteBtn=new JButton("삭제");
      //프레임에 추가하기
      add(deleteBtn);      
      deleteBtn.addActionListener(this);  
      
      
      
      //각각의 버튼에 ActionCommand 설정
      sendBtn.setActionCommand("send");
      deleteBtn.setActionCommand("delete");
   }
   
   
   
   public static void main(String[] args) {
      
      JFrame f=new MyFrame2("나의 프레임");
      f.setBounds(100, 100, 500, 500);
      f.setDefaultCloseOperation(EXIT_ON_CLOSE);
      f.setVisible(true);
      
   }

   @Override
   public void actionPerformed(ActionEvent e) {
	    //이벤트가 일어난 객체에 설정된 ActionCommand 문자열 읽어오기
	   String command=e.getActionCommand();
	   if(command.equals("send")) {
		   JOptionPane.showMessageDialog(this, "전송 합니다.");
	   }else if(command.equals("delete")) {
		   JOptionPane.showMessageDialog(this, "삭제 합니다.");
	   }
	   /*
	    * [문자열 비교에 대해서]
	    * 문자열을 비교한다는 것은 참조값이 같은지 비교하는 걸까?
	    * 문자열의 내용이 같은지 비교하는 걸까?
	    * 
	    * 그렇다면 ==연산자는 뭘 비교하는 연산자일까?
	    * 	참조값을 비교하는 연산자이다.
	    * 
	    * 그러면 문자열의 내용이 같으면 참조값이 같을까?
	    * 	같을때도 있고 아닐때도 있다.
	    * 결론은 문자열의 내용을 비교할 때 ==를 사용하면 안된다.
	    * 
	    * 비교하는 방법은 String 객체의 .equals() 메소드를 활용하면 된다.
	    */
   }
}
