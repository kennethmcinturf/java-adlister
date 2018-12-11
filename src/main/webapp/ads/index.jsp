<%--
  Created by IntelliJ IDEA.
  User: kennethmcinturf
  Date: 12/11/18
  Time: 2:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Show Ads Page</title>
</head>
<body>
    <h1>Heres some ads Yo</h1>
    <c:forEach var="ad" items="${ads}">
        <div class="ad">
            <h3>${ad.title}</h3>
            <p>${ad.description}</p>
        </div>
    </c:forEach>


</body>
</html>
