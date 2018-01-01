<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/1
  Time: 23:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>跳一跳小游戏</title>
    <link rel="stylesheet" href="lib/bootstrap-3.3.7-dist/css/bootstrap.min.css">
    <script src="lib/2.2.4/jquery-1.12.4.min.js"></script>
    <script src="lib/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="page-header">
            <h1>管理系统
                <small>用户数据管理中心</small>
            </h1>
            <br><h4>小组：孙会钧 范一博 倪雨轩 叶敬伟 </h4>
        </div>
    </div>
    <div class="row">
        <div class="jumbotron">
            <p><a class="btn btn-primary btn-lg" href="${pageContext.request.contextPath}/addusers.jsp" role="button">新增用户</a>
            </p>
            <br><br><br>
            <p><a class="btn btn-primary btn-lg" href="${pageContext.request.contextPath}/index" role="button">
                查看全部用户信息</a></p>
            <p><a class="btn btn-primary btn-lg" href="${pageContext.request.contextPath}/game" role="button"> game</a>
            </p>
        </div>
    </div>

    <c:forEach var="arr" items="${arr}">
    <div class="panel panel-success"><h4>${arr} </h4></div>

    </c:forEach>
    <%--<c:set var="s" value="${s}"></c:set>--%>
</body>
</html>
