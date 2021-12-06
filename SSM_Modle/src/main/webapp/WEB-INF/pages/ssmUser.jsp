<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<table>
  <tr>
    <td>ID</td>
    <td>姓名</td>
    <td>密码</td>
  </tr>
  <tr>
    <td>${user.id}</td>
    <td>${user.userName}</td>
    <td>${user.passWord}</td>
  </tr>


<%--  <c:forEach items="${user}" var="person">--%>
<%--    <tr>--%>
<%--      <td>${person.personId}</td>--%>
<%--      <td>${person.personName}</td>--%>
<%--      <td>${person.personAge}</td>--%>
<%--    </tr>--%>
<%--  </c:forEach>--%>
</table>
</body>
</html>