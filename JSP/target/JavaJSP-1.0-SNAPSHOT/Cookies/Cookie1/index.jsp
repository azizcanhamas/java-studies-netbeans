<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
    <!--Temsili Login Sayfasi: Kullanici bu sayfada oturum acmis oluyor.-->
    <!--username ve password bilgisi get methodu ile parametre olarak 
        cerezOlustur sayfasina aktariliyor.     -->
    <form action="cerezOlustur.jsp" method="get">
        Username : <input type="text" name="username"/><br><br>   
        Password : <input type="text" name="password"/><br><br>
        <input type="submit" value="Olustur"/>
    </form>
</body>
</html>
