<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
    <!-- Kullanici sisteme sadece kullanici adi ile giris yapiyor.
         Alinan username bilgisi ziyaret.jsp'ye gonderiliyor.
    -->
    <form action="ziyaret.jsp" method="get">
        Kullanıcı adı: <input type="text" name="username"/>
        <input type="submit" value="Gönder"/>   
    </form>
    
</body>
</html>
