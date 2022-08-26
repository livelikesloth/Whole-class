<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<nav class ="navbar navbar-light bg-light navbar-expand-lg">
	<div class="container-fluid">
		<a class="navbar-brand" href="${pageContext.request.contextPath}">
			<img src="${pageContext.request.contextPath}/icon.png" alt="" width="30" height="30" class="d-inline-block aligh-text-top">SMOP!
		</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav me-auto">
			<li class="nav-item">
					<a class="nav-link ${param.thisPage eq 'MAIN' ? 'active' :'' }  href="${pageContext.request.contextPath}index.jsp">MAIN!</a>
				</li>
				<li class="nav-item">
					<a class="nav-link ${param.thisPage eq 'SMOP' ? 'active' :'' }  href="${pageContext.request.contextPath}/bbs/gallery.jsp">SMOP!</a>
				</li>
			</ul>
		</div>
		<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav">
				<li><a href=""></a></li>
				<li><a href=""></a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li class="active"><a href="${pageContext.request.contextPath}/users/loginform.jsp">로그인</a></li>
				<li ><a href="${pageContext.request.contextPath}/users/signup_form.jsp">회원가입</a></li>
			</ul>
			<c:choose>
				<c:when test="${empty id }">
					<a class="btn btn-outline-primary btn-sm me-2" href="${pageContext.request.contextPath}/users/signup_form.jsp">회원가입</a>
					<a class="btn btn-outline-success btn-sm me-2" href="${pageContext.request.contextPath}/users/loginform.jsp">로그인</a>
				</c:when>
				<c:otherwise>
					<span class="navbar-text me-2"> <a
						href="${pageContext.request.contextPath}/users/private/info.jsp">${id }</a>
						로그인중...
					</span>
					<a class="btn btn-outline-danger btn-sm me-2"
						href="${pageContext.request.contextPath}/users/logout.jsp">로그아웃</a>
				</c:otherwise>
			</c:choose>
		</div>
	</div>
</nav>