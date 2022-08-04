<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
    
    <%!Integer sayac=0;%>
    
    <%
        //Eger kullanici bu sayfaya login sayfasini kullanmadan geldiyse
        //login sayfasina yonlendir. login sayfasinda "action=login" parametresi
        //eklenmektedir.
        if (request.getParameter("action")!=null) {
            String username=request.getParameter("username");
            String password=request.getParameter("password");
            
            //Sistemde kabul edilen username ve password ornek acisindan bu
            //Bu degerler girildiyse sisteme kullanici kabul edilecek.
            if (username.equals("admin")&&password.equals("admin")) {
                //oturum baslat.
                HttpSession oturum=request.getSession(true);
                session.setAttribute("login", "true");
                session.setAttribute("username", username);
                session.setAttribute("ziyaret", sayac);
                //Kullanici 30saniye pasif kalirsa oturumu kapat.
                session.setMaxInactiveInterval(60);
                out.print("<h4>"+session.getAttribute("username")+" isimli kullanicinin oturumu baslatildi!<p>");
                out.print("<a href='detail.jsp'>Oturum Detay</a>");
            }
            else {
                response.sendRedirect("index.jsp");
            }
        }
        else{
            response.sendRedirect("index.jsp");
        }
    %>
    
</body>
</html>
