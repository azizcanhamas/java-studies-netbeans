<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>

    <!--Sayfaya URLDecoder kutuphanesinin import edilmesi-->
    <%@ page import="java.net.URLDecoder"%>
    <!--Turkce karakter sorunu yasanmamasi icin request nesnesi "UTF-8" moduna aliniyor.-->
    <%request.setCharacterEncoding("UTF-8");%>
    <!--getQueryString() metodu ile tum sorgu ifadesi aliniyor.-->
    <%="<p>Query String: "+request.getQueryString()%>
    <!--getParameter() metodu ile istenen parametrenin alinmasi-->
    <%="<p> Ad Soyad: "+request.getParameter("adsoyad")%>
    <!--URLDecoder.decode metodu ile sifreli parametrenin decode edilmesi-->
    <%="<p> Meslek: "+URLDecoder.decode(request.getParameter("meslek"))%>

</body>
</html>
