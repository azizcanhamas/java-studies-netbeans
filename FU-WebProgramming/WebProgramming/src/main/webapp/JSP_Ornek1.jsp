<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <!--String bir degiskene deger atanmasi 
            ve ekrana yazdirilmasi-->
        <%
            String x="Ali Gumus";
            out.println(x);
        %>

        
        <hr>
        
        <!--String degiskene bir deger atanmasi ve 
            expression tag ile ekrana yazdirilmasi-->
        <%
            String y="Ela Gül";
        %>
        <b><%=y%></b>
        
        <hr>
        
        <!--Kütüphane dahil etme ve ekrana tarihin yazdirilmasi-->
        <%@page import="java.util.Date" %>
        <%
            Date d=new Date();
            out.println(d);
        %>
        
    </body>
</html>
