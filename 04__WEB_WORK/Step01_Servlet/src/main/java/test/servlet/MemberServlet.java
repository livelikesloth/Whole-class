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

import test.dto.MemberDto;

@WebServlet("/member/list")
public class MemberServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// DB 에서 불러온 회원 목록이라고 가정하자
		List<MemberDto> list = new ArrayList<>();
		list.add(new MemberDto(1, "두부", "페어펙스"));
		list.add(new MemberDto(2, "유키", "하이데저트"));
		list.add(new MemberDto(3, "소주", "리치몬드"));
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html; charset=utf-8");
		PrintWriter pw = resp.getWriter();
		pw.println("<!doctype html>");
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<meta charset='utf-8'>");
		pw.println("<title></title>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<h1>회원 목록 페이지 입니다.</h1>");
		pw.println("<table border =\"1\">");
			pw.println("<thead>");
				pw.println("<tr>");
					pw.println("<th>번호</th>");
					pw.println("<th>이름</th>");
					pw.println("<th>주소</th>");
				pw.println("</tr>");
			pw.println("<thead>");
			pw.println("<tbody>");
				for(MemberDto tmp:list) {
					pw.println("<tr>");
						pw.println("<td>"+tmp.getNum()+"</td>");
						pw.println("<td>"+tmp.getName()+"</td>");
						pw.println("<td>"+tmp.getAddr()+"</td>");
					pw.println("</tr>");
					}
			pw.println("<tbody>");
		pw.println("</table>");
		pw.println("<a href=\"/Step01_Servlet/\">인덱스로 가기</a>");
		pw.println("</body>");
		pw.println("</html>");
		pw.close();
	}
	/*
	 * 회원 목록을 table 형식으로 출력해 보세요
	 */

}
