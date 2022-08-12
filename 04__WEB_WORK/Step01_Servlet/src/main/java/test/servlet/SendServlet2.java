package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/send2")
public class SendServlet2 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("클라이언트에서 msg요청이 왔다!");
		req.setCharacterEncoding("utf-8");
		String a = req.getParameter("msg");
		System.out.println("msg : "+a);		
		
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html; charset=utf-8");
		PrintWriter pw = resp.getWriter();
		pw.println("<!doctype html>");
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<meta charset='utf-8'>");
		pw.println("<title> 클라이언트의 요청을 받았다!2</title>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<p>메세지 \""+a+"\" 잘 받았어 클라이언트야!</p>");
		pw.println("<br>");
		pw.println("<a href=\"/Step01_Servlet/\">인덱스로 가기</a>");
		pw.println("</body>");
		pw.println("</html>");
		pw.close();
	}

}
