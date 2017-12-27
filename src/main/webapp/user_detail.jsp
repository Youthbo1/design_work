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
    <title>user_detail</title>
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
            <p><a class="btn btn-primary btn-lg" href="${pageContext.request.contextPath}/index" role="button"> 查看全部用户信息</a></p>
        </div>
    </div>

    <c:set var="user" value="${user}"></c:set>
    <div class="row">
        <div class="col-md-8 col-md-offset-2">
            <%--静态控件 如果需要在表单中将一行纯文本和 label 元素放置于同一行，为 <p> 元素添加 .form-control-static 类即可。--%>
            <form class="form-horizontal" action="${pageContext.request.contextPath}/updateusers">
                <input type="hidden" name="id" value="${user.id}">

                <div class="form-group">
                    <label class="col-sm-2 control-label">用户账号</label>
                    <div class="col-sm-10">
                        <p class="form-control-static">${user.username}</p>
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-2 control-label">登录密码</label>
                    <div class="col-sm-10">
                        <p class="form-control-static">********</p>
                    </div>
                </div>

                <div class="form-group">
                    <label for="nickname" class="col-sm-2 control-label">nickname</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="nickname" name="nickname" value="${user.nickname}" placeholder="Password">
                    </div>
                </div>


                <div class="form-group">
                    <label class="col-sm-2 control-label">账号创建时间</label>
                    <div class="col-sm-10">
                        <p class="form-control-static">
                            <fmt:formatDate value="${user.createTime}" pattern="yyyy-MM-dd"></fmt:formatDate>
                        </p>
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-2 control-label">最后修改时间</label>
                    <div class="col-sm-10">
                        <p class="form-control-static">
                            <fmt:formatDate value="${user.updateTime}" pattern="yyyy-MM-dd"></fmt:formatDate>
                        </p>
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-2 control-label">最后登录时间</label>
                    <div class="col-sm-10">
                        <p class="form-control-static">
                            <fmt:formatDate value="${user.lastLogin}" pattern="yyyy-MM-dd"></fmt:formatDate>
                        </p>
                    </div>
                </div>


                <div class="form-group">
                    <label class="col-sm-2 control-label">用户状态</label>
                    <div class="col-sm-10">
                        <c:if test="${user.userStatus == 0}">
                            <p class="form-control-static">正常</p>
                        </c:if>
                        <c:if test="${user.userStatus == 1}">
                            <p class="form-control-static">锁定</p>
                        </c:if>
                        <c:if test="${user.userStatus == 2}">
                            <p class="form-control-static">删除</p>
                        </c:if>
                    </div>
                </div>

                <div class="form-group">
                    <input type="submit" value="提交数据更新" class="btn btn-primary">
                </div>
            </form>
        </div>
    </div>
    <br><br>
    <div class="row">
        <table class="table table-striped">
            <tr>
                <th>地址编号</th>
                <th>国家</th>
                <th>省</th>
                <th>市</th>
                <th>县</th>
                <th>是否默认</th>
            </tr>
            <c:forEach var="addr" items="${user.addresses}">
                <tr>
                    <td>${addr.id}</td>
                    <td>${addr.nation}</td>
                    <td>${addr.province}</td>
                    <td>${addr.city}</td>
                    <td>${addr.country}</td>
                    <c:if test="${addr.defaultAddr == true}">
                        <td>默认地址</td>
                    </c:if>
                    <c:if test="${addr.defaultAddr == false}">
                        <td>--否--</td>
                    </c:if>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>
</body>
</html>
