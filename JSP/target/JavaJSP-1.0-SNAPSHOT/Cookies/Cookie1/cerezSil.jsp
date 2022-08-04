<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
    
    <%
        //Client'dan cerezleri al.
        out.print("<h1>Silinen Çerezler</h1><hr>");
        Cookie []cerezler=request.getCookies();
        if(cerezler!=null){
            for (Cookie cerez : cerezler) {
                //Her cerezin zaman asimi degerini "0" yap.
                cerez.setMaxAge(0);
                //Cerezleri client'a gonder.(Otomatik silinecek.)
                response.addCookie(cerez);
                out.print(cerez.getName()+"<br>");
            }
        }
        
    %>
    
</body>
</html>
