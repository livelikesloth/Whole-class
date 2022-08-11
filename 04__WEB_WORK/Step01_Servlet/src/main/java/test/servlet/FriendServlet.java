package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/friend/list")
public class FriendServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	//db에서 불러온 친구목록이라고 가정
		List<String> list = new ArrayList<String>();
		list.add("두부");
		list.add("유키");
		list.add("소주");
		list.add("티몬");
		list.add("품바");
		
		
		/*
		 * 위의 목록을 이용해서 친구목록을 클라이언트에게 출력해 보세요
		 * - 아래와 같은 html 형식으로 출력
		 * <ul>
		 * 	<li>두부</li>
		 * 	...
		 * </ul>
		 *  반드시 반복문 사용
		 */
		

	      resp.setCharacterEncoding("utf-8");
	      resp.setContentType("text/html; charset=utf-8");
	      PrintWriter pw = resp.getWriter();
	      pw.println("<!doctype html>");
	      pw.println("<html>");
	      pw.println("<head>");
	      pw.println("<meta charset=\"utf-8\">");
	      pw.println("<title>친구목록 입니다.</title>");
	      pw.println("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css\" />");
	      pw.println("</head>");
	      pw.println("<body>");
	      pw.println("<ul>");
	      for (String friends:list) {
	    	  pw.println("<li>"+friends+"</li>");	
			}
	      pw.println("</ul>");
	      pw.println("<a href=\"/Step01_Servlet/\">인덱스로 가기</a>");
	      pw.println("</body>");
	      pw.println("</html>");
	      pw.close();
	}
}
