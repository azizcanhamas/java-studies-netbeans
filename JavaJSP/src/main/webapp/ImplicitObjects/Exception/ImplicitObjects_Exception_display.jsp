<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>

    <!-- Bir hata meydana gelirse yonlendirilecek olan sayfa tanimlaniyor.-->
    <%@ page errorPage="ImplicitObjects_Exception_error.jsp"%>
     <%
        int sayi1=Integer.parseInt(request.getParameter("sayi_1"));
        int sayi2=Integer.parseInt(request.getParameter("sayi_2"));
        int sonuc=sayi1/sayi2;
        out.print("Sayi 1: "+sayi1+"<br>");
        out.print("Sayi 2: "+sayi2+"<br>");
        out.print("Sonuc: "+sonuc+"<br>");
    %>

</body>
</html>
