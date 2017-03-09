<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Page de connexion</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
        <link rel="stylesheet" type="text/css" href="../WEB-INF/resources/css/style.css">
        <script src="https://cdnjs.cloudflare.com/ajax/libs/prefixfree/1.0.7/prefixfree.min.js"></script>
    </head>
    <body>
        <div class="login">
            <h1 align="center">Login</h1>
            <form method="post" action="${pageContext.request.contextPath}/loginFromWeb">
                <table align="center">
                    <tr>
                        <td><input type="text" name="u" placeholder="Username" required="required" /></td>
                    </tr>
                    <tr>
                        <td><input type="password" name="p" placeholder="Password" required="required" /></td>
                    </tr>
                    <tr>
                        <td align="center"> <button type="submit" class="btn btn-primary btn-block btn-large">Let me in.</button></td>
                    </tr>
                </table>
            </form>
        </div>

        <script src="../WEB-INF/resources/js/index.js"></script>
    </body>
</html>
