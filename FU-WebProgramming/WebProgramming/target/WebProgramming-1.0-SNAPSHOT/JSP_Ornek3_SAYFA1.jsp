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
            String yas=request.getParameter("yas");
            
            session.setAttribute("ad", ad);
            session.setAttribute("soyad", soyad);
            session.setAttribute("yas", yas);
           
        %>
        
        Ad:<%=ad%><br>
        Soyad:<%=soyad%><br>
        Yas:<%=yas%>
        
        <hr>
        
        <a href="JSP_Ornek3_SAYFA2.jsp">2. sayfaya gitmek için tıklayınız.</a>

    </body>
</html>
