<%--
  Created by IntelliJ IDEA.
  User: OREST
  Date: 13-May-19
  Time: 22:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Author</title>
</head>
<body>
<form action="/oorextension/authors/show" method="post">
    <table style="with: 50%">
        <tr>
            <td>First Name</td>
            <td><label>
                <input type="text" name="firstName" />
            </label></td>
        </tr>
        <tr>
            <td>Last Name</td>
            <td><label>
                <input type="text" name="lastName" />
            </label></td>
        </tr>
        <tr>
            <td>Writing Style</td>
            <td><label for="genre"><select id="genre" name="genre">
                <option value="HORROR">HORROR</option>
                <option value="MYSTERY">MYSTERY</option>
                <option value="FANTASY">FANTASY</option>
                <option value="ROMANCE">ROMANCE</option>
                <option value="MATH">MATH</option>
            </select></label></td>
        </tr>
        </table>
    <input type="submit" value="Submit" /></form>
</body>
</html>
