<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Nouveau client</title>
</head>
<body>
<h2 align="center">Nouveau client</h2>

<div style="margin-left: 200px; margin-right: 200px;">
    <form action="${pageContext.request.contextPath}/addClient">
        <div class="form-group row">
            <label for="name" class="col-2 col-form-label">Nom</label>
            <div class="col-10">
                <input class="form-control" type="text" placeholder="Nom" id="name" name="name" required>
            </div>
        </div>
        <div class="form-group row">
            <label for="phone" class="col-2 col-form-label">Telephone</label>
            <div class="col-10">
                <input class="form-control" type="tel" placeholder="70-00-00-00" id="phone" name="phone" required>
            </div>
        </div>
        <div class="form-group row">
            <label for="address" class="col-2 col-form-label">Adresse</label>
            <div class="col-10">
                <input class="form-control" type="text" value="" id="address" name="address">
            </div>
        </div>
        <div class="form-group row">
            <label for="country" class="col-2 col-form-label">Pays</label>
            <div class="col-10">
                <select class="form-control" id="country" name="country">
                    <option value="burkina_faso">Burkina Faso</option>
                </select>
            </div>
        </div>
        <div class="form-group row">
            <label for="city" class="col-2 col-form-label">Ville</label>
            <div class="col-10">
                <select class="form-control" id="city" name="city">
                    <option value="ouagadougou">Ouagadougou</option>
                </select>
            </div>
        </div>
        <div class="form-group row">
            <button class="btn btn-primary" type="submit">Ajouter</button>
            <button class="btn btn-default" type="reset">Annuler</button>
        </div>
    </form>
</div>


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