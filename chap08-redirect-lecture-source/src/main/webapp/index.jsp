<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
    <%-- h1[align="center"]{redirect} 에밋 문법? --%>
    <h1 align="center">redirect</h1>
    <%-- ul>(li>a)*2 --%>
    <ul>
        <li><a href="othersite">다른 웹 사이트로 redirect 테스트</a></li>
        <li><a href="otherservlet">다른 서블릿으로 redirect 테스트</a></li>
    </ul>
</body>
</html>