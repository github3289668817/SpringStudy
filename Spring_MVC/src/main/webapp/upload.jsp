<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/user10" method="post" enctype="multipart/form-data">
        名称:<input type="text" name="username"><br/>
        文件:<input type="file" name="upload"><br/>
        <input type="submit" value="提交">
    </form>

    <form action="${pageContext.request.contextPath}/user11" method="post" enctype="multipart/form-data">
        名称:<input type="text" name="username"><br/>
        文件1:<input type="file" name="upload1"><br/>
        文件2:<input type="file" name="upload2"><br/>
        <input type="submit" value="提交">
    </form>

    <form action="${pageContext.request.contextPath}/user12" method="post" enctype="multipart/form-data">
        名称:<input type="text" name="username"><br/>
        文件1:<input type="file" name="uploads"><br/>
        文件2:<input type="file" name="uploads"><br/>
        <input type="submit" value="提交">
    </form>


</body>
</html>
