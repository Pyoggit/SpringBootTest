<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>메인페이지</title>
<link rel="stylesheet" href="/css/header.css" />
<script type="text/javascript" src="/js/main.js"></script>
<script src="https://kit.fontawesome.com/01ba7af47f.js" crossorigin="anonymous"></script>
</head>
<body>
	<header>
		<div class="header-logo">
			<a href="/"><i class="fa-solid fa-house"></i>Main</a>
		</div>
		<ul class="header-menu">
			<li class="dropdown"><a href="#" class="dropbtn">페이지소개</a>
				<div class="dropdown-content">
					<a href="https://github.com/Pyoggit" target="_blank">제작자</a> <a href="https://github.com/Pyoggit" target="_blank">기여한사람들</a> <a href="#">참고문서</a>
				</div></li>
			<li class="dropdown"><a href="/" class="dropbtn">회원관리</a>
				<div class="dropdown-content">
					<a href="/codegroup/list">코드그룹목록</a><a href="/codedetail/list">코드관리</a><a href="/user/list">회원목록</a>
				</div></li>
			<li class="dropdown"><a href="/" class="dropbtn">상품</a>
				<div class="dropdown-content">
					<a href="/">도서</a> <a href="/">의류</a> <a href="/">식품</a> <a href="/">전자제품</a> <a href="/">주류</a>
				</div></li>
			<li class="dropdown"><a href="/" class="dropbtn">공지사항</a>
				<div class="dropdown-content">
					<a href="/">공지사항</a> <a href="/">자유게시판</a> <a href="/">상품후기</a>
				</div></li>
			<li class="dropdown"><a href="/" class="dropbtn">공개자료실</a>
				<div class="dropdown-content">
					<a href="/">문의글목록</a> <a href="/">문의하기(Q&A)</a>
				</div></li>
		</ul>
		<div class="header-icons">
			<table>
				<tr>
					<!-- 로그인을 하지 않은 경우 로그인 페이지로 이동할 수 있게 한다. -->
					<sec:authorize access="!isAuthenticated()">
						<a href="/user/register" class="start-btn"><spring:message code="header.joinMember" /></a>
						<!-- 로그인을 메뉴에 추가한다. -->
						<a href="/auth/login"><spring:message code="header.login" /></a>
					</sec:authorize>
					<!-- 로그인을 거친 인증된 사용자인 경우 사용자명을 보여주고 로그아웃 페이지로 이동할 수 있게 한다. -->
					<sec:authorize access="isAuthenticated()">
						<td width="180"><sec:authentication property="principal.username" /> 님 <a href="/auth/logout"> <spring:message code="header.logout" /></a></td>
					</sec:authorize>
				</tr>
			</table>
		</div>

		<%-- <ul class="header-icons">
        <% if (user != null) {
            <li><strong><%= user.getName() %></strong>님, 환영합니다!</li>
        } else { %>
            <li><a href="/user/register" class="start-btn">시작하기</a></li>
        }
    </ul> --%>
	</header>

	<!-- Section 부분 -->
	<section onload="carousel();">
		<div class="slideshow">
			<div class="slideshow_slides">
				<a href="#"><img src="${pageContext.request.contextPath}/image/slide-1.jpg" /></a> <a href="#"><img src="${pageContext.request.contextPath}/image/slide-2.jpg" /></a> <a href="#"><img
					src="${pageContext.request.contextPath}/image/slide-3.jpg" /></a> <a href="#"><img src="${pageContext.request.contextPath}/image/slide-4.jpg" /></a>
			</div>
			<div class="slideshow_nav">
				<a href="#" class="prev"><i class="fa-solid fa-circle-chevron-left"></i></a> <a href="#" class="next"><i class="fa-solid fa-circle-chevron-right"></i></a>
			</div>
			<div class="slideshow_indicator">
				<a href="#"><i class="fa-regular fa-circle-dot"></i></a> <a href="#"><i class="fa-regular fa-circle-dot"></i></a> <a href="#"><i class="fa-regular fa-circle-dot"></i></a> <a href="#"><i
					class="fa-regular fa-circle-dot"></i></a>
			</div>
		</div>
	</section>