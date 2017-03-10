<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Nouveau client</title>
        <%@include file="resources/bootstrap_depandencies"%>
    </head>
    <body onload="activeMenu()">
         <%@include file="resources/menu.html"%>

        <h2 align="center">Nouveau utilisateur</h2>

        <div style="margin-left: 200px; margin-right: 200px;">
            <form method="post" action="${pageContext.request.contextPath}/addUser">
                <div class="form-group row">
                    <label for="firstName" class="col-2 col-form-label">Nom</label>

                    <div class="col-10">
                        <input class="form-control" type="text" id="firstName" name="firstName" required>
                    </div>
                </div>
                <div class="form-group row">
                    <label for="lastName" class="col-2 col-form-label">Prenom</label>

                    <div class="col-10">
                        <input class="form-control" type="text" id="lastName" name="lastName" required>
                    </div>
                </div>
                <div class="form-group row">
                    <label for="phone" class="col-2 col-form-label">Telephone</label>

                    <div class="col-10">
                        <input class="form-control" type="tel" placeholder="70-00-00-00" id="phone" name="phone" required>
                    </div>
                </div>
                <div class="form-group row">
                    <label for="email" class="col-2 col-form-label">Email</label>

                    <div class="col-10">
                        <input class="form-control" type="email" id="email">
                    </div>
                </div>
                <div class="form-group row">
                    <label for="login" class="col-2 col-form-label">Login</label>

                    <div class="col-10">
                        <input class="form-control" type="text" value="" id="login" name="login" required>
                    </div>
                </div>
                <div class="form-group row">
                    <label for="password" class="col-2 col-form-label">Password</label>

                    <div class="col-10">
                        <input class="form-control" type="text" id="password" name="password" required>
                    </div>
                </div>
                <div class="form-group row">
                    <label for="appAccess" class="col-2 col-form-label">Acces</label>

                    <div class="col-10">
                        <select multiple class="form-control" id="appAccess">
                            <option value="web">Web</option>
                            <option value="mobile">Mobile</option>
                        </select>
                    </div>
                </div>
                <div class="form-group row">
                    <button class="btn btn-primary" type="submit">Ajouter</button>
                    <button class="btn btn-default" type="reset" onclick="openUsersListPage()">Annuler</button>
                </div>
            </form>
        </div>


        <script type="text/javascript">
            function openUsersListPage()
            {
                window.location.href = '/users';
            }

            function activeMenu()
            {
                document.getElementById("users").className = "active"
            }
        </script>
    </body>
</html>