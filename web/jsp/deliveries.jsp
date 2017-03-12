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

        <div align="right" style="margin-right: 25px;"><button type="button" class="btn btn-primary btn-md" onclick="openNewClientPage()">Nouvelle Livraison</button></div>
        <div class="container">
            <h2 align="center">Livraisons</h2>
            <c:if test="${deliveries.size() > 0}">
                <table class="table table-hover">
                    <thead>
                        <tr>
                            <th>#</th>
                            <th >Status de la livraison</th>
                            <th>Employee</th>
                            <th>Client</th>
                            <th>Date d'envoie</th>
                            <th>References de l'envoyeur</th>
                            <th>Commentaires de l'envoyeur</th>
                            <th>Receveur</th>
                            <th>Adresse du receveur</th>
                            <th>References du receveur</th>
                            <th>Date de reception</th>
                            <th>Commentaires du receveur</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${deliveries}" var="delivery">
                                <td></td>
                                <td
                                        <c:choose>
                                            <c:when test="${delivery.status == 'START'}">bgcolor="green"</c:when>
                                            <c:otherwise>bgcolor="red"</c:otherwise>
                                        </c:choose>
                                        >
                                    <p style="color: white">${delivery.status}</p></td>
                                <td>${delivery.user.firstName} ${delivery.user.lastName}</td>
                                <td>${delivery.client.name}</td>
                                <td>${delivery.sendDate}</td>
                                <td>${delivery.senderReferences}</td>
                                <td>${delivery.senderComments}</td>
                                <td>${delivery.receiver}</td>
                                <td>${delivery.receiverAddress}</td>
                                <td>${delivery.receiverReferences}</td>
                                <td>${delivery.receiveDate}</td>
                                <td>${delivery.receiverComments}</td>
                                <td>
                                    <div class="btn-group">
                                        <button type="button" class="btn btn-primary" onclick="endDelivery('${delivery.id}')"
                                                <c:if test="${delivery.status == 'FINISH'}">disabled </c:if> >Terminer</button>
                                        <%--<button type="button" class="btn btn-danger">Supprimer</button>--%>
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
                window.location.href = '/newDelivery';
            }

            function activeMenu()
            {
                document.getElementById("deliveries").className = "active"
            }

            function endDelivery(deliveryId)
            {
                window.location.href = '/closeDelivery/' + deliveryId;
            }
        </script>
    </body>
</html>