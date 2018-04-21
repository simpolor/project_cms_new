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
<title>Admin Member List</title>
</head>
<body>
	Admin Member List
	
	memberTotalCount : ${memberTotalCount} <br />
	memberTotalList <br />
	<c:choose>
		<c:when test="${! empty memberList}">
			<c:forEach var="member" items="${memberList}">
		 		${member.member_id} | ${member.member_name} | ${member.member_nickname} | ${member.member_email}  
			</c:forEach>
		</c:when>
		<c:otherwise>
	 		회원 없음
		</c:otherwise>
	</c:choose>
	
</body>
</html>