<%-- 
    Document   : ImplicitObjects_Response_index
    Created on : 30.Tem.2022, 11:05:20
    Author     : azuwin_user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
    <% 
        //Hatali sifre veya kullanici adi nedeniyle kullanici buraya yonlendirilmisti.
        //Hata firlat.
        response.sendError(404,"Yanlis kullanici adi veya sifre!");
    %>
</body>
</html>
