<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Page de connexion</title>
        <%@include file="resources/bootstrap_depandencies"%>
    </head>
    <body>
        <div class="container">
            <h1 align="center">Login</h1>

            <div style="margin-left: 400px; margin-right: 400px;">
                <c:if test="${not empty errorMessage}">
                    <div class="alert alert-danger">
                        <strong>${errorMessage}</strong>
                    </div>
                </c:if>
                <form method="post" action="${pageContext.request.contextPath}/loginFromWeb" modelAttribute="loginBean">
                    <div class="form-group">
                        <label for="userName">Nom d'utilisateur:</label>
                        <input type="text" class="form-control" id="userName" name="userName" required>
                    </div>
                    <div class="form-group">
                        <label for="password">Mot de passe:</label>
                        <input type="password" class="form-control" id="password" name="password" required>
                    </div>
                    <button type="submit" class="btn btn-default">Connexion</button>
                </form>
            </div>
        </div>
    </body>
</html>
