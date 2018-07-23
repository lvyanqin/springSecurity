<%-- 
    Document   : login
    Created on : 2017-4-25, 14:11:21
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
        <form action="${pageContext.request.contextPath}/login" method="post">
            User:<input type='text' name='username' value=''>
            Password:<input type='password' name='password'/>
            <label class="g-input-checkbox"><input type="checkbox" name="isRemeberMe" value="1">记住账号</label>
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
            <input type="submit" value="登录"/>
        </form>
    </body>
</html>
