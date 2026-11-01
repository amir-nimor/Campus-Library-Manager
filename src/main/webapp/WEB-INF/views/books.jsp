<%--
  Created by IntelliJ IDEA.
  User: Soly
  Date: 11/1/2026
  Time: 3:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>${LibraryName}</title>
</head>
<body>

<c:forEach var="book" items="${bookList}">
    <h3>${book.title} - ${book.pages} - ${book.authorId} <a href="books/detail?id=${book.id}">detail</a></h3>
</c:forEach>


<a href="books/add">add book</a><br>
<a href="authors">authors</a><br>

</body>
</html>
