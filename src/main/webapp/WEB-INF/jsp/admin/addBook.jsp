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
    <title>添加书籍</title>
    <meta name="description" content="">
    <meta name="keywords" content="">
    <!-- Bootstrap -->
    <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css">
    <link href="" rel="stylesheet">
</head>
<body>
<div class="container">
    <h1>图书管理-添加图书</h1>
    <hr/>
    <form:form action="/admin/books/addP" method="post" commandName="book" role="form">
        <div class="form-group>">
            <label for="bookName">图书名：</label>
            <input type="text" class="form-control" id="bookName" name="bookName" placeholder="请输入图书名:"/>
        </div>
        <div class="form-group">
            <label for="writer">作者：</label>
            <input type="text" class="form-control" id="writer" name="writer" placeholder="请输入作者:"/>
        </div>
        <div class="form-group">
            <label for="callNumber">索书号：</label>
            <input type="text" class="form-control" id="callNumber" name="callNumber" placeholder="请输入索书号："/>
        </div>
        <div class="form-group">
            <label for="type.sortId">图书类别：</label>
            <select class="form-control" id="type.sortId" name="type.sortId">
                <c:forEach items="${typeList}" var="type">
                    <option value="${type.sortId}">${type.sortName}</option>
                </c:forEach>
            </select>
        </div>
        <div class="form-group">
            <label for="price">图书价格：</label>
            <input type="text" class="form-control" id="price" name="price" placeholder="请输入图书价格："/>
        </div>
        <div class="form-group">
            <label for="price">出版社：</label>
            <input type="text" class="form-control" id="pubCompany" name="pubCompany" placeholder="请输入出版社："/>
        </div>
        <div class="form-group">
            <label for="price">出版日期：</label>
            <input type="date" class="form-control" id="pubDate" name="pubDate" placeholder="请输入出版日期：2016/01/01"/>
        </div>
        <div class="form-group">
            <label for="price">馆藏总数：</label>
            <input type="text" class="form-control" id="totalNum" name="totalNum" placeholder="请输入馆藏总数："/>
        </div>
        <div class="form-group">
            <label for="price">在馆数：</label>
            <input type="text" class="form-control" id="currentNum" name="currentNum" placeholder="请输入在馆数："/>
        </div>
        <div class="form-group">
            <label for="price">图书简介：</label>
            <textarea class="form-control" id="brief" name="brief" rows="3" placeholder="请输入图书简介："></textarea>
        </div>
        <div class="form-group">
            <button type="submit" class="btn btn-sm btn-success">提交</button>
        </div>
    </form:form>
</div>


<!-- Bootstrap core JavaScript
================================================== -->
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
</body>
</html>
