<%@page import="test.member.dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	//1. get 방식 파라미터로 전달되는 삭제할 회원의 번호를 읽어온다.
	int num=Integer.parseInt(request.getParameter("num"));
	//2. DB 해서 해당 회원의 정보를 삭제한다.
	boolean isSuccess=MemberDao.getInstance().delete(num);
	//3. 응답한다.
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>delete.jsp</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
</head>
<body>
	<script>
	if(<%=isSuccess%>==true){
		alert("삭제되었습니다.");
	    location.href="../member/list.jsp";
	}else{
		alert("실패했습니다.");
	    history.go(-1);
	}
	</script>
	<jsp:include page="/include/footer.jsp"></jsp:include>
</body>
</html>
