<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
//친구 준비
		List<String> list = new ArrayList<String>();
		list.add("두부");
		list.add("유키");
		list.add("소주");
		list.add("티몬");
		list.add("품바");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/friend/list.jsp</title>
</head>
<body>
	<h1>친구 목록2 입니다.</h1>
	<ul>
		<% 
			for(String tmp:list){
				out.write("<li>"+tmp+"</li>");
			}
		%>
		
	</ul>
		<ul>
		<% 
			for(String tmp:list){%>
			<li><%=tmp %></li>
		<% }%>		
	</ul>
</body>
</html>