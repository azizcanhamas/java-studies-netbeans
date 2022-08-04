<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
    
    <%@page import="java.util.Date" %>
    
    <%
        HttpSession oturum=request.getSession(true);
        if(oturum.getAttribute("login")=="true"){
            Date ilkErisimTarihi=new Date(session.getCreationTime());
            Date sonErisimTarihi=new Date(session.getLastAccessedTime());
            int sayac=(Integer)session.getAttribute("ziyaret");
            sayac++;
            session.setAttribute("ziyaret", sayac);
            
            out.println("Oturum Adı                  : "+session.getAttribute("username")+"<br>");
            out.println("Oturum ID                   : "+session.getId()+"<br>");
            out.println("Maksimum Pasif Oturum Suresi: "+session.getMaxInactiveInterval()/60+" dakika<br>");
            out.println("İlk Erişim Tarihi           : "+ilkErisimTarihi+"<br>");
            out.println("Son Erişim Tarihi           : "+sonErisimTarihi+"<br>");
            out.println("İstek Sayısı                : "+sayac+"<br>");
            out.println("<hr><a href='index.jsp'>Yeni Oturum</a><br>");
            out.println("<a href='logout.jsp'>Oturumu Kapat</a><br>");
            
        }
        else response.sendRedirect("index.jsp");
        
    %>
    
</body>
</html>
