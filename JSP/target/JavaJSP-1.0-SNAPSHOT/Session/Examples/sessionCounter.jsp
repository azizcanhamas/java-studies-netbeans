<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>

    <%
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
