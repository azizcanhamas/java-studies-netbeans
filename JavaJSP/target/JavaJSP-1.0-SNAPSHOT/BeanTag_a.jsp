<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>

    <!--
        BEAN Etiketi : JSP sayfalarında Java Bean'leri çağırmak için kullanılır.
    Kullanım: 
        <.jsp:useBean id="xxx" class="paketAdi.classAdi" scope="Session"/>
        <.jsp:setProperty name="xxx" property="siniftaki_degiskenin_adi"/>
        <.jsp:getProperty name="xxx" property="siniftaki degiskenin adi"/>
    
        Eger birden fazla degiskene ayni anda deger atamasi yapilmak isteniyorsa
        " * " ifadesi kullanilabilir.
        <.jsp:setProperty name="xxx" property="*"/>
    -->

    <!--
        Kullanicidan form araciligiyla ad,vize,final bilgileri alinir
        ve GET yontemiyle BeanTag_b.jsp sayfasina bilgiler gonderilir.
    -->
    <div style="border:2px solid black; width: 300px; padding:25px;">
        <form name="giris_form" method="post" action="BeanTag_b.jsp">
            Ad   <input type="text" name="ad"/><br><br>
            Vize <input type="text" name="vize"/><br><br>
            Final<input type="text" name="final1"/><br><br>
            <input type="submit" name="gonder" value="Gonder"/>
        </form>
    </div>

</body>
</html>
