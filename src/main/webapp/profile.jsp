<%--
  Created by IntelliJ IDEA.
  User: kennethmcinturf
  Date: 12/10/18
  Time: 7:01 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<%@include file="partials/headExcercise.html"%>
<jsp:include page="partials/headExcercise.html">
    <jsp:param name="title" value="Profiles"/>
</jsp:include>
<body>
<%@include file="partials/navBar.html"%>
<h1>Here's those Profiles you wanted</h1>

<%@include file="partials/footer.html"%>
</body>
</html>
