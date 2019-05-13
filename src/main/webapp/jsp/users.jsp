<%-- 
    Document   : users
    Created on : May 7, 2019, 7:42:27 PM
    Author     : user
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Title</title>
        <link href="../css/styles.css" rel="stylesheet" type="text/css">

    </head>
    <body>
        <div class="form-style-2">
            <div class="form-style-2-heading">
                Already registered!
            </div>
            <table>
                <tr>
                <tn>First Name</tn>                 
                </tr>
                <c:forEach items="${userFromServer}" var="user">
                    <tr>
                        <td>${user.firstName}</td>
                    </tr>
                </c:forEach>
            </table>
        </div>


    </body>
</html>
