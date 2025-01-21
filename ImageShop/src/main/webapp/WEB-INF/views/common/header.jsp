<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>메인페이지</title>
    <link rel="stylesheet" href="/css/main.css" />
    <script type="text/javascript" src="/js/main.js"></script>
    <script src="https://kit.fontawesome.com/01ba7af47f.js" crossorigin="anonymous"></script>
</head>
<body>
<header>
    <div class="header-logo">
			 <a href="#"><i class="fa-solid fa-house"></i>Main</a>
		</div>
    <ul class="header-menu">
			<li class="dropdown"><a href="#" class="dropbtn">페이지소개</a>
				<div class="dropdown-content">
					<a href="https://github.com/Pyoggit" target="_blank">제작자</a> <a href="https://github.com/Pyoggit" target="_blank">기여한사람들</a> <a href="#">참고문서</a>
				</div></li>
			<li class="dropdown"><a href="#" class="dropbtn">구매/판매</a>
				<div class="dropdown-content">
					<a href="#">상품등록하기</a>
				</div></li>
			<li class="dropdown"><a href="#" class="dropbtn">상품</a>
				<div class="dropdown-content">
					<a href="#">도서</a> <a href="#">의류</a> <a href="#">식품</a> <a href="#">전자제품</a> <a href="#">주류</a>
				</div></li>
			<li class="dropdown"><a href="#" class="dropbtn">커뮤니티</a>
				<div class="dropdown-content">
					<a href="#">공지사항</a> <a href="#">자유게시판</a> <a href="#">상품후기</a>
				</div></li>
			<li class="dropdown"><a href="#" class="dropbtn">고객지원</a>
				<div class="dropdown-content">
					<a href="#">문의글목록</a> <a href="#">문의하기(Q&A)</a>
				</div>
			</li>
		</ul>
    <ul class="header-icons">
        <%-- <% if (user != null) { --%>
            <%-- <li><strong><%= user.getName() %></strong>님, 환영합니다!</li> --%>
        <%-- } else { %> --%>
            <li><a href="#" class="start-btn">시작하기</a></li>
        <%-- } --%>
    </ul>
</header>

<!-- Section 부분 -->
	<section onload="carousel();">
		<div class="slideshow">
			<div class="slideshow_slides">
				<a href="#"><img
					src="${pageContext.request.contextPath}/image/slide-1.jpg" /></a> <a
					href="#"><img
					src="${pageContext.request.contextPath}/image/slide-2.jpg" /></a> <a
					href="#"><img
					src="${pageContext.request.contextPath}/image/slide-3.jpg" /></a> <a
					href="#"><img
					src="${pageContext.request.contextPath}/image/slide-4.jpg" /></a>
			</div>
			<div class="slideshow_nav">
				<a href="#" class="prev"><i
					class="fa-solid fa-circle-chevron-left"></i></a> <a href="#"
					class="next"><i class="fa-solid fa-circle-chevron-right"></i></a>
			</div>
			<div class="slideshow_indicator">
				<a href="#"><i class="fa-regular fa-circle-dot"></i></a> <a href="#"><i
					class="fa-regular fa-circle-dot"></i></a> <a href="#"><i
					class="fa-regular fa-circle-dot"></i></a> <a href="#"><i
					class="fa-regular fa-circle-dot"></i></a>
			</div>
		</div>
	</section>
<hr>
