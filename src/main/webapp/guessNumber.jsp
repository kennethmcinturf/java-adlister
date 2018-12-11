<%--
  Created by IntelliJ IDEA.
  User: kennethmcinturf
  Date: 12/11/18
  Time: 10:21 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container">
    <h1>Guess A Number</h1>
    <form action="numberResult.jsp" method="POST">
        <div class="form-group">
            <label for="number">Number</label>
            <input id="number" name="number" class="form-control" type="text">
        </div>
        <input type="submit" class="btn btn-primary btn-block" value="Submit">
    </form>

</div>

</body>
</html>
