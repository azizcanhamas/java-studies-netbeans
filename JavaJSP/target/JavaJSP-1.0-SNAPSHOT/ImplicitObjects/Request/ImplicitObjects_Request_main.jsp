<%@page import="java.net.URLEncoder"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>

    <!--
    
        Request Nesnesi:
            Request demek istek bilgi demektir. Request nesnesinin görevi bir
            HTTP isteği anında JSP sayfasındaki verileri sunucuya iletmektir.
            Bu veriler; çerezler, başlıklar ya da kullanıcı tarafından girilmiş
            parametreler olabilir. İster sunucudan, ister kullanıcıdan bilgi alımı
            konusunda Request nesnesinin metotlarını kullanacağız.
    
    -->
    
    <!-- Request nesnesinin bazı metotları: -->
        
    <%="<p>Sunucu adi           : "+request.getServerName()%>
    <%="<p>Sunucu cikis portu   : "+request.getServerPort()%>
    <%="<p>Ziyaretci IP adresi  : "+request.getRemoteAddr()%>
    <%="<p>Sunucu IP adresi     : "+request.getRemoteHost()%>
    <%="<p>Paket gonderim metodu: "+request.getMethod()%>
    <%="<p>Protokol surumu      : "+request.getProtocol()%>
    <%="<p>Bolge kodu           : "+request.getLocale()%>
    <%="<p>Domain adi           : "+request.getContextPath()%>
    <%="<p>Aktif dizin yolu     : "+request.getServletPath()%>
    <%="<p>Domain dizin yolu    : "+request.getRequestURI()%>
    <%="<p>Sunucu dizin yolu    : "+request.getRequestURL()%>
    
    
    <!--         
        "Request" Nesnesinin "QueryString" Metodu:
            Adından da anlaşılacağı gibi veri talep etmek için kullanılır.
            Gerek formlardan, gerek çerezlerden veri almak için kullanılır.
            Bu yöntem kullanım kolaylığı ve sunucuya herhangi bir yük ve
            getirmediğinden sıkça tercih edilmektedir. Ancak parametre ile
            taşınan veriler diğer kullanıcılar tarafından rahatlıkla görülebildiğinden
            güvenlik açığı oluşturur. Dolayısıyla bu yöntemle kritik bilgiler
            taşınmamalıdır. Diğer dezavantajı ise tarayıcıların karakter uzunluğu
            2083 karakter ile sınırlar.
    
        "Request" Nesnesinin getParameter()&getParameterValues() Metotları:
            getParameter() formdan veya URL satırından gelen tek parametreli
            değeri karşılarken, getParameterValues() ise birden çok parametreli
            (checkbox gibi) değerleri karşılayabilmektedir.
    -->
    <!--adsoyad=AliCanHakan ve meslek=Ogretmen degerlerini tutar. Parametreler birbirinden "?" ile ayrilir.-->
    <p><a href="ImplicitObjects_Request_main_display.jsp?adsoyad=AliCanHakan&meslek=Ogretmen">Gonder_1</a>
    <p><a href="ImplicitObjects_Request_main_display.jsp?adsoyad=AliCanHakan&meslek=Ogretmen&Sofor">Gonder_2</a>
    <!--Meslek bilgisinin encrypt edilmesi. Karsilandigi tarafta URLDecoder.decode ile decrypt edilmelidir.-->
    <p><a href="ImplicitObjects_Request_main_display.jsp?adsoyad=AliCanHakan&meslek=<%=URLEncoder.encode("Ogretmen&Sofor","UTF-8")%>">Gonder_3</a>
    <p><a href="https://www.mku.edu.tr?adsoyad=AliCanHakan&meslek=Ogretmen">Gonder_4</a>

</body>
</html>
