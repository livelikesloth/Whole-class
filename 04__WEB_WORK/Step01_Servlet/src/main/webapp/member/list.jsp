<%@page import="java.util.ArrayList"%>
<%@page import="test.dto.MemberDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
List<MemberDto> list = new ArrayList<>();
list.add(new MemberDto(1, "두부", "페어펙스"));
list.add(new MemberDto(2, "유키", "하이데저트"));
list.add(new MemberDto(3, "소주", "리치몬드"));
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
</head>
<body>
	<table class="table">
		<thead>
			<tr>
				<th>번호</th>
				<th>이름</th>
				<th>주소</th>
			</tr>
		</thead>
		<tbody>
			<%for (MemberDto tmp : list) {%>
			<tr>
				<td><%=tmp.getNum()%></td>
				<td><%=tmp.getName()%></td>
				<td><%=tmp.getAddr()%></td>
			</tr>
			<%}%>
		</tbody>
	</table>
</body>
</html>