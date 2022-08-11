<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
		//오늘의 날씨 5개를 미리 준비해 둔다.
	String[] list = { "맑음!", "흐림!", "비옴!", "비많이옴!", "비엄청많이옴!" };
	//0~4 사이의 랜덤한 정수를 얻어내기
	int ranNum = new Random().nextInt(5);
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/weather.jsp</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" />
</head>
<body>
	<p class="alert alert-primary">오늘의 날씨 : <%= list[ranNum] %></p>
	<p class="alert alert-primary">오늘의 날씨 : <% out.print(list[ranNum]); %> </p>
	<a href="/Step01_Servlet">인덱스로 가기</a>
</body>
</html>