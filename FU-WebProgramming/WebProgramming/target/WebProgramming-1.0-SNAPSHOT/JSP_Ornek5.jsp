<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <!--Kullanicidan belli bilgiler alinir ve submit eidlince kaydet.jsp
        sayfasina parametre yoluyla gonderilir.--->
        <form action="kaydet.jsp">
            <label for="ad">AD: </label>
            <input type="text" name="ad"><br>
            <label for="soyad">SOYAD: </label>
            <input type="text" name="soyad"><br>
            <label for="numara">NUMARA: </label>
            <input type="text" name="numara"><br>
            <label for="fakulte">FAKULTE: </label>
            <input type="text" name="fakulte"><br><br>
            <input type="submit" value="GONDER">
            <input type="reset" value="SIFIRLA">
        </form>

    </body>
</html>
