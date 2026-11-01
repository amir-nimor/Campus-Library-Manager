<%--
  Created by IntelliJ IDEA.
  User: Soly
  Date: 11/1/2026
  Time: 3:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>authors</title>
</head>
<body>


<c:forEach var="authors" items="${authors}">
    <h3>${authors.name}</h3>
</c:forEach>

</body>
</html>
