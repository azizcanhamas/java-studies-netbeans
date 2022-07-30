<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>

    <!--
        Implicit Objects (Gomulu Nesneler):Gomulu nesneler JSP sayfalarinin
        Servlet'e cevrilmesi sirasinda olusturulurlar. Gomulu olarak adlandirilmasinin
        sebebi budur. _jspService() metodunun icerisinde olusturur. Dolayisiyla
        scriptlet tag icerisinde tekrar olusturmaya gerek kalmaz.
    
        Bu nesneler;
            1- Out: Ekrana icerik bastirmak icin kullanilir. 
            Icerik ve buffer ile ilgili metotlari bulunur.
            
            2- Exception: Hatalari yakalayip gerekli mesaji gostermek icin kullanilir.
            Sadece isErrorPage ozelligi "true" olan JSP sayfalarindan erisilebilir.
        
            3- Response: Yapilan bir istek sonrasi sunucu tarafindan kullaniciya 
            gonderilen cevaplar ile ilgili islemlerde gorevlidir.
    
            4- Request: Bu nesnenin en temel amaci veri almaktir. 
            Forma girilen veriler, yonlendirilen sayfada request nesnesi 
            ile alinir ve uzerinde cesitli islemler yapilir.
    
            5- Session: Oturum yonetimi icin kullanilir. Oturumun acik kaldigi 
            sure boyunca, kullanicinin bilgilerine bu nesne sayesinde 
            her yerden erisilebilir. En cok kullanilan nesnelerden birisidir.
    
            6- Application: Projemizin parametrelerine ulasmada kullanilir.
            Ornegin; versiyonlar, url'ler, sunucu bilgileri.
            
            7- Page / PageContext: Page,Request,Application ve Session 
            seviyelerine ulasmak icin kullanilir.
    -->

</body>
</html>
