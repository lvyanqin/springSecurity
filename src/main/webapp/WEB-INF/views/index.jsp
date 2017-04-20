<%-- 
    Document   : index
    Created on : 2017-4-20, 14:32:39
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
        <h1>principal:${principal}</h1><hr/>
        <form action="${pageContext.request.contextPath}/logout" method="post" id="logoutForm">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        </form>
        <a id="logout" href="javascript: logout()">退出登录</a>
        <h1>Hello World!</h1>${username}

        <h1>Hello World!    </h1>
        <h1>Hello World!    </h1>
        <h1>Hello World!    </h1>
    </body>
    <script src="http://s.diyigaokao.com/v4/script/jquery.min.js"  type="text/javascript"></script>
    <script> 

        function logout() {
            document.getElementById("logoutForm").submit();
        }
    </script>
</html>
