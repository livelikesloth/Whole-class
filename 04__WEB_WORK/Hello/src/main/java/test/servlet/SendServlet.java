package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 3. 요청 맵핑( 처리할 요청 경로를 작성한다) 반드시 /로 시작을 해야 하고 프로젝트명은 쓰지 않는다.
@WebServlet("/send")
public class SendServlet extends HttpServlet {// 1. HttpServlet 클래스를 상속받는다.

	// 2. service() 메소드 오버라이드
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		System.out.println("요청이 옵니다."); //콘솔에 출력
		req.setCharacterEncoding("utf-8");
		
		//msg라는 파라미터명으로 전송되는 문자열 읽어오기
		String a = req.getParameter("msg");
		System.out.println("msg : "+a);
		
		//응답 인코딩 설정
		resp.setCharacterEncoding("utp-8");
		//응답 컨텐츠 설정
		resp.setContentType("text/html; charset=utf-8");
		
		//	요청을 한 클라이언트에게 문자열을 응답할 객체 얻어오기
		PrintWriter pw = resp.getWriter();
		//웹브라우져에 출력하기
		pw.println("<!doctype html>");
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<meta charset='utf-8'>");
		pw.println("<title> 제목입니다.</title>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<p>Oh my gosh!</p>");
		pw.println("<p>what the heck?</p>");
		pw.println("<img src='/Hello/images/redbird.png'>");
		pw.println("<img src=\"/Hello/images/yellowbird.png\">");
		pw.println("<br>");
		pw.println("<a href=\"/Hello/\">인덱스로 가기</a>");
		pw.println("<p>이것들은 뭐야?</P>");
		pw.println("</body>");
		pw.println("</html>");
		pw.flush();//방출
		pw.close();//닫아주기
	}
}
