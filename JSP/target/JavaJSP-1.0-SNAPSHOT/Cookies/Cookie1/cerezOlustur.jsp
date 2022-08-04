<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
    <%
        //Kullanici oturum acti. Cerez olusturulacak.
        //Login sayfasindan gelen username ve password bilgisi degiskenlere aliniyor.
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        
        //Cerez olusturma
        // NOT: username ve parola bilgisi bir string ile birlestirilip 
        // tek bir cookie'ye gömülüp sonradan ayrıştırılabilir.
        //kullanici adi icin bir cerez olusturulmasi
        Cookie usernameCookie=new Cookie("username",username);
        //parola bilgisi icin bir cerez olusturulmasi
        Cookie passwordCookie=new Cookie("password",password);
        //Cerez zaman aşımı tanımlaması
        usernameCookie.setMaxAge(3600*1*24); //3600 saniye=1 saat 24=1 gün
        passwordCookie.setMaxAge(3600*1*24); //Cerez 1 gün sonra silinecek.
        //Cerezleri client'a gonder.
        response.addCookie(usernameCookie);
        response.addCookie(passwordCookie);
        
    %>
    
    <h3></b>Oluşturulan Çerez Bilgileri</b></h3><hr>
    <b>Kullanıcı:</b> <%=username%><br>
    <b>Parola   :</b> <%=password%><br>
    <a href="cerezListele.jsp">Çerezleri listele</a>
</body>
</html>
