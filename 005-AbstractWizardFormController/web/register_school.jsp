
<%--
  Created by IntelliJ IDEA.
  User: STZHANGJK
  Date: 2016/8/24
  Time: 21:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>注册：教育信息</title>
</head>
<body>
<form method="post">
    学校类型：<select name="schoolInfo.schoolType">
    <c:forEach items="${schoolTypeList }" var="schoolType">
        <option value="${schoolType }"
                <c:if test="${user.schoolInfo.schoolType eq schoolType}">
                    selected="selected"
                </c:if>
        >
                ${schoolType}
        </option>
    </c:forEach>
</select><br/>
    学校名称：<input type="text" name="schoolInfo.schoolName" value="${user.schoolInfo.schoolName}"/><br/>
    专业：<input type="text" name="schoolInfo.specialty" value="${user.schoolInfo.specialty}"/><br/>
    <input type="submit" name="_target0" value="上一步"/>
    <input type="submit" name="_target2" value="下一步"/>
</form>
</body>
</html>
