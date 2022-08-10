package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//경로
@WebServlet("/weather")
public class weatherServlet extends HttpServlet {// HttpServlet 클래스 상속
	//메소드 오버라이드
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("오늘의 날씨는");
		//응답 인코딩
		resp.setCharacterEncoding("utp-8");
		//응답 컨텐츠
		resp.setContentType("text/html; charset=utf-8");
		
		//문자열 응답할 객체 받아오기
		PrintWriter pw = resp.getWriter();
		pw.println("<!doctype html>");
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<meta charset='utf-8'>");
		pw.println("<title>오늘의 날씨</title>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<img src=\"images.jfif\"/>");
		pw.println("<br>");		
		pw.println("<p>맑음!</P>");
		pw.println("<a href=\"Step01_servlet\">인덱스로 가기</a>");
		pw.println("</body>");
		pw.println("</html>");
		pw.flush();//방출
		pw.close();//닫아주기
		
	}

}
