<%--
  Created by IntelliJ IDEA.
  User: kennethmcinturf
  Date: 12/11/18
  Time: 10:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container">
    <h1>Put Your Fav color</h1>
    <form action="showColor.jsp" method="POST">
        <div class="form-group">
            <label for="color">FAVORITE COLOR</label>
            <input id="color" name="color" class="form-control" type="text">
        </div>
        <input type="submit" class="btn btn-primary btn-block" value="Submit">
    </form>

</div>

</body>
</html>
