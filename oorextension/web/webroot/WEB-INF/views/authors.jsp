<%--
  Created by IntelliJ IDEA.
  User: OREST
  Date: 12-May-19
  Time: 13:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>All Authors</title>
</head>

<body>
<div align="center">
    <c:if test="${not empty authors}">
        <table border="1" cellpadding="5">
            <caption><h2>List of Authors</h2></caption>
            <tr>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Writing Style</th>
            </tr>
            <c:forEach var="author" items="${authors}">
                <tr>
                    <td><c:out value="${author.firstName}"/></td>
                    <td><c:out value="${author.lastName}"/></td>
                    <td><c:out value="${author.genre}"/></td>
                </tr>
            </c:forEach>
        </table>
    </c:if>
</div>
</body>
</html>
