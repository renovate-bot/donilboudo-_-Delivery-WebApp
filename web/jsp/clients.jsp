<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Nouveau client</title>
        <%@include file="resources/bootstrap_depandencies"%>
    </head>
    <body  onload="activeMenu()">
        <%@include file="resources/menu.html"%>

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

            function activeMenu()
            {
                document.getElementById("clients").className = "active"
            }
        </script>
    </body>
</html>