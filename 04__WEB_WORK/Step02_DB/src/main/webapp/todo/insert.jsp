<%@page import="test.todo.dao.TodoDao"%>
<%@page import="test.todo.dto.TodoDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//1. 폼 전송되는 할일을 읽어와서
	request.setCharacterEncoding("utf-8");
	String content=request.getParameter("content");
	//2. DB 에 저장하고
	TodoDto dto=new TodoDto();
	dto.setContent(content);
	boolean isSuccess=TodoDao.getInstance().insert(dto);
	//3. 응답하기
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/todo/insert.jsp</title>
</head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
</head>
<body>
<div class="container mt-5">
	<h1>알림</h1>
	<%if(isSuccess){ %>
		<p class="alert alert-success">
			할일을 추가 했습니다. <a href="list.jsp">목록보기</a>
		</p>
	<%}else{ %>
		<p class="alert alert-danger">
			할일 추가 실패! <a href="insertform.jsp">다시 시도</a>
		</p>
	<%} %>
</div>
<jsp:include page="/include/footer.jsp"></jsp:include>
</body>
</html>




