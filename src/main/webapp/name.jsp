<%--
  Created by IntelliJ IDEA.
  User: kennethmcinturf
  Date: 12/11/18
  Time: 9:34 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Please Log In" />
    </jsp:include>
<body>
    <jsp:include page="partials/navbar.jsp" />
    <div class="container">
        <h1>Enter Your First Name</h1>
        <form action="nameShowing.jsp" method="POST">
            <div class="form-group">
                <label for="name">First Name</label>
                <input id="name" name="name" class="form-control" type="text">
            </div>
            <input type="submit" class="btn btn-primary btn-block" value="Submit">
        </form>

    </div>

</body>
</html>
