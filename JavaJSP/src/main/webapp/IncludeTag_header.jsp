<%-- 
    Document   : IncludeTag_header
    Created on : 29.Tem.2022, 14:35:10
    Author     : azuwin_user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
    <!--Header'in kendi icerigi-->
    
    <!--Bu sayfa her yuklendiginde field olarak tanimlanmis olan sayac degerini bir arttiracaktir.-->
    <%!
        int sayac=0;
        void sayac(){
            sayac++;
        }
    %>
    
    <%sayac();%>
    
<center>
    <h1>JSP Include Uygulamasi</h1>
    <h3>Sitemizi <%=sayac%>.kez ziyaret ettiniz.</h3>
</center>
    
    
</body>
</html>
