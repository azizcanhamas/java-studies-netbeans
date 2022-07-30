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
        //Sayfayı önbellekleme yapma.
        response.setHeader("Cache-Control", "no-cache");
        //0 saniye sonra sayfanin guncel olmadigini kabul et.
        response.setDateHeader("Expires", 0);
        //5 saniyede bir sayfayi yenile.
        response.setIntHeader("Refresh", 5);
        
        out.println("Giris basarili!");
    
        //Siteyi bulamazsan asagidaki siteye yonlendir
//        response.setStatus(301);
//        response.setHeader("Location", "https://google.com.tr");
//        response.setHeader("Connection", "close");

    %>
    
</body>
</html>
