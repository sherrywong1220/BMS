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
    <title>图书详情</title>
    <meta name="description" content="">
    <meta name="keywords" content="">
    <!-- Bootstrap -->
    <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css">
    <link href="" rel="stylesheet">
</head>
<body>
<div class="container">
    <h1>图书管理-图书详情</h1>
    <hr/>

    <table width="100%">
        <tbody>
        <tr valign="top">
            <td width="145px" style="padding-left: 20px">
                <ul class="nav nav-pills nav-stacked" style="width:120px">
                    <li role="presentation" class="active" style="width:100%"><a href="#">管理全部图书</a></li>
                    <li role="presentation" style="width:100%"><a href="#">管理全部类别</a></li>
                    <li role="presentation" style="width:100%"><a href="#">管理借阅证</a></li>
                    <li role="presentation" style="width:100%"><a href="#">管理管理员</a></li>
                    <li role="presentation" style="width:100%"><a href="#">借阅归还图书</a></li>
                    <li role="presentation" style="width:100%"><a href="#">查询借阅信息</a></li>
                </ul>
            </td>

            <td align="left" style="padding-left: 10px;padding-right: 10px">
                <table class="table table-bordered table-striped">
                    <tr>
                        <th>图书ID</th>
                        <td>${book.bookNum}</td>
                    </tr>
                    <tr>
                        <th>图书名</th>
                        <td>${book.bookName}</td>
                    </tr>
                    <tr>
                        <th>作者</th>
                        <td>${book.writer}</td>
                    </tr>
                    <tr>
                        <th>索书号</th>
                        <td>${book.callNumber}</td>
                    </tr>
                    <tr>
                        <th>分类</th>
                        <td>${book.type.sortId},${book.type.sortName}</td>
                    </tr>
                    <tr>
                        <th>价格</th>
                        <td>CNY${book.price}</td>
                    </tr>
                    <tr>
                        <th>出版社</th>
                        <td>${book.pubCompany}</td>
                    </tr>
                    <tr>
                        <th>出版时间</th>
                        <td><fmt:formatDate value="${book.pubDate}" pattern="yyyy年MM月dd日"/></td>
                    </tr>
                    <tr>
                        <th>馆藏数</th>
                        <td>${book.totalNum}</td>
                    </tr>
                    <tr>
                        <th>现有数</th>
                        <td>${book.currentNum}</td>
                    </tr>
                    <tr>
                        <th>简介</th>
                        <td>${book.brief}</td>
                    </tr>
                </table>
            </td>
        </tr>
        </tbody>
    </table>
</div>


<!-- Bootstrap core JavaScript
================================================== -->
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
</body>
</html>
