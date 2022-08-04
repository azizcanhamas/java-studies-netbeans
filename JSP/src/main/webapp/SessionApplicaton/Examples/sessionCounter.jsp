<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>

    <%
        //Bu sayfayi ilk olarak Mozilla Firefox tarayicisinda acin
        //Oturum sayac degerini sayfayi yenileyerek yukseltin.
        //Yeni bir sekmede ayni sayfaya girdiginiz zaman ayni degeri gozlemleyeceksiniz.
        //Ancak Google Chrome tarayicisindan ayni sayfaya girdiginizde
        //oturum sayac degerini bastan baslayacaktir. Cunku yukseltilen deger
        //yalnizca tarayiciya ozgudur. Her tarayicidan ayni deger gozlemlenmesi
        //isteniyorsa application nesnesi kullanilmalidir.
        
        //Session Nesnesi Uzerinde Veri Saklama
        //=============================================
        
        //Object dondugunden Integer tanimlandi.
        //session nesnesinden oturumSayac degerinin alinmasi
        Integer sayac=(Integer)session.getAttribute("oturumSayac");
        
        //Eger sayac degeri yoksa 1 olarak tanimla.
            if(sayac==null){
            sayac=1;
            out.print("İlk ziyaretiniz!");
        }
        else{
            out.print("Oturum sayiniz: "+sayac);
        }
        //session nesnesi uzerindeki oturumSayac'in degerini guncelle.
        session.setAttribute("oturumSayac", sayac+1);
    %>

</body>
</html>
