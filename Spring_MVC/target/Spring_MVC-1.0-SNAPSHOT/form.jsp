<%--
  Created by IntelliJ IDEA.
  User: Valen
  Date: 2021/9/14
  Time: 17:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/user4" method="post">
<%--        表明是第几个User对象的 username age--%>
        <input type="text" name="userList[0].username"><br>
        <input type="text" name="userList[0].age"><br>
        <input type="text" name="userList[1].username"><br>
        <input type="text" name="userList[1].age"><br>
        <input type="submit" value="提交">
    </form>
</body>
</html>
