<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Nouvelle Livraison</title>
        <%@include file="resources/bootstrap_depandencies"%>
    </head>
    <body onload="activeMenu()">
       <%@include file="resources/menu.html"%>

        <h2 align="center">Nouvelle Livraison</h2>

        <div style="margin-left: 200px; margin-right: 200px;">
            <form action="${pageContext.request.contextPath}/newDelivery", method="post">
                <div class="form-group row">
                    <label for="client" class="col-2 col-form-label">Client</label>

                    <div class="col-10">
                        <select class="form-control" id="client" name="clientId">
                            <c:forEach items="${clients}" var="client">
                                <option value="${client.id}">${client.name}</option>
                            </c:forEach>
                        </select>
                    </div>
                </div>
                <div class="form-group row">
                    <label for="user" class="col-2 col-form-label">Employée</label>

                    <div class="col-10">
                        <select class="form-control" id="user" name="employeeId">
                            <c:forEach items="${employees}" var="employee">
                                <option value="${employee.id}">${employee.firstName} ${employee.lastName}</option>
                            </c:forEach>
                        </select>
                    </div>
                </div>

                <div class="form-group row">
                    <label for="sendDate" class="col-2 col-form-label">Date d'envoie</label>

                    <div class='input-group date' id='sendDate'> <input type='text' class="form-control" name="sendDate" required/>
                        <span class="input-group-addon">
                            <span class="glyphicon glyphicon-calendar"></span>
                        </span>
                    </div>
                </div>
                <div class="form-group row">
                    <label for="receiver" class="col-2 col-form-label">Receveur</label>

                    <div class="col-10">
                        <input class="form-control" type="text" value="" id="receiver" name="receiver" required>
                    </div>
                </div>
                <div class="form-group row">
                    <label for="receiverAddress" class="col-2 col-form-label">Adresse du receveur</label>

                    <div class="col-10">
                        <input class="form-control" type="text" value="" id="receiverAddress" name="receiverAddress">
                    </div>
                </div>
                <div class="form-group row">
                    <label for="senderReferences" class="col-2 col-form-label">Références de l'envoyeur</label>

                    <div class="col-10">
                        <input class="form-control" type="text" id="senderReferences" name="senderReferences" required>
                    </div>
                </div>
                <div class="form-group row">
                    <label for="senderComments" class="col-2 col-form-label">Commentaires de l'envoyeur</label>

                    <div class="col-10">
                        <input class="form-control" type="text" id="senderComments" name="senderComments">
                    </div>
                </div>

                <div class="form-group row">
                    <button class="btn btn-primary" type="submit">Ajouter</button>
                    <button class="btn btn-default" type="reset" onclick="openDeliveriesListPage()">Annuler</button>
                </div>
            </form>
        </div>

        <script type="text/javascript">
            function openDeliveriesListPage()
            {
                window.location.href = '/deliveries';
            }

            function activeMenu()
            {
                document.getElementById("deliveries").className = "active"
            }

            $(function () {
                $("#sendDate").datepicker({
                    language: 'en',
                    pickDate: true,
                    pick12HourFormat: true
                });
            });

            $(function () {
                $("#receiveDate").datepicker();
            });
        </script>
    </body>
</html>