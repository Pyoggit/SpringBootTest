<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<link rel="stylesheet" href="/css/auth.css">
<title>Image Shop</title>
</head>
<body>
	<jsp:include page="../common/header.jsp" />
	<main align="center">
		<h2>
			<spring:message code="auth.header.login" />
		</h2>
		<h2>
			<c:out value="${error}" />
		</h2>
		<h2>
			<c:out value="${logout}" />
		</h2>
		<form method="post" action="/login">
			<table>
				<tr>
					<td>아이디</td>
					<td><input type="text" name="username"></td>
				</tr>
				<tr>
					<td>비밀번호</td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="checkbox" name="rememberme">
					<spring:message code="auth.rememberMe" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><button>
							<spring:message code="action.login" />
						</button></td>
				</tr>
			</table>
			<sec:csrfInput />
		</form>

	</main>
	<jsp:include page="../common/footer.jsp" />
</body>
</html>