<%@page import="java.util.List"%>
<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	//한글 깨지지 않도록 설정
	request.setCharacterEncoding("utf-8");
	/*폼 전송되는 모든 내용을 추출해서 아래에 정보를 출력한다.*/
	
	//파라미터 읽어오기
	//입력한 email
	String email = request.getParameter("email");
	//선택한 comment
	String comment = request.getParameter("comment");
	//선택한 job
	String job = request.getParameter("job");
	//체크한 interest 여러개를 선택할 수 도 있기 때문에 배열
	String[] interest = request.getParameterValues("interest");
	//만일 interest가 null 이라면
	if(interest == null){
		interest=new String[0]; //빈 배열의 참조값을 넣어준다.
	}
	//체크한 gender
	String gender = request.getParameter("gender");
	//String[]을 List<String>으로 변환하기
	//변환하면 .contain() 메소드를 활용할 수 있다.
	List list = Arrays.asList(interest);

%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/test/signup.jsp</title>
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
<div class="container" class="shadow p-5 rounded">
	<h1 align="center">전송된 정보는 아래와 같습니다.</h1>
	<div class="form-floating mb-3" >
		<input type="email" name="email" id="floatingInput" value="<%=email %>" disabled class="form-control"> 
		<label for="floatingInput">이메일</label>
	</div>
	
	
	<div>
		<label for="job">직업</label> <select name="job" id="job" class="form-select form-select-lg mb-3"
			aria-label=".form-select-lg example">
			<option value="" disabled>선택</option>
			<option value="programmer"
				<%=job.equals("programmer") ? "selected" : ""%> disabled>프로그래머</option>
			<option value="chicken" <%=job.equals("chicken") ? "selected" : ""%>
				disabled>치킨집사장</option>
			<option value="pizza" <%=job.equals("pizza") ? "selected" : ""%>
				disabled>피자집사장</option>
			<option value="guitar" <%=job.equals("guitar") ? "selected" : ""%>
				disabled>기타집사장</option>
		</select>
	</div>
	
	
	<div class="form-check form-switch mb-3">
		<fieldset>
			<legend>관심사 체크</legend>
			<label class="form-check-label" for="flexSwitchCheckDefault">
				<input name="interest" value="reading" class="form-check-input" type="checkbox" role="switch" id="flexSwitchCheckDefault" <%=list.contains("reading") ? "checked" : ""%> disabled>독서
			</label><br />
			<label class="form-check-label" for="flexSwitchCheckDefault">
				<input name="interest" value="game" class="form-check-input" type="checkbox" role="switch" id="flexSwitchCheckDefault" <%=list.contains("game") ? "checked" : ""%> disabled>게임
			</label><br />
			<label class="form-check-label" for="flexSwitchCheckDefault">
				<input name="interest" value="cooking" class="form-check-input" type="checkbox" role="switch" id="flexSwitchCheckDefault" <%=list.contains("cook") ? "checked" : ""%> disabled>요리
			</label>
		</fieldset>
	</div>
	<div class="mb-3">
		<fieldset>
			성별 체크 
			<label for=""> <input type="radio" name="gender"
				value="man" <%=gender.equals("man") ? "checked" : ""%> disabled />남자
			</label> <label for=""> <input type="radio" name="gender"
				value="woman" <%=gender.equals("woman") ? "checked" : ""%> disabled />여자
			</label>

		</fieldset>
	</div>
	<div class="mb-3">
		<label for="comment">할말</label><br />
		<textarea name="comment" id="comment" disabled><%=comment%></textarea>
	</div>
	<button type="button" onclick="location.href='/'">돌아가기</button>
</div>
</body>
</html>