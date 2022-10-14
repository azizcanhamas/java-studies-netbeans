<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <%
            //Parametre olarak gelen parametreler request nesnesi
            //uzerinden String degiskenlere alinir.
            String ad=request.getParameter("ad");
            String soyad=request.getParameter("soyad");
            String numara=request.getParameter("numara");
            String fakulte=request.getParameter("fakulte"); 
        %>
        
        <!--Source Packages -> kaydetPck -> kaydet.java Bean'i import edilir.-->
        <jsp:useBean id="kkk" class="kaydetPck.kaydet" scope="session"/>
        <!--Kullanicidan alinan bilgiler Bean icerisine set edilir.-->
        <jsp:setProperty name="kkk" property="*"/>
        
        <!--Bean nesnesi uzerindeki bilgiler kullaniciya gosterilir.-->
        <%=kkk.getAd()%>
        <%=kkk.getSoyad()%>
        <%=kkk.getNumara()%>
        <%=kkk.getFakulte()%>

    </body>
</html>
