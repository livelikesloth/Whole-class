<%@page import="test.member.dto.MemberDto"%>
<%@page import="test.member.dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
   //post 방식 전송 파라미터 추출할때 한글깨지지 않도록
   request.setCharacterEncoding("utf-8");

   //1. 폼 전송되는 name 과 addr 를 추출한다.
   String name=request.getParameter("name");
   String addr=request.getParameter("addr");
   //MemberDto 객체에 회원 정보를 담고 
   MemberDto dto=new MemberDto();
   dto.setName(name);
   dto.setAddr(addr);
   
   //2. DB 에 저장한다.
   MemberDao dao=MemberDao.getInstance();
   //MemberDao 객체를 이용해서 DB 에 저장을 하고 성공여부를 리턴 받는다. 
   boolean isSuccess=dao.insert(dto);
   //3. 응답한다.
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/member/insert.jsp</title>
</head>
<body>
   <div class="container">
      <h1>알림</h1>
      <%if(isSuccess){ %>
         <p>
            <strong><%=name %></strong> 의 정보를 추가 했습니다.
            <a href="list.jsp">확인</a>
         </p>
      <%}else{ %>
         <p>
            회원 정보 추가 실패!
            <a href="insertform.jsp">다시 입력</a>
         </p>
      <%} %>
   </div>
</body>
</html>












