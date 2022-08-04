<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>

    <%
        //Eger oturum yeni degilse
        if(!session.isNew()){
            //Login ekraninda girilen username,password ve hatirlanma
            //durumu degerlerini degiskenlere al.
            String username=request.getParameter("username").trim();
            String password=request.getParameter("password").trim();
            String hatirla=request.getParameter("hatirla");
            String unut=request.getParameter("unut");
            
            //Eger kullanici "hatirla" secenegini sectiyse cookie olustur.
            if(hatirla!=null){
                //username ve password degerlerini ayri cookie'lerde tut.
                Cookie usernameCookie=new Cookie("username",username);
                Cookie passwordCookie=new Cookie("password",username);
                usernameCookie.setMaxAge(3600*1*24); //1gun cerez omru
                passwordCookie.setMaxAge(3600*1*24); //1gun cerez omru
                session.setMaxInactiveInterval(300); //max 5dk pasif oturum.
                response.addCookie(usernameCookie);
                response.addCookie(passwordCookie);
            }
            
            //Eger kullanici "unut" secenegini sectiyse username ve password
            //bilgilerini tutan cookie'leri sil.
            else if(unut!=null){
                //tum cerezleri al.
                Cookie[]cerezler=request.getCookies();
                if(cerezler!=null){
                    for (Cookie cookie : cerezler) {
                        // login ekraninda girilen username ve password 
                        // degerlerini tutan cookie'leri sil.
                        if(cookie.getValue().equals(username)||cookie.getValue().equals(password)){
                            cookie.setMaxAge(0);
                            response.addCookie(cookie);
                        }
                    }
                }      
            }
            //Kullanici sisteme alindi. Oturuma username ve password bilgisini sakla.
            session.setAttribute("username", username);
            session.setAttribute("password", password);
            response.sendRedirect("login.jsp");    
        }
        else response.sendRedirect("index.jsp");
    
    %>

</body>
</html>
