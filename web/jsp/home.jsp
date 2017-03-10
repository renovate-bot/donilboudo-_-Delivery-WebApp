<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Home</title>
        <%@include file="resources/bootstrap_depandencies"%>
    </head>
    <body onload="activeMenu()">
        <%@include file="resources/menu.html"%>
        <h1>Welcome body</h1>

        <script type="application/javascript">
            function activeMenu()
            {
                document.getElementById("home").className = "active"
            }
        </script>
    </body>
</html>
