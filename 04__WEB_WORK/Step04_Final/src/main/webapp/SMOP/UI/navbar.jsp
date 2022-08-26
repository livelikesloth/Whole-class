<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<nav class ="navbar navbar-light bg-light navbar-expand-lg">
	<div class="container-fluid">
		<a class="navbar-brand" href="${pageContext.request.contextPath}/SMOP">
			<img src="/icon.png" alt="" width="30" height="24" class="d-inline-block aligh-text-top">SMOP!
		</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav me-auto">
			<li class="nav-item">
					<a class="nav-link ${param.thisPage eq 'MAIN' ? 'active' :'' }  href="${pageContext.request.contextPath}/index.jsp">MAIN!</a>
				</li>
				<li class="nav-item">
					<a class="nav-link ${param.thisPage eq 'SMOP' ? 'active' :'' }  href="${pageContext.request.contextPath}/file/gallery.jsp">SMOP!</a>
				</li>
			</ul>
		</div>
	</div>
</nav>