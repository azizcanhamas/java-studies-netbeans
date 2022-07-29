<%-- 
    Document   : ScriptletTag
    Created on : 29.Tem.2022, 09:36:49
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
    <h1>Hello World!</h1>
      
    <%-- 
        Scriptlet Tag : Java Kodlarinin yazilmasini saglar. 
        İçerisinde local değişken tanimlamasi yapilabilir, komutlar çalıştırılabilir.
        dongu yapilari kullanilabilir. Ancak metot tanımlamasi yapilamaz. 
        Metot tanimlamasi icin Declaration tag kullanilmalidir.
    --%>
    
    <%-- ÖRNEK-1 : JSP ile iki sayinin toplaminin kullaniciya gosterilmesi--%>
    <%
        int sayi_1=5;
        int sayi_2=6;
        int toplam=sayi_1+sayi_2;
        out.println("Sayi 1: "+sayi_1+"<p>");
        out.println("Sayi 2: "+sayi_2+"<p>");
        out.println("Toplam: "+toplam+"<p>");
    %>
    
    <hr>
    
    <%-- ÖRNEK-2 : Scriptlet tag içinde döngülerin kullanilmasi --%>
    <h3>Burası HTML dili ile yazildi.</h3>
    <%
        String tmp="Merhaba, Aziz JSP deniyor...(JSP ile yazildi.)";
        for (int i = 0; i < 10; i++) {
                out.println(tmp+"<p>");
            }
    %>
    
    <hr>
    
    <%-- ÖRNEK-3 : Scriptlet tag ile iç içe döngüler --%>
    <%
        for (int i = 0; i < 10; i++) {
                for (int j = 0; j < i; j++) {
                        out.print(" "+j);
                    }
                    out.println("<hr>");
            }
    %>
    
</body>
</html>
