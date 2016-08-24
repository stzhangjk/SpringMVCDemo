<%--
  Created by IntelliJ IDEA.
  User: STZHANGJK
  Date: 2016/8/24
  Time: 12:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>注册</title>
</head>
<body>
<!-- register.jsp 注册展示页面-->
<form method="post">
    username:<input type="text" name="username" placeholder="${user.username}"><br/>
    password:<input type="password" name="password" placeholder="${user.password}"><br/>
    password:<input type="password" name="pswConfirm" placeholder="${user.pswConfirm}"><br/>
    city:<select name="city">
            <c:forEach items="${cityList}" var="city">
                <option>${city}</option>
            </c:forEach>
        </select><br/>
    <input type="submit" value="注册"/>
</form>
</body>
</html>
