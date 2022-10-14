<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <!--Kullanıcıdan alınan bilgilerin baska bir sayfaya tasınması
            ve sayfada iki farklı yontemle goruntulenmesi-->
        <form action="JSP_Ornek2_VIEW.jsp">
            <label for="">1. Sayı: </label>
            <input type="text" name="sayi1"/><br><br>
            <label for="">2. Sayı: </label>
            <input type="text" name="sayi2"/><br><br>
            <label for="">3. Sayı: </label>
            <input type="text" name="sayi3"/><br><br>
            <input type="submit" value="Gonder"/>
        </form>

    </body>
</html>
