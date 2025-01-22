<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Image Shop</title>
    <link rel="stylesheet" href="/css/main.css">
    <script type="text/javascript" src="/js/test.js"></script>
    <script src="https://kit.fontawesome.com/01ba7af47f.js" crossorigin="anonymous"></script>
</head>
<body>
    <jsp:include page="./common/header.jsp" />
    <jsp:include page="./common/menu.jsp" />
    <section class="main-container">
        <div class="welcome-section" align="center">
            <h1 class="welcome-title">
                <spring:message code="common.homeWelcome" />
            </h1>
            <p class="server-time">${serverTime}</p>
            <div class="cta-buttons">
                <a href="/" class="cta-btn">Shop Now</a>
                <a href="/" class="cta-btn">About Us</a>
            </div>
        </div>
        <!-- <div class="image-gallery">
            <h2 class="gallery-title">Featured Products</h2>
            <div class="gallery">
                <div class="gallery-item">
                    <img src="/images/product1.jpg" alt="Product 1">
                    <p>Product 1</p>
                </div>
                <div class="gallery-item">
                    <img src="/images/product2.jpg" alt="Product 2">
                    <p>Product 2</p>
                </div>
                <div class="gallery-item">
                    <img src="/images/product3.jpg" alt="Product 3">
                    <p>Product 3</p>
                </div>
            </div>
        </div> -->
    </section>
    <jsp:include page="./common/footer.jsp" />
</body>
</html>