<%--
  Created by IntelliJ IDEA.
  User: SherryWong
  Date: 2016/11/27
  Time: 22:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta charset="utf-8">
    <meta name="author" content="Sherry Wong">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>登录</title>

    <!-- Bootstrap -->
    <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css">
    <!-- Custom styles for this template -->
    <link href="<%=request.getContextPath()%>/css/signin.css" rel="stylesheet">
</head>

<body>

<div class="container">

    <form:form class="form-signin" role="form">
        <h2 class="form-signin-heading">Please sign in</h2>
        <input type="text" class="form-control" name="userName" id="userName" placeholder="Username" required autofocus>
        <input type="password" class="form-control" name="password" id="password" placeholder="Password" required>

        <div class="checkbox">
            身份：
            <label><input type="radio"  name="userType" value="admin" checked> 管理员</label>
            <label><input type="radio"  name="userType" value="student"> 学生</label>
            <label><input type="radio"  name="userType" value="teacher"> 教师</label>

        </div>
        <div class="checkbox">
            <label>
                <input type="checkbox" value="remember-me"> 记住我
            </label>
        </div>
        <div id="feedback"></div>
        <button class="btn btn-lg btn-primary btn-block" type="button" onclick="checkUser()">Sign in</button>
        <div id="msg-success" class="alert alert-success" role="alert" style="display: none">登录成功</div>
        <div id="msg-warning" class="alert alert-warning" role="alert" style="display: none">用户名或密码错误</div>
        <div id="msg-danger" class="alert alert-danger" role="alert" style="display: none">发生错误</div>
    </form:form>

</div> <!-- /container -->

<!-- Bootstrap core JavaScript
================================================== -->
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>

<script>
    function checkUser() {
        var userType=$("input[name='userType']:checked").val();
        var user={};
        user["userName"]=$("#userName").val();
        user["password"]=$("#password").val();

        $.ajax({
                    url: "/login/checkUser/"+userType,
                    type: "POST",
                    dataType:"json",
                    contentType: "application/json",
                    data: JSON.stringify(user),
                    success: function (data) {
                        if(data.code==200){
                            $("#msg-warning").hide(10);
                            $("#msg-danger").hide(10);
                            $("#msg-success").show(100);
                            window.setTimeout("location.href='/admin'",2000);
                        }else {
                            $("#msg-success").hide(10);
                            $("#msg-danger").hide(10);
                            $("#msg-warning").show(100);
                        }
                    },
                    error:function (e) {
                        $("#msg-success").hide(10);
                        $("#msg-warning").hide(10);
                        $("#msg-danger").show(100);
                    }

                }
        );
    }

</script>

</body>
</html>

