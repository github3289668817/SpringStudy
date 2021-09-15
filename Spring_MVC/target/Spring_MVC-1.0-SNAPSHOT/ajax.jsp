<%--
  Created by IntelliJ IDEA.
  User: Valen
  Date: 2021/9/15
  Time: 13:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"  language="java" isELIgnored="false"%>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/js/jquery-3.6.0.js"></script>
    <script>
        var userList = new Array();
        userList.push({username:"熊某人",age:25});
        userList.push({username:"傅某人",age:25});
        $.ajax({
            type:"post",
            url:"${pageContext.request.contextPath}/user5",
            data:JSON.stringify(userList),
            contentType:"application/json;charset=utf-8"
        });
    </script>
</head>
<body>

</body>
</html>
