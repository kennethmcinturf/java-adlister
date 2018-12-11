<%--
  Created by IntelliJ IDEA.
  User: kennethmcinturf
  Date: 12/11/18
  Time: 9:44 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Please Log In" />
    </jsp:include>
</head>
<body>
    <h1>Well Howdy: <%= request.getParameter("name") %></h1>

</body>
</html>
