<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String username=request.getParameter("username");
            String password=request.getParameter("password");
            
            // Eger username ve parametre bilgisi 
            // gonderilmediyse giris sayfasina yonlendir.
            if(username==null|| password==null)
                    response.sendRedirect("JSP_Ornek8.jsp");
            else{
                if(username.equals("aligumus")&&password.equals("123456")){
                   response.sendRedirect("JSP_Ornek8_AnaSayfa.jsp");
                }
                else{
                    out.println("GİRİŞ BAŞARISIZ!");
                }
            }       
            
        %>
    </body>
</html>
