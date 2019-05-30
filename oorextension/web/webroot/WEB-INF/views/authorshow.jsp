<%--
  Created by IntelliJ IDEA.
  User: OREST
  Date: 13-May-19
  Time: 22:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Author</title>
</head>
<body>
<div align="center">
    <c:if test="${not empty author}">
        <table border="1" cellpadding="5">
            <caption><h2>Saved Author</h2></caption>
            <tr>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Writing Style</th>
            </tr>
                <tr>
                    <td><c:out value="${author.firstName}"/></td>
                    <td><c:out value="${author.lastName}"/></td>
                    <td><c:out value="${author.genre}"/></td>
                </tr>
        </table>
    </c:if>
</div>
</body>
</html>
