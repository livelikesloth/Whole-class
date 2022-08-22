<%@page import="test.member.dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	//1. get 방식 파라미터로 전달되는 삭제할 회원의 번호를 읽어온다.
	int num=Integer.parseInt(request.getParameter("num"));
	//2. DB 해서 해당 회원의 정보를 삭제한다.
	boolean isSuccess=MemberDao.getInstance().delete(num);
	//3. 응답한다.
	
	
	//컨텍스트 경로
	String cPath = request.getContextPath();
	//아래의 경로로 리다이렉트 이동시킨다. (요청을 다시 하라고 강요)
	//리다이렉트 이동시키는것 자체가 응답이다.
	response.sendRedirect(cPath+"/member/list.jsp");
%>

