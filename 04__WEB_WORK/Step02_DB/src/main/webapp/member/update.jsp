<%@page import="test.member.dto.MemberDto"%>
<%@page import="test.member.dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
   request.setCharacterEncoding("utf-8");

   //1. 폼 전송되는 수정할 회원의 정보를 읽어온다.
   int num=Integer.parseInt(request.getParameter("num"));
   String name=request.getParameter("name");
   String addr=request.getParameter("addr");
   //MemberDto 객체에 수정할 회원의 정보를 담는다.
   MemberDto dto=new MemberDto(num, name, addr);
   //2. DB 에 수정 반영한다.
   boolean isSuccess=MemberDao.getInstance().update(dto);
   //3. 응답한다.
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/member/update.jsp</title>
</head>
<body>
   <div class="container">
      <h1>알림</h1>
      <%if(isSuccess){ %>
         <p>
            <strong><%=num %></strong> 번 회원의 정보를 수정 했습니다.
            <a href="list.jsp">확인</a> 
         </p>
      <%}else{ %>
         <p>
            수정 실패! <a href="updateform.jsp?num=<%=num%>">다시 시도</a>
         </p>
      <%} %>
   </div>   
</body>
</html>









