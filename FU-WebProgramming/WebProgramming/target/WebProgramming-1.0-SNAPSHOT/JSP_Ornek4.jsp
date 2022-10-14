<%-- 
    Document   : JSP_Ornek4
    Created on : Oct 12, 2022, 3:25:51 PM
    Author     : azu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h5>SEÇ</h5>
        <form onsubmit="JSP_Ornek4.jsp">
            <label for="resim">Resim</label>
            <input type="checkbox" name="sec" value="Resim"><br>
            <label for="muzik">Müzik</label>
            <input type="checkbox" name="sec" value="Müzik"><br>
            <label for="kitap">Kitap</label>
            <input type="checkbox" name="sec" value="Kitap"><br>
            <input type="submit"><br>
        </form>
        
        <%
            String secimler[]=request.getParameterValues("sec");
            if(secimler!=null){
                for(int i=0;i<secimler.length;i++){
                    out.print(secimler[i]+"<br>");
                }
            }
        %>
        
    </body>
</html>
