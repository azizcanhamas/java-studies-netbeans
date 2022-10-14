<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

       <%
           String ad=request.getParameter("ad");
           String soyad=request.getParameter("soyad");
           String bilmuh=request.getParameter("bilmuh");
           String intprog=request.getParameter("intprog");
           String bilmuhtasarim=request.getParameter("bilmuhtasarim");
       %> 
       
       <%=ad+"<br>"%>
       <%=soyad+"<br>"%>
       <%
           if(bilmuh!=null){
            out.print("Bil.Müh."+"<br>");
           }
           if(intprog!=null){
            out.print("İnternet Programlama"+"<br>");
           }
           if(bilmuhtasarim!=null){
            out.print("Bilgisayar Mühendisliği Tasarımı"+"<br>");
           }
       %>

    </body>
</html>
