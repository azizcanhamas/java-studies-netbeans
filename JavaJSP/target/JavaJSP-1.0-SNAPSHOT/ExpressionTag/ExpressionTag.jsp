<%-- 
    Document   : ExpressionTag
    Created on : 29.Tem.2022, 09:39:36
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
    <h1>Hello World!</h1>
    
    
    <%--  Expression Tag : <%= %> ile gerçekleştirilir.--%>
    <%-- 
        Tek satırlık ekran çıktı blogudur. 
        Blogun sonunda ';' yer alamaz. 
        '=' ifadesinden önce boşluk bırakılamaz. 
    --%>
    
    
    <%-- ÖRNEK-2 : Expression(İfade) Tag Kullanimi--%>
    <%
        String ulkem1="Turkiye";
        String ulkem2="Azerbaycan";
        String ulkem=ulkem1+" "+ulkem2;    
    %>    
    <%= "<p>"+ulkem%>
    <%= "<p>"+ulkem1.concat(ulkem2)%>
    
</body>
</html>
