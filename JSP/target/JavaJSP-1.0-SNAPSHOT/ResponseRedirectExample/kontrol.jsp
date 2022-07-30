<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
    
    <%
        /*
            index.jsp sayfasinin yollamis oldugu "kod" isimli parametre burada
            integer degiskene alinacaktir. Eger kod=1 ise otomotiv, kod=2 ise
            elektronik, kod=3 ise mobilya sayfasina redirect edilecektir.
        */
        
        int kod=Integer.parseInt(request.getParameter("kod"));
        if (kod==1) response.sendRedirect("otomotiv.jsp");
        else if (kod==2) response.sendRedirect("elektronik.jsp");
        else if (kod==3) response.sendRedirect("mobilya.jsp");
    %>
</body>
</html>
