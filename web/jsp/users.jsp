<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Utilisateurs</title>
</head>
<body>
<div panel panel-default style="margin-left: 20px; margin-right: 20px;">
    <table class="table">
        <tr>
            <td><b>#</b></td>
            <td><b>Prenom</b></td>
            <td><b>Nom</b></td>
            <td><b>Email</b></td>
            <td><b>Telephone</b></td>
            <td><b>Nom utilisateur</b></td>
            <td><b>Mot de passe</b></td>
        </tr>
        <% int counter = 1; %>
        <c:forEach items="${users}" var="user">
            <tr>
                <td><%= counter %>
                </td>
                <td>${user.firstName}</td>
                <td>${user.lastName}</td>
                <td>${user.email}$</td>
                <td>${user.phone}$</td>
                <td>${user.login}$</td>
                <td>${user.password}$</td>
                <td>
                    <button onclick="updateUser(${user.id})">Modifier</button>
                </td>
                <td>
                    <button class="btn btn-primary" onclick="deleteUser(${user.id})">Supprimer</button>
                </td>
            </tr>
            <% counter = counter + 1; %>
        </c:forEach>
    </table>
</div>

<script type="text/javascript">
    function deleteUser(id) {
        window.location.href = '/deleteUser/' + id;
    }

    function updateUser(id) {
        window.location.href = '/updateUser/' + id;
    }
</script>
</body>
</html>
