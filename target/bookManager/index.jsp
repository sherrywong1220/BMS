<%--
  Created by IntelliJ IDEA.
  User: SherryWong
  Date: 2016/11/24
  Time: 20:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta charset="utf-8">
    <meta name="author" content="Sherry Wong">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>图书管理系统</title>

    <!-- Bootstrap -->
    <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css">
    <!-- Custom styles for this template -->
    <link href="<%=request.getContextPath()%>/css/cover.css" rel="stylesheet">
</head>

<body>

<div class="site-wrapper">

    <div class="site-wrapper-inner">

        <div class="cover-container">

            <div class="masthead clearfix">
                <div class="inner">
                    <h2 class="masthead-brand">图书管理系统</h2>
                    <ul class="nav masthead-nav">
                        <li class="active"><a href="start.html">主页</a></li>
                        <li><a href="#">关于我们</a></li>
                        <li><a href="#">源码下载</a></li>
                    </ul>
                </div>
            </div>

            <div class="inner cover">
                <h1 class="cover-heading">Welcome</h1>
                <p class="lead">
                    此图书管理系统由软件zy1401班四个妹子历时两周呕心历血完成。感谢解庆老师，感谢Bootstrap开源框架，感谢Goolge，感谢SSM框架，感谢武汉理工大学图书馆，感谢中国共产党。
                </p>
                <p class="lead">
                    <a href="/login" class="btn btn-lg btn-default">登录</a>
                </p>
            </div>

            <div class="mastfoot">
                <div class="inner">
                    <p>Copyright &copy; 2016 Sherry Wong All rights reserved.<a target="_blank" href="<%=request.getContextPath()%>/index.jsp">图书管理系统;</a></p>
                </div>
            </div>

        </div>

    </div>

</div>

<!-- Bootstrap core JavaScript
================================================== -->
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
</body>
</html>

