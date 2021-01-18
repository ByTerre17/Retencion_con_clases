<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Calcular Sueldo Neto</h1>
        <form action="calcularRetencion.jsp">
            Empleado:<input type="text" name="nombre">
            Sueldo: <input type="number" name="sueldo">
            <input type="submit" value="Calcular">
        </form>
    </body>
</html>
