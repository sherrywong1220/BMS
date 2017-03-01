<%--
  Created by IntelliJ IDEA.
  User: SherryWong
  Date: 2016/12/6
  Time: 19:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,initial-scale=1.0,maximum-scale=1.0,user-scalable=no">
    <title>添加借阅证</title>
    <meta name="description" content="">
    <meta name="keywords" content="">
    <!-- Bootstrap -->
    <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css">
    <link href="" rel="stylesheet">
</head>
<body>
<div class="container">
    <h1>借阅证管理-添加借阅证</h1>
    <hr/>
    <form:form action="/admin/cards/addP" method="post" commandName="card" role="form">
        <div class="form-group>">
            <label for="cardNum">卡号：</label>
            <input type="text" class="form-control" id="cardNum" name="cardNum" placeholder="请输入卡号:"/>
        </div>
        <div class="form-group">
            <label for="cardPwd">密码：</label>
            <input type="password" class="form-control" id="cardPwd" name="cardPwd" placeholder="请输入密码:"/>
        </div>
        <div class="form-group">
            <label for="name">姓名：</label>
            <input type="text" class="form-control" id="name" name="name" placeholder="请输入姓名："/>
        </div>
        <div class="form-group">
            <label for="identity.identityId">身份：</label>
            <select class="form-control" id="identity.identityId" name="identity.identityId">
                <c:forEach items="${identityList}" var="identity">
                    <option value="${identity.identityId}">${identity.identityName}</option>
                </c:forEach>
            </select>
        </div>
        <input type="hidden" id="bookNum" name="bookNum" value="0"/>

        <input type="hidden" id="maxNum" name="maxNum" value="10"/>


        <div class="form-group">
            <button type="submit" id="btn" class="btn btn-sm btn-success">提交</button>
        </div>
    </form:form>
</div>


<!-- Bootstrap core JavaScript
================================================== -->
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>

<script>
    $(document).ready(function () {
        $("#btn").click( function () {

            if ($("option:selected").val() == "1") {
                $("#maxNum").val("10");
            } else if ($("option:selected").val() == "2") {
                $("#maxNum").val("20");
            } else {
                $("#maxNum").val("30");
            }
        });
    });

</script>

</body>
</html>
