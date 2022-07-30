<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>

    <!--
        FORM Kullanmak:
            Form vasitasiyla bilgi gondermek icin GET veya POST metodlarindan 
            birisi kullanilir. Ancak guvenlik gerektiren sifre gibi bilgiler
            GET yerine POST metoduyla gonderilmelidir. Ayrica GET metodu ile
            gonderim yapilirken 2048 karakter sinirlamasi vardir.
            GET metodunda bilgiler URL icerisinde gonderilirken, POST metodunda
            HTTP protokolu icine gomulur.
    -->
    <%
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        
        //Sayfa ilk baslatildigi zaman form doldurulmamis oldugu icin
        //username ve password parametreleri bulunamaz. Bu yuzden request.getParameter
        //null doner.Bu yuzden asagidaki kosul calismayacaktir.
        if (username!=null&&password!=null) {
                if (username.equals("hamitozkan")&&password.equals("65ed87")) {
                    response.sendRedirect("display.jsp?username="+username+"&uyeMi=evet");
                }
                else{
                    out.println("Giris yetkiniz bulunmamaktadir.");
                }
        }
    %> 
    
    <!--Kullanici formu doldurup submit ettigi zaman degerler HTTP protokolunun icine yerlesir.
        action olarak bu sayfaya tekrar yonlendirildigi ve gerekli parametreler saglandigi icin
    ustteki kontrol calisacaktir.
    -->
    <form action="index.jsp" method="post">
        username<input type="text" name="username"/><br><br>
        password<input type="text" name="password"/><br><br>
        <input type="submit" id="send"/>
    </form>
        
</body>
</html>
