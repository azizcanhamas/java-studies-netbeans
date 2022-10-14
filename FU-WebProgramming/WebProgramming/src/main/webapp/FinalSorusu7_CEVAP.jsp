<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <jsp:useBean id="veri" class="veri.Kisi"/>
        <jsp:setProperty name="veri" property="*"/>
        
        <%
            String name=request.getParameter("name");
            String surname=request.getParameter("surname");
            String password=request.getParameter("password");
            
            if(name==null||surname==null||password==null)
                response.sendRedirect("FinalSorusu_7.html");
                
            else{
                if(veri.sifreKontrol(name, surname, password)){
                    out.println("Merhaba "+name+" "+surname+" "+password+" sitemize hoşgeldiniz!");
                    out.println("<br> * Yeni kullanıcı ekle");
                    out.println("<br> * Kullanıcı görüntüle");
                }
                else{
                    out.println("GİRİŞ BAŞARISIZ!<br>");
                    out.println("<a href=\"FinalSorusu_7.html\">Ana sayfaya gitmek için tıklayın.</a>");
                }
            }
        %>

    </body>
</html>
