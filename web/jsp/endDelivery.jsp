<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Terminer la Livraison</title>
        <%@include file="resources/bootstrap_depandencies"%>
    </head>
    <body onload="activeMenu()">
       <%@include file="resources/menu.html"%>

        <h2 align="center">Terminer la Livraison</h2>

        <div style="margin-left: 200px; margin-right: 200px;">
            <c:if test="${not empty delivery}">
                <form action="${pageContext.request.contextPath}/closeDelivery/${delivery.id}", method="post">
                    <div class="form-group row">
                        <label for="receiveDate" class="col-2 col-form-label">Date de receiption</label>

                        <div class='input-group date' id='receiveDate'> <input type='text' class="form-control" name="receiveDate" required/>
                            <span class="input-group-addon">
                                <span class="glyphicon glyphicon-calendar"></span>
                            </span>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="clientId" class="col-2 col-form-label">Client</label>

                        <div class="col-10">
                            <input class="form-control" type="text" value="${delivery.client.name}" id="clientId" name="clientId" disabled>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="employeeId" class="col-2 col-form-label">Employee</label>

                        <div class="col-10">
                            <input class="form-control" type="text" value="${delivery.user.firstName} ${delivery.user.lastName}" id="employeeId" name="employeeId" disabled>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="receiver" class="col-2 col-form-label">Receveur</label>

                        <div class="col-10">
                            <input class="form-control" type="text" value="${delivery.receiver}" id="receiver" name="receiver" disabled>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="receiverAddress" class="col-2 col-form-label">Adresse du receveur</label>

                        <div class="col-10">
                            <input class="form-control" type="text" value="${delivery.receiverAddress}" id="receiverAddress" name="receiverAddress" disabled>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="receiverReferences" class="col-2 col-form-label">Reference du receveur</label>

                        <div class="col-10">
                            <input class="form-control" type="text" value="" id="receiverReferences" name="receiverReferences" required>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="receiverComments" class="col-2 col-form-label">Commentaires du receveur</label>

                        <div class="col-10">
                            <input class="form-control" type="text" value="" id="receiverComments" name="receiverComments">
                        </div>
                    </div>

                    <div class="form-group row">
                        <button class="btn btn-danger" type="submit">Terminer</button>
                        <button class="btn btn-default" type="reset" onclick="openDeliveriesListPage()">Annuler</button>
                    </div>
                </form>
            </c:if>
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