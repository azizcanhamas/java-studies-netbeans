<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
    <h2>Localhost Sunucusunun Çerez Listesi</h2>
    <%
        //Client'da tanimli cerezleri al.
        Cookie[]cerezler=request.getCookies();
        if(cerezler!=null){
            for (Cookie cerez : cerezler) {
                out.println("<p>"+cerez.getName()+":   "+cerez.getValue()+"<br>");
            }
        }
    %>
    
    <p><a href="cerezSil.jsp">Çerez Sil</a></p>
    <p><a href="index.jsp">Çerez Tanımla</a></p>
</body>
</html>
