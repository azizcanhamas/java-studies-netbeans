<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
        
    <!--
        RESPONSE Nesnesi:
            *   Sunucunun istemciye cevap vermesini saglar.
    
        Nesneye Ozgu Baslica Metotlar:
            *   setContentType : Sayfa iceriginin tipini belirler.
            *   setHeader      : Sayfanin cache/sunucu yuklenme durumunu belirler.
            *   setIntHeader   : Otomatik yenileme saglar.
            *   sendError      : Sayfaya hata mesaji yazdirir.
            *   sendRedirect   : Parametre olarak aldigi sayfaya yonlendirir.   
    -->
    
    <%// setContentType() Ornek Kullanim:
        response.setContentType("text/html");
//        response.setContentType("image/gif");
//        response.setContentType("image/png");
        //Tarayici PDF gostermesi gerektigini anlar.
//        response.setContentType("application/pdf"); 
    %>
    
    <%// setHeader() Ornek Kullanim:
        // Sayfayi cache bellekten milisaniye cinsinden cagirmak istiyorsak
        response.setHeader("Cache-Control", "max-age=5000");
        response.setHeader("Cache-Control", "max-age=0");
        
        //  Sayfayı surekli sunucudan cagirmak istiyorsak
        //  Onbellekleme yapilmaz.
        response.setHeader("Cache-Control", "no-cache");
        //  Onbellege alinmis bir kopya serbest birakilmadan once
        //  onbellekteki dosyanin guncel olup olmadigini kontrol etmek icin
        //  sunucuya yonlendirmeye zorlar.
        response.setHeader("Pragma", "no-cache");
        //  Icerigin belirtilen zaman diliminden sonra guncel olmayacagini belirtir.
        //  0 oldugu icin surekli sunucudan sayfa cekilir.
        response.setDateHeader("Expires", 0);
    %>
    
    <%//setIntHeader() Ornek Kullanim:
        //3 saniyede bir sayfayi yeniler.
        response.setIntHeader("Refresh", 3);
    %>
    
    <%//sendError() Ornek Kullanim:
        //409 hata koduyla belirtilen stringle hata firlatir.
        //Hata kodlari icin : https://tr.wikipedia.org/wiki/HTTP_durum_kodlar%C4%B1
        response.sendError(409,"HATA! Bir sorun oldu.");
    %>
    
    <%//sendRedirect() Ornek Kullanim:
        //Belirtilen sayfaya yonlendirir. (Onceki ornegi comment yapin.)
        response.sendRedirect("IncludeTag_footer.jsp");
    %>  
 
</body>
</html>
