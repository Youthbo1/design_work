<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>用户管理中心</title>
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
            <br><h4>小组：孙会钧  范一博 倪雨轩  叶敬伟	 </h4>
        </div>
    </div>
    <div class="row">
        <div class="jumbotron">
            <p><a class="btn btn-primary btn-lg" href="${pageContext.request.contextPath}/addusers.jsp" role="button">新增用户</a></p>
            <br><br><br>
            <p><a class="btn btn-primary btn-lg" href="${pageContext.request.contextPath}/index" role="button"> 查看全部用户信息</a></p>
        </div>
    </div>
    <div class="row">
        <table class="table table-hover table-striped">
            <tr>
                <%--6列--%>
                <th>用户编号</th>
                <th>登录账号</th>
                <th>用户昵称</th>
                <th>账号创建时间</th>
                <th>用户状态</th>
                <th>操作</th>
            </tr>
            <c:forEach var="user" items="${usersList}">
                <tr>
                    <td>${user.id}</td>
                    <td>${user.username}</td>
                    <td>${user.nickname}</td>
                    <td>
                        <fmt:formatDate value="${user.createTime}" pattern="yyyy-MM-dd HH:mm:ss"></fmt:formatDate>
                    </td>
                    <c:if test="${user.userStatus == 0}">
                        <td>正常</td>
                    </c:if>
                    <c:if test="${user.userStatus == 1}">
                        <td>锁定</td>
                    </c:if>
                    <c:if test="${user.userStatus == 2}">
                        <td>删除</td>
                    </c:if>
                    <td>
                        <%--用url传参，把ID传入进行查询--%>
                        <a href="${pageContext.request.contextPath}/user_detail?id=${user.id}">查看</a>

                        <c:if test="${user.userStatus == 0}">
                            <a href="${pageContext.request.contextPath}/deluser?id=${user.id}&type=lock">锁定</a>
                        </c:if>
                        <c:if test="${user.userStatus == 1}">
                            <a href="${pageContext.request.contextPath}/deluser?id=${user.id}&type=unlock">解锁</a>
                        </c:if>

                        <a href="${pageContext.request.contextPath}/deluser?id=${user.id}&type=del">删除</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>
</body>
</html>