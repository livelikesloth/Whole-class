<%@page import="org.apache.catalina.connector.Request"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
/*
	jsp 페이지에서 HttpServletRequest는 기본 객체이다. 
	request 라는 이름의 지역 변수에 참조값이 들어있기 때문에 바로 . 찍어서 필요한 메소드를 활용할 수 있다.
*/
	//post 방식 전송 한글 깨지지 않도록
	request.setCharacterEncoding("utf-8");
	//msg 라는 파라미터명으로 전송되는 문자열 추출해서 콘솔창에 출력
	String a = request.getParameter("msg");
	//System.out.println(a);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/send.jsp</title>
</head>
<body>
	<p>
		메세지
		<%=a%>
		잘 받았어 클라이언트야
	</p>
	<br />
	<a href="/Step01_Servlet">인덱스로 가기</a>
</body>
</html>

