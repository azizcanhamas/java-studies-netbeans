<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Include-Direktif</title>
    </head>
    <body>

        <!--
            INCLUDE Etiketi : Mevcut JSP sayfasina başka bir sayfa eklememizi sağlar.
            Bu işlemi "file" özniteliği ile yapar.
                
            <.%@include file="dosya_adi_veya_yolu" %> (nokta yok) şeklinde kullanılır.
        -->
        
        <!-- Header sayfasinin dahil edilmesi.-->
        <%@include file="IncludeTag_header.jsp" %>
        
        <!-- Bu sayfamizin kendi icerigi -->
        <center><h1>Sitemize hoşgeldiniz!</h1></center>
        
        <!-- Footer sayfasinin dahil edilmesi.-->
        <%@include file="IncludeTag_footer.jsp" %>
        
        <!--
            Bu yontem sayesinde bir web sayfasi tasarlarken kod tekrarindan kurtulmamizi saglar
            Footer ve header gibi kısımlar bir web sitesinin her yerinde aynı olacağından
            Bu yöntem ile her yere dahil edilmelidir.
        -->
        
    </body>
</html>
