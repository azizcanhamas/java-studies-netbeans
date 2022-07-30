<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
    
    <%
        String username=request.getParameter("username");
        String uyeMi=request.getParameter("uyeMi");
        if (uyeMi==null || username==null) {
                out.println("Giris yetkiniz bulunmamaktadir!");
            }
            else if(uyeMi.equals("evet")){
            out.println("Hosgeldiniz "+username);
        }
    %>

    <!--
        Bir acik var: Bu sayfa dogrudan URL ile cagrilip sonuna ?uyeMi=evet
        eklendigi zaman sayfa dogrudan aciliyor. Bunu kapatmak icin 
        userName==null kontrolu yapilabilir.
    -->
    
</body>
</html>
