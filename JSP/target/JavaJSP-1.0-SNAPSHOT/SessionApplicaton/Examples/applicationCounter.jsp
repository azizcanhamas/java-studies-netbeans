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
        //Ardindan Google Chrome tarayicisindan ayni sayfaya girdiginizde
        //ayni oturum sayac degerini gozlemleyeceksiniz.
        Integer sayac=(Integer)application.getAttribute("oturumSayac");
        if(sayac==null){
            sayac=1;
            out.print("İlk ziyaretiniz!");
        }
        else{
            out.print("Oturum sayaci: "+sayac);
        }
        application.setAttribute("oturumSayac", sayac+1);
    
    %>

</body>
</html>
