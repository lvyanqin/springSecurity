<%-- 
    Document   : user
    Created on : 2017-4-27, 17:33:16
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="${pageContext.request.contextPath}/user/test" method="post">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
            <input name="id" value="48"/>
            <input type="submit" value="post"/>
        </form>
            <hr/>
        <form action="${pageContext.request.contextPath}/user/test2/333" method="post">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
            <input name="id" value="48"/>
            <input type="submit" value="post"/>
        </form>
    </body>
</html>
