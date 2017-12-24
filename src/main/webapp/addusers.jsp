<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/24
  Time: 16:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>add_users</title>
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
        </div>
    </div>
    <div class="row">
        <div class="jumbotron">
            <p><a class="btn btn-primary btn-lg" href="${pageContext.request.contextPath}/addusers.jsp" role="button">新增用户</a>
            </p>

            <br><br><br>
            <p><a  class="btn btn-primary btn-lg" href="begin.jsp" role="button"> 查看全部用户信息</a></p>
        </div>
    </div>

    <c:set var="user" value="${user}"></c:set>
    <div class="row">
        <div class="col-md-8 col-md-offset-2">
            <%--提交给servlet /addusers--%>
            <form class="form-horizontal" action="${pageContext.request.contextPath}/addusers">

                <div class="form-group">
                    <label for="username" class="col-sm-2 control-label">用户账号</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="username" name="username" placeholder="请输入用户账号">
                    </div>
                </div>
                <div class="form-group">
                    <label for="userpass" class="col-sm-2 control-label">登录密码</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="userpass" name="userpass" placeholder="请输入登录密码">
                    </div>
                </div>
                <div class="form-group">
                    <label for="nickname" class="col-sm-2 control-label">昵称</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="nickname" name="nickname" placeholder="请输入昵称">
                    </div>
                </div>

                <div class="form-group">
                    <input type="submit" value="点击新增用户" class="btn btn-primary">
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>
