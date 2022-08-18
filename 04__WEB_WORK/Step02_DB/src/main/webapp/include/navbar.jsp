<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--
	/include.navbar.jsp
--%>
<%
	//이 navbar.jsp 페이지가 어디에 include 되었는지 읽어오기
	String thisPage=request.getParameter("thisPage"); //"index" | "member" | "todo"
%>
	<!-- bootstrap 네비바 -->
	<!-- navbar-expand-sm  : width 576px 이상에서 네비요소 펼치기 -->
	<!-- navbar-expand-md  : width 758px 이상에서 네비요소 펼치기 -->
	<!-- navbar-expand-lg  : width 992px 이상에서 네비요소 펼치기 -->
<nav class="navbar bg-light navbar-expand-sm">
  <div class="container">
    <a class="navbar-brand" href="${pageContext.request.contextPath }/">
      <img src="https://getbootstrap.com/docs/5.2/assets/brand/bootstrap-logo.svg" alt="" width="30" height="24" class="d-inline-block align-text-top">
      Acor
    </a>
    <!-- 
    	화면의 폭이 좁아지면 나오는 버튼
    	#navbar 는 id가 navbarNav인 요소를 접었다 폈다 한다는 의미
     -->
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
       <ul class="navbar-nav">
          <li class="nav-item">
             <a class="nav-link <%if(thisPage.equals("member")){%>active<%}%>" href="${pageContext.request.contextPath}/member/list.jsp">회원목록</a>
          </li>
          <li class="nav-item">
             <a class="nav-link <%=thisPage.equals("todo") ? "active" : "" %>"   href="${pageContext.request.contextPath}/todo/list.jsp">할일목록</a>
          </li>
       </ul>
    </div>
  </div>
</nav>

<nav class="navbar bg-primary navbar-expand-sm">
  <div class="container">
    <a class="navbar-brand" href="${pageContext.request.contextPath }/">
      <img src="https://getbootstrap.com/docs/5.2/assets/brand/bootstrap-logo.svg" alt="" width="30" height="24" class="d-inline-block align-text-top">
      Acor
    </a>
    <!-- 
    	화면의 폭이 좁아지면 나오는 버튼
    	#navbar 는 id가 navbarNav인 요소를 접었다 폈다 한다는 의미
     -->
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
       <ul class="navbar-nav">
          <li class="nav-item">
             <a class="nav-link <%if(thisPage.equals("member")){%>active<%}%>" href="${pageContext.request.contextPath}/member/list.jsp">회원목록</a>
          </li>
          <li class="nav-item">
             <a class="nav-link <%=thisPage.equals("todo") ? "active" : "" %>"   href="${pageContext.request.contextPath}/todo/list.jsp">할일목록</a>
          </li>
       </ul>
    </div>
  </div>
</nav>


<nav class="navbar navbar-dark navbar-expand-sm" style="background-color : green;">
  <div class="container">
    <a class="navbar-brand" href="${pageContext.request.contextPath }/">
      <img src="https://getbootstrap.com/docs/5.2/assets/brand/bootstrap-logo.svg" alt="" width="30" height="24" class="d-inline-block align-text-top">
      두부
    </a>
    <!-- 
    	화면의 폭이 좁아지면 나오는 버튼
    	#navbar 는 id가 navbarNav인 요소를 접었다 폈다 한다는 의미
     -->
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
       <ul class="navbar-nav">
          <li class="nav-item">
             <a class="nav-link <%if(thisPage.equals("member")){%>active<%}%>" href="${pageContext.request.contextPath}/member/list.jsp">회원목록</a>
          </li>
          <li class="nav-item">
             <a class="nav-link <%=thisPage.equals("todo") ? "active" : "" %>"   href="${pageContext.request.contextPath}/todo/list.jsp">할일목록</a>
          </li>
       </ul>
    </div>
  </div>
</nav>
