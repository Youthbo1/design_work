<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    //response.sendRedirect("/1.jsp");${pageContext.request.contextPath}/index
    //request.getRequestDispatcher("1.jsp").forward(request,response);
%>
<a href="${pageContext.request.contextPath}/index" > 查看全部用户信息</a></p>
</body>
</html>
