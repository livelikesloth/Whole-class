<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/test/form.jsp</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2"
	crossorigin="anonymous"></script>
<link
	rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css"
/>
<style>
	form legend{
		font-size:1rem;
		/*늑정 요소에 애니메이션 적용 시간을 커느터 마이징 할 수 도 있다.*/
		.animate__rotateInUpLeft{
			animation-duration: 5s;
			animation-iteration-count:2;
		
		}
</style>
</head>
<body>
	<div class="container">
	<div class="row animate__animated animate__rotateInUpLeft">
		<div class="col-md-6">
		<h1 align="center">테스트 폼 입니다.</h1>
		<form action="signup.jsp" method="post" class="shadow p-5 rounded">
			<div class="form-floating mb-3">
				<input type="email" class="form-control" name="email"
					id="floatingInput" placeholder="name@example.com"> 
					<label for="floatingInput">이메일</label>
			</div>
			<div class="mb-3">
				<label for="job">직업</label> <select name="job" id="job"
					class="form-select form-select-lg mb-3"
					aria-label=".form-select-lg example">
					<option value="">선택</option>
					<option value="programmer">프로그래머</option>
					<option value="chicken">치킨집사장</option>
					<option value="pizza">피자집사장</option>
					<option value="guitar">기타집사장</option>
				</select>
			</div>
			<div class="form-check form-switch mb-3" >
				<fieldset>
					<legend>관심사 체크</legend>
					<label class="form-check-label" for="flexSwitchCheckDefault">
						<input name="interest" value="reading" class="form-check-input"
						type="checkbox" role="switch" id="flexSwitchCheckDefault">독서
					</label><br /> <label class="form-check-label"
						for="flexSwitchCheckDefault"> <input name="interest"
						value="game" class="form-check-input" type="checkbox"
						role="switch" id="flexSwitchCheckDefault">게임
					</label><br /> <label class="form-check-label"
						for="flexSwitchCheckDefault"> <input name="interest"
						value="cooking" class="form-check-input" type="checkbox"
						role="switch" id="flexSwitchCheckDefault">요리
					</label>
				</fieldset>
			</div>
			<br />
			<div class="mb-3">
				<fieldset>
					성별 체크 

					<input type="radio" class="btn-check" name="gender" value="man" id="option1" autocomplete="off" >
					<label class="btn btn-secondary" for="option1">남자</label>
					<input type="radio" class="btn-check" name="gender" value="woman" id="option2" autocomplete="off" >
					<label class="btn btn-secondary" for="option2">여자</label>
					
				</fieldset>
			</div>
			<div class="mb-3">
				<label for="comment">할말</label><br />
				<textarea name="comment" id="comment"></textarea>
			</div>
			<button type="submit" id="s" class="btn btn-primary" >전송</button>
		</form> 
		</div>
	</div>
		
	</div>

	
	<script>
	//특정 요소에 이벤트가 발생했을 때 실행할 함수 등록
	document.querySelector("#s").addEventListener("mouseover", function(){
		//원하는 애니메이션 클래스를 추가해서 애니메이션을 동작시킨다.
		this.classList.add("animate__animated");
		this.classList.add("animate__rotateInUpLeft");
		
		});
	//특정 요소에 애니메이션이 끝나는 이벤트가 발생했을 때 실행할 함수 등록
	document.querySelector("#s").addEventListener("animationend", function(){
		this.classList.remove("animate__animated");
		this.classList.remove("animate__rotateInUpLeft");
	});
	}
	</script>
	
</body>
</html>














