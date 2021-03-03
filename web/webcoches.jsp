<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="controller" class="controllers.ControllerCoches"
             scope="request"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hibernate Migración BBDD</h1>
        <table border="1">
            <thead>
                <tr>
                    <th>Coche</th>
                    <th>Conductor</th>
                    <th>Imagen</th>
                </tr>
            </thead>
            <tbody>
                <%=controller.getTablaCoches()%>
            </tbody>
        </table>
    </body>
</html>
