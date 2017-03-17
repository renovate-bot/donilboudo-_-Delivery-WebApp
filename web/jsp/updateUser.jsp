<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Nouveau client</title>
    <%@include file="resources/bootstrap_depandencies"%>
</head>
<body>
<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#"></a>
        </div>
        <ul class="nav navbar-nav" style="margin-left: 35px;">
            <li class="active"><a href="#">Acceuil</a></li>
            <li class="dropdown">
                <a class="dropdown-toggle" data-toggle="dropdown" href="#">Utilisateurs
                    <span class="caret"></span>
                </a>
                <ul class="dropdown-menu">
                    <li><a href="#">Ajouter</a></li>
                    <li><a href="#">Supprimer</a></li>
                </ul>
            </li>
            <li><a href="#">Clients</a></li>
            <li><a href="#">Livraisons</a></li>
        </ul>
        <ul class="nav navbar-nav navbar-right">
            <%--<li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>--%>
            <li><a href="#"><span class="glyphicon glyphicon-log-out"></span> Deconnexion</a></li>
        </ul>
    </div>
</nav>

<h2 align="center">Nouveau utilisateur</h2>

<div style="margin-left: 200px; margin-right: 200px;">
    <form>
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
            <label for="userName" class="col-2 col-form-label">Login</label>
            <div class="col-10">
                <input class="form-control" type="text" value="" id="userName" name="userName" required>
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
            <button class="btn btn-default" type="reset">Annuler</button>
        </div>
    </form>
</div>


<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
      integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
      integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
        integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
        crossorigin="anonymous"></script>
</body>
</html>