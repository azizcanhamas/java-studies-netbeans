<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
    <h1>Hello World!</h1>
    
    <%-- DECLARATION TAG : İçerisinde hem değişken hem de metot tanımı yapılabilir.
                           Class seviyesinde tanimlamadir,yani field tanimlamasidir.
                           Bu tanimlamalara her yerden ulaşılabilir.
                           Tanimlama _jspService()'in dışına yapılır.
                           Bu tanimlamalar bir kez yapılacağından
                           her istek (request) geldiğinde bellek kullanılmaz.
                    
                                      <%!   %>
    --%>
    
    <%--Local bir tanimlama--%>
    <%int sayac1=1;%>
    <%
        sayac1++;
        out.println("Sayac1: "+sayac1);
    %>
    
    <%--Declaration tag ile field tanimlamasi--%>
    <%!int counter=0;%> <%--Field olarak tanimlandigi icin Netbeans yesil olarak isaretler.--%>
    <%="<p>counter_1: "+counter%>
    <%="<p>counter_2: "+(++counter)%> <%--Ilk once arrtir, sonra yaz.--%>
    
    <hr>
    
    <%-- Declaration Tag içerisinde Metot Tanimlama--%>
    <%-- ÖRNEK-1 : Tanimlanan metot cagrildigi kisma karakter sayisi dondurur. --%>
    <%!
        int karakterSayisi(String s){
            return s.length();
        }
    %>
    <%
        String s="Aziz Can";
        out.println("<p>"+s+" stringindeki karakter sayisi: "+karakterSayisi(s));
    %>
    
    <hr>
    
    <%-- 
        ÖRNEK-2 : Declaration tag ile tanimlanmis,
        iki adet sayiyi toplayip kullaniciya gosterme
    --%>
    <%!
        double a=50;
        double b=500;
    %>
    <%
        out.println("Toplam: "+(a+b));
    %>
    
    <hr>
    
    <%-- 
        ÖRNEK-3 : Declaration tag ile tanimlanmis,
        kendisine verilen sayilari toplayan metot tanimlamasi
    --%>
    <%!
        double topla(double x,double y){
            return x+y;
        }
    %>
    <%
        out.println("50.5 + 25.2 = "+topla(50.5, 25.2));
    %>
    
    <%="<p>Toplam_2: "+topla(50.5,25.2)%>
    
    <hr>
    
    <%--
        ÖRNEK-4 : Declaration tag ile tanimlanmis ve kendisine verilen sayinin 
        faktoriyelini alan ardindan kullaniciyan gosteren scrip
    --%>
    
    <%!
        int faktoriyelAl(int a){
            if(a==1)return 1;
            else return a*faktoriyelAl(a-1);
        }
    %>
    <%
        out.println("5 sayisinin faktoriyeli: "+faktoriyelAl(5));
    %>
    
</body>
</html>
