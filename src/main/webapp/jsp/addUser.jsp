<%-- 
    Document   : addUser
    Created on : May 7, 2019, 7:42:07 PM
    Author     : user
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Title</title>
        <link href="../css/styles.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <div class="form-style-2">
            <div class="form-style-2-heading">
            Please add user
        </div>
    </body>
    <form method="post" action="/adduser">
        <label for="first-name">First Name
            <input class="input-field" type="text" id="first-name" name="first-name">
        </label>
        <input type ="submit" value="Add user" >
            
    </form>
</div>
</body>
</html>
