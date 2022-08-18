<%@page import="java.util.List"%>
<%@page import="test.todo.dao.TodoDao"%>
<%@page import="test.todo.dto.TodoDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
List<TodoDto> list = TodoDao.getInstance().getList();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/todo/list.jsp</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2"
	crossorigin="anonymous"></script>
<style>
.a1 {
	float: right;
}
</style>
<script type="text/javascript">
	//수정 버튼을 누르면호출되는 함수
	function updateBtn() {
		//체크된 <inpt type ="radio" 요소의 참조값을 얻어와서
		let radio = document.querySelector('[name=radio]:checked');
		//만일 없으면
		if (radio == null) {
			alert("수정할 컨텐츠를 체크 하세요!");
			return;//함수를 여기서 끝내기 
		}
		//할일 수정 페이지로 이동하면서 get 방식 파라미터로 수정할 번호를 가지고 가게 한다.
		location.href = "updateform.jsp?num=" + radio.value;
	}
	//삭제 버튼을 눌렀을때 호출되는 함수 
	function deleteBtn() {
		let radio = document.querySelector('[name=radio]:checked');
		if (radio == null) {
			alert("삭제할 컨텐츠를 체크 하세요!");
			return;//함수를 여기서 끝내기 
		}
		if (confirm("정말로 삭제 합니까?")) {
			//delete.jsp 페이지로 이동하면서 num 이라는 파라미터 명으로 삭제할 번호를 들고 가도록 한다. 
			location.href = "delete.jsp?num=" + radio.value;
		}
	}
</script>
</head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2"
	crossorigin="anonymous"></script>
</head>
<body>
	<jsp:include page="/include/navbar.jsp">
		<jsp:param value="todo" name="thisPage" />
	</jsp:include>
	<div class="container">
		<h1 align="center">Todo List 입니다.</h1>

		<table class="table table-bordered table-hover">
			<thead class="table-dark">
				<tr style="margin: auto; text-align: center;">
					<th width="100" align="center">번호</th>
					<th>할일</th>
					<th width="200">날짜</th>
					<th width="100">선택</th>
				</tr>
			</thead>
			<tbody>
				<%
				for (TodoDto tmp : list) {
				%>
				<tr>
					<td><%=tmp.getNum()%></td>
					<td><%=tmp.getContent()%></td>
					<td><%=tmp.getRegdate()%></td>
					<td><input type="radio" name="radio" value="<%=tmp.getNum()%>" /></td>
				</tr>
				<%
				}
				%>
			</tbody>
		</table>
	</div>
	<div class="container" align="right">
		<a href="insertform.jsp" class="a1">
			<span class="visually-hidden">할일추가</span>
			<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-plus-square" viewBox="0 0 16 16">
			  <path d="M14 1a1 1 0 0 1 1 1v12a1 1 0 0 1-1 1H2a1 1 0 0 1-1-1V2a1 1 0 0 1 1-1h12zM2 0a2 2 0 0 0-2 2v12a2 2 0 0 0 2 2h12a2 2 0 0 0 2-2V2a2 2 0 0 0-2-2H2z"/>
			  <path d="M8 4a.5.5 0 0 1 .5.5v3h3a.5.5 0 0 1 0 1h-3v3a.5.5 0 0 1-1 0v-3h-3a.5.5 0 0 1 0-1h3v-3A.5.5 0 0 1 8 4z"/>
			</svg>
		</a>
		<button onclick="updateBtn()">수정</button>
		<button onclick="deleteBtn()">삭제</button>
	</div>
	<jsp:include page="/include/footer.jsp"></jsp:include>
</body>
</html>





