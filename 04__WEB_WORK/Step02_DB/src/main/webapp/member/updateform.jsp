<%@page import="test.member.dao.MemberDao"%>
<%@page import="test.member.dto.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
//1. get 방식 파라미터로 전달되는 수정할 회원의 번호를 읽어온다.
int num = Integer.parseInt(request.getParameter("num"));
//2. DB 에서 수정할 회원의 정보를 얻어온다.
MemberDto dto = MemberDao.getInstance().getData(num);
//3. 수정할 회원의 정보를 form 에 출력해서 응답한다.
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/member/updateform.jsp</title>
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
	<div class="container">
		<nav class="mt-2">
			<ol class="breadcrumb">
				<li class="breadcrumb-item"><a
					href="${pageContext.request.contextPath }/index.jsp">Home</a></li>
				<li class="breadcrumb-item"><a
					href="${pageContext.request.contextPath }/member/list.jsp">회원목록</a>
				</li>
				<li class="breadcrumb-item active">회원 추가 페이지</li>
			</ol>
		</nav>
		<h1>회원 정보 수정 폼</h1>
		<form action="update.jsp" method="post">
			<!-- 
				input type="hidden" 은 화면상에 보이지는 않지만 폼을 전송하면 같이 전송된다.	
		 	-->
			<input type="hidden" name="num" value="<%=dto.getNum()%>" />
			<div class="mb-3">
				<label class="form-label" for="num">번호</label>
				<!-- 
					번호는 primary key 로 사용이 되기 때문에 수정을 하지 않는다. 
					그래서 수정할 필요가 없기 때문에 disabled 로 설정한 것이다.
					하지만 disabled 로 설정하면 form 전송했을 때 전송도 되지 않는다.
					이런 이유 때문에 input type="hidden"으로 수정할 회원의 번호가 
					폼 전송될 때 같이 정송되도록 해 놓은 것이다.	
				 -->
				<input class="form-control" type="text" id="num"
					value="<%=dto.getNum()%>" disabled />
			</div>
			<div>
				<label class="form-label" for="name">이름</label> <input
					class="form-control" type="text" name="name" id="name"
					value="<%=dto.getName()%>" />
			</div>
			<div>
				<label class="form-label" for="addr">주소</label> <input
					class="form-control" type="text" name="addr" id="addr"
					value="<%=dto.getAddr()%>" />
			</div>
			<button class="btn btn-primary btn-sm" type="submit">수정</button>
			<button class="btn btn-primary btn-sm" type="reset">취소</button>
		</form>
	</div>
	<jsp:include page="/include/footer.jsp"></jsp:include>
</body>
</html>