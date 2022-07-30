<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>

    <h3>Sonuc Ekrani</h3>
    <!--
        Source Packages -> BeanTagHesaplaPackage -> Hesapla yolu altinda tanimlanmis
        olan Hesapla Bean'i kullanilmak uzere tanimlanir. Form'dan alinan bilgiler
        bu Bean dosyasinin field'larina setter metotlar araciligiyla tanimlanacaktir.
        Ardindan getter metotlar ile hesaplanmis olan ortalama ve diger bilgiler alinip
        kullaniciya gosterilecektir. getProperty ve setProperty etiketlerinde tanimli olan
        name degerleri useBean'in id'si ile ayni olmak zorundadir. property kisminda
        hangi field uzerinde get-set islemi yapilmak istendigi belirtilmelidir.
    -->
    <jsp:useBean id="xxx" class="BeanTagHesaplaPackage.Hesapla" scope="request"/>
    <jsp:setProperty name="xxx" property="*"/>
    
    <p>
        Sayin <jsp:getProperty name="xxx" property="ad"/>
    </p>
    
    
    
    <p>
        <jsp:getProperty name="xxx" property="vize"/>
    </p>
    
    <p>
        <jsp:getProperty name="xxx" property="final1"/>
    </p>
    
    <p>
        <jsp:getProperty name="xxx" property="ort"/>
    </p>
    
</body>
</html>
