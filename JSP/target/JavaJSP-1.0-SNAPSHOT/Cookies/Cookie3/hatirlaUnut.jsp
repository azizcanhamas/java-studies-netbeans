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
        String hatirla=request.getParameter("hatirla");
        String unut=request.getParameter("unut");
        
        //========= CEREZI OLMAYAN KULLANICILAR ICIN KONTROLLER ===============?
        
        //Eger kullanicinin cerezi yoksa ve "hatirla" secenegini secmediyse taninmayacak.
        if(request.getParameter("cerez")==null&&request.getParameter("hatirla")==null)
        {
            out.print("Seni tanimiyorum!");
        }
        
        //Eger kullanicinin cerezi yoksa ve hatirla'yi sectiyse cerez olusturulmalidir.
        else if(request.getParameter("cerez")==null&&hatirla!=null){
            Cookie usernameCookie=new Cookie("username",username);
            Cookie passwordCookie=new Cookie("password",password);
            usernameCookie.setMaxAge(360*7*24);
            passwordCookie.setMaxAge(360*7*24);
            response.addCookie(usernameCookie);
            response.addCookie(passwordCookie);
            out.print("Seni artik taniyorum!");
        }
        
        //=========== CEREZI OLAN KULLANICILAR ICIN KONTROLLER =================
        //Eger kullanicinin cerezi varsa ve unut'u sectiyse cerez silinmelidir.
        else if(request.getParameter("cerez")!=null && unut!=null){
            Cookie []cerezler=request.getCookies();
            for (Cookie cerez : cerezler) {
                if(cerez.getValue().equals(username) || cerez.getValue().equals(password)){
                    cerez.setMaxAge(0);
                    response.addCookie(cerez);
                }
            }
            out.print("Seni unuttum!");
        }
        
        //Eger kullanicinin cerezi varsa ve unut'u secmediyse cerez'e dokunulmaz.
        else if(request.getParameter("cerez")!=null && unut==null){
            out.print("Seni taniyorum!");
        }

    %>

</body>
</html>
