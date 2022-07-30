<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
    
    <!-- Kullaniciya degerlerin gosterilmesi -->
    <%
        out.println(request.getParameter("ad")+"<html><br></html>");
        out.println(request.getParameter("soyad")+"<html><br></html>");
        out.println(request.getParameter("fakulte")+"<html><br></html>");
        out.println(request.getParameter("bolum")+"<html><br></html>");
        out.println(request.getParameter("ogrno")+"<html><br></html>");
        out.println(request.getParameter("sehir")+"<html><br></html>");
    %>
    
</body>
</html>
