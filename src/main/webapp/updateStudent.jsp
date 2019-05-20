<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <title>updateStudent</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/updateStudent" method="post">
    姓名：<input type="text" name="name"/></br>
    科目：<input type="text" name="subject"/><br>
    分数：<input type="text" name="score"/><br>
    <input type="text" hidden name="id" value="${id}">
    <input type="submit" value="更新">
    <input type="reset" value="重置">
</form>
</body>
</html>
