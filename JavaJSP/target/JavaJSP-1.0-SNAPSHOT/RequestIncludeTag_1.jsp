<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
    
    <!-- 
        Kullanicidan request geldigi zaman bu sayfadan 
        RequestIncludeTag_2.jsp sayfasina yonlendirilecektir.
        <.%@include  %> etiketi ile en buyuk fark <.jsp:include> etiketinin 
        yalnizca request geldigi zaman calismasidir. 
        <.%@include%> etiketi JSP sayfasinin Servlet'e cevrimi sirasinda calisir.
    -->
    <jsp:forward page="RequestIncludeTag_2.jsp">
        <jsp:param name="ad" value="Aziz Can"/>
        <jsp:param name="soyad" value="Hamasoglu"/>
        <jsp:param name="fakulte" value="Muhendislik Fakultesi"/>
        <jsp:param name="bolum" value="Bilgisayar Muh."/>
        <jsp:param name="ogrno" value="258369147"/>
        <jsp:param name="sehir" value="Ankara"/>      
    </jsp:forward>
    
</body>
</html>
