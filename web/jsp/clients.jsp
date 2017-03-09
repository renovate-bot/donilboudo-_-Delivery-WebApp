<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Nouveau client</title>
    </head>
    <body>
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="#"></a>
                </div>
                <ul class="nav navbar-nav" style="margin-left: 35px;">
                    <li><a href="${pageContext.request.contextPath}/home">Acceuil</a></li>
                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Utilisateurs<span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="${pageContext.request.contextPath}/newUser">Ajouter</a></li>
                            <li><a href="#">Supprimer</a></li>
                        </ul>
                    </li>
                    <li class="active"><a href="#">Clients</a></li>
                    <li><a href="#">Livraisons</a></li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <%--<li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>--%>
                    <li><a href="#"><span class="glyphicon glyphicon-log-out"></span> Deconnexion</a></li>
                </ul>
            </div>
        </nav>

        <div align="right" style="margin-right: 25px;"><button type="button" class="btn btn-primary btn-md" onclick="openNewClientPage()">Nouveau Client</button></div>
        <div class="container">
            <h2 align="center">Clients</h2>
            <c:if test="${clients.size() > 0}">
                <table class="table table-hover">
                    <thead>
                        <tr>
                            <th>Nom</th>
                            <th>Telephone</th>
                            <th>Adresse</th>
                            <th>Pays</th>
                            <th>Ville</th>
                            <th></th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${clients}" var="client">
                            <tr>
                                <td>${client.name}</td>
                                <td>${client.phone}</td>
                                <td>${client.address}</td>
                                <td>${client.country}</td>
                                <td>${client.city}</td>
                                <td>
                                    <div class="btn-group">
                                        <button type="button" class="btn btn-primary">Mise a jour</button>
                                        <button type="button" class="btn btn-danger">Supprimer</button>
                                    </div>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </c:if>
        </div>


        <script type="text/javascript">
            function openNewClientPage()
            {
                window.location.href = '/newClient';
            }
        </script>

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>

        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
              integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
              integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
                crossorigin="anonymous"></script>
    </body>
</html>