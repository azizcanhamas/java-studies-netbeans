<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>

        <%
            //Kullanici login ekranindan username bilgisi girerek geldiyse
            //username parametresi dolu olmalidir.
            String username=request.getParameter("username");
            //Kullanici login ekraninda username bilgisini doldurmadiysa
            //veya dogrudan ziyaret.jsp sayfasina geldiyse
            //username degeri dolu olamaz. "misafir" olarak tanimlanir.
            if(username==null)username="misafir";
            
            //Client'da saklanan tum cerezleri al.
            Cookie[]cerezler=request.getCookies();
            Cookie cerezim=null;
            //Sisteme kullanici adi ile giris yapan kullanicinin
            //cerezini bulmaya calis.
            for (Cookie cookie : cerezler) {
                if(cookie.getName().equals(username)){
                    cerezim=cookie;
                    break;
                }
            }
            
            //Eger cerezi bulamadiysan kullanici siteye ilk defa giriyordur.
            //username adiyla 1 degeriyle cerez olustur ve client'a gonder.
            if(cerezim==null){
                cerezim=new Cookie(username,"1");
                cerezim.setMaxAge(3600*1*24);
                response.addCookie(cerezim);
                out.print("<h1>Hosgeldin "+cerezim.getName()+"</h1>");
                out.print("<h1>Sitemizi ilk kez ziyaret ediyorsunuz!</h1>");
            }
            
            //Cerez bulduysan cerezde saklanan ziyaret sayisi degerini bir fazlasiyla guncelle.
            //Guncellenen cerezi client'a geri gonder.
            else{
                cerezim.setValue(String.valueOf(Integer.parseInt(cerezim.getValue())+1));
                response.addCookie(cerezim);
                out.print("Hosgeldin "+cerezim.getName());
                out.print("<h1>Sitemizi "+cerezim.getValue()+". kez ziyaret ediyorsunuz!"+"</h1>");
            }            
        %>

        <p><a href='cerezListele.jsp'>Cerezleri Listele</a></p>
        
</body>
</html>
