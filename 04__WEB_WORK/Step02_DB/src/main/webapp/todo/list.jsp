<%@page import="java.util.List"%>
<%@page import="test.todo.dao.TodoDao"%>
<%@page import="test.todo.dto.TodoDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% 
	TodoDao dao = TodoDao.getInstance();
	List<TodoDto> list = dao.getList();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
	<table>
	<thead>
		<tr>
			<th>번호</th>
			<th>할일</th>
			<th>등록일</th>
			<th>수정</th>
			<th>삭제</th>
		</tr>
	</thead>
		<tbody>
		<%for (TodoDto tmp:list){%>
			<tr>
				<td><%= %></td> <!-- 번호 -->
				<td><%= %></td> <!-- 할일 -->
				<td><%= %></td> <!-- 등록일 -->
				<td><a href="updateform.jsp?num=<%= %>">수정</a></td> <!-- 수정 -->
				<td><a href="delete.jsp?num=<%= %>">삭제</a></td> <!-- 삭제 -->
			</tr>
			<%}%>
		</tbody>
	</table>
	</div>
</body>
</html>