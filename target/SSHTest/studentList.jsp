<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <title>首页</title>
</head>
<body>
<h2>Hello World!</h2>

<table border="1">
    <tr>
        <td>姓名</td>
        <td>科目</td>
        <td>成绩</td>
        <td>操作</td>
    </tr>
    <c:forEach var="student" items="${students}">
        <tr>
            <td>${student.name}</td>
            <td>${student.subject}</td>
            <td>${student.score}</td>
            <td><a href="${pageContext.request.contextPath}/saveStudentUI">增加</a> </td>
            <td><a href="${pageContext.request.contextPath}/delStudent?id=${student.id}">删除</a>
            <td><a href="${pageContext.request.contextPath}/updateStudentUI?id=${student.id}">更新</a>
            </td>
        </tr>
    </c:forEach>

</table>

<a href="${pageContext.request.contextPath}/countById">所有科目总分最高者</a><br>
<a href="${pageContext.request.contextPath}/maxCountById">分数最高者</a><br>
</body>
</html>
