<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <%@page import="java.util.Random" %>

        <%
            if(Math.random()<0.5){
        %>
                Merhaba!
        <%
            }
            else{
        %>
                Güle güle!
        <%
            }
            String define="<a href=\"cikis.html\">Cikis Yap</a>";
            out.println(define);
        %>
    </body>
</html>
