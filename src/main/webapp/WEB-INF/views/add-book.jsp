<%--
  Created by IntelliJ IDEA.
  User: Soly
  Date: 11/1/2026
  Time: 3:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>add book</title>
</head>
<body>

<form method="post" action="/Campus_Library_Manager_war/books/add">
    <label>Title
    <input type="text" name="title">
    </label>

    <label>Pages
    <input type="number" name="pages">
    </label>

    <label>Author
    <select name="authorId">
        <c:forEach var="author" items="${authors}">
            <option value="${author.id}">${author.name}</option>
        </c:forEach>
    </select>
    </label>


    <button type="submit">Submit</button>

</form>

</body>
</html>
