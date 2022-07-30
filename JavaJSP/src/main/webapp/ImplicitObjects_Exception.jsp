<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>

    <!-- 
        NOT: Form'a girilen degerlerin parametreler uzerinden request ile 
        alinmasi icin textbox'larin name degerleri tanimli olmalidir. ID ile olmaz.    
    -->
    <form action="ImplicitObjects_Exception_display.jsp">
        Birinci sayi <input type="text" id="sayi_1" name="sayi_1"/><br><br> 
        İkinci sayi&nbsp <input type="text" id="sayi_2" name="sayi_2"/><br><br>
        <input type="submit" id="button" value="Hesapla"/>
    </form>

</body>
</html>
