<%-- 
    Document   : calcularRetencion
    Created on : 18-ene-2021, 20:10:51
    Author     : manue
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        <%@page import="clases.Empleado" %>
        <% Empleado emp = new Empleado();
           emp.setNombre(request.getParameter("nombre"));
           emp.retencion(request.getParameter("sueldo"));
            %>
            <h1><%=emp.getNombre() %></h1>
            <h2><%=emp.getSueldo_bruto() %></h2>
            <h2><%=emp.getSueldo_neto() %></h2>
    </body>
</html>
