<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>    
    <%--
        FORM TAG: Bir sayfadan başka bir sayfaya veri taşımada kullanılır.
        Asagida yapilan ornekte FormTag1.jsp sayfasindan FormTag2.jsp
        sayfasina veri tasinacaktir.
    --%>

    <%-- 
        Kullanicinin bilgi girebilecegi form alani tanimlar.
        
        method kisminda verilerin nasil gonderilecegi tanimlanir.
        Gorunmesinde problem olmayan veriler ve kisitli veriler "get" metodu
        ile gonderilir. 
        
        Gorunmesinde sakinca olan veriler "post" metodu ile gonderilir.
        Tarayici kaynakli olarak buyume ihtimali olan veriler post ile gonderilmelidir.
        Ornegin diller arasi donusum sirasinda.
    
        action kisminda form verilerinin nereye gonderilecegi tanimlanir.
    --%>
    <form name="form1" method="get" action="FormTag_2.jsp">
        
        <%--"ay" isimli input icin baslik tanimlamasi--%>
        <label for="ay">Bir ay numarası giriniz</label>
        
        <%--
            Input alani tanimlar. Kullanicinin girecegi bilgi turune gore type degeri verilir.
            Klavye girisi yapilacagindan textbox ile text alinmasi icin input tanimlamasi
        --%>
        <input type="text" name="ay"> 
        
        <%--
            submit; Forma yazilan verilen sunucuya gonderilmesini tetikler.
            value; Buton text degerini tanimlar.
            name; Butonunun degisken adini tanimlar.
        --%>    
        <input type="submit" name="gonder" value="Gonder">
            
    </form>
    
</body>
</html>
