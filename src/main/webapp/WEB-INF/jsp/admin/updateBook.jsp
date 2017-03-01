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
    <title>修改图书</title>
    <meta name="description" content="">
    <meta name="keywords" content="">
    <!-- Bootstrap -->
    <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css">
    <link href="" rel="stylesheet">
</head>
<body>
<div class="container">
    <h1>图书管理-修改图书</h1>
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
                <form:form action="/admin/books/updateP" method="post" commandName="bookP" role="form">
                    <div class="form-group">
                        <label for="bookName">图书名：</label>
                        <input type="text" class="form-control" id="bookName" name="bookName" placeholder="输入图书名:" value="${book.bookName}"/>
                    </div>
                    <div class="form-group">
                        <label for="writer">作者：</label>
                        <input type="text" class="form-control" id="writer" name="writer" placeholder="请输入作者：" value="${book.writer}"/>
                    </div>
                    <div class="form-group">
                        <label for="callNumber">索书号：</label>
                        <input type="text" class="form-control" id="callNumber" name="callNumber" placeholder="请输入索书号：" value="${book.callNumber}"/>
                    </div>
                    <div class="form-group">
                        <label for="type.sortId">分类：</label>
                        <select class="form-control" id="type.sortId" name="type.sortId">
                            <c:forEach items="${typeList}" var="type">
                                <c:if test="${type.sortId==book.type.sortId}">
                                    <option value="${type.sortId}" selected="selected">${type.sortId},${type.sortName}</option>
                                </c:if>
                                <c:if test="${type.sortId!=book.type.sortId}">
                                    <option value="${type.sortId}">${type.sortId},${type.sortName}</option>
                                </c:if>
                            </c:forEach>
                        </select>
                    </div>
                    <div class="form-group">
                        <label for="price">价格：</label>
                        <input type="text" class="form-control" id="price" name="price" placeholder="请输入价格：" value="${book.price}"/>
                    </div>
                    <div class="form-group">
                        <label for="pubCompany">出版社：</label>
                        <input type="text" class="form-control" id="pubCompany" name="pubCompany" placeholder="请输入出版社：" value="${book.pubCompany}"/>
                    </div>
                    <div class="form-group">
                        <label for="pubDate">出版日：</label>
                        <input type="date" class="form-control" id="pubDate" name="pubDate" value="<fmt:formatDate value="${book.pubDate}" pattern="yyyy/MM/dd"/>"/>
                    </div>
                    <div class="form-group">
                        <label for="totalNum">馆藏数：</label>
                        <input type="text" class="form-control" id="totalNum" name="totalNum" placeholder="请输入馆藏数：" value="${book.totalNum}"/>
                    </div>
                    <div class="form-group">
                        <label for="currentNum">现有数：</label>
                        <input type="text" class="form-control" id="currentNum" name="currentNum" placeholder="请输入现有数：" value="${book.currentNum}"/>
                    </div>
                    <div class="form-group">
                        <label for="brief">简介：</label>
                        <textarea class="form-control" id="brief" name="brief" rows="3" placeholder="请输入简介：">${book.brief}</textarea>
                    </div>

                    <%--把id一并写入bookP中--%>
                    <input type="hidden" id="bookNum" name="bookNum" value="${book.bookNum}"/>

                    <div class="form-group">
                        <button type="submit" class="btn btn-sm btn-success">提交</button>
                    </div>
                </form:form>
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
