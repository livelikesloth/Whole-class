package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//3.
@WebServlet("/weather")
public class weatherServlet extends HttpServlet{//1. 
   
   /*
    *  FortuneServlet 객체가 언제 생성이 되지? 
    *  생성이 된다면 여러개가 생성이 될까? 
    *  아니면 하나만 생성해서 사용이 될까?
    */
   public weatherServlet() {
      //최초 요청시 객체가 생성이 되고 그 이후에는 생성된 객체를 다시 사용한다. 
      System.out.println("FortuneServlet 객체 생성됨!");
   }
   
   //2. 
   @Override
   protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      
      //오늘의 날씨 5개를 미리 준비해 둔다.
      String[] list = {"맑음!", "흐림!", 
            "비옴!", "비많이옴!", "비엄청많이옴!"};
      //0~4 사이의 랜덤한 정수를 얻어내기
      int ranNum=new Random().nextInt(5);
      
      //응답 인코딩 설정
      resp.setCharacterEncoding("utf-8");
      //응답 컨텐트 설정
      resp.setContentType("text/html; charset=utf-8");
      //클라이언트의 웹브라우저에 문자열을 출력할수 있는 객체의 참조값 얻어내기
      PrintWriter pw = resp.getWriter();
      pw.println("<!doctype html>");
      pw.println("<html>");
      pw.println("<head>");
      pw.println("<meta charset=\"utf-8\">");
      pw.println("<title>오늘의 날씨 페이지</title>");
      pw.println("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css\" />");
      pw.println("</head>");
      pw.println("<body>");
      pw.println("<p class=\"alert alert-primary\">오늘의 날씨:"+list[ranNum]+"</p>");
      pw.println("<a href=\"/Step01_Servlet/\">인덱스로 가기</a>");
      pw.println("</body>");
      pw.println("</html>");
      //pw.flush();//방출
      pw.close();//닫아주기 (auto flush)
      
   }
}














