<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Formulario con Servlets y JSP</title>
</head>
<body>
    <form action="myServlet2" method="post">
        <label for="nombre">Nombre:</label>
        <input type='text' id='nombre' name="nombre" required="true"/>
        <input type="submit" value="Enviar"/>
    </form>
    <h1>Actividad formulario con servlets y JSP</h1>
</body>
</html>