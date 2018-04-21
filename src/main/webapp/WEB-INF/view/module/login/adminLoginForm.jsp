<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>Admin LoginForm</title>
</head>
<body>
	Admin LoginForm
	<form:form id="loginForm" modelAttribute="member" action="${pageContext.request.contextPath}/admin/login" method="post">
		<form:input path="member_id" />
		<form:password path="member_pw" />
		<form:button>로그인</form:button>
	</form:form>
</body>
</html>