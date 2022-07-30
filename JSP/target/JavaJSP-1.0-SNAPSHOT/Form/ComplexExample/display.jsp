<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
    
    <%!
        boolean bilgiKontrol(String s){
            if(s.trim().length()==0)return false;
            else return true;
        }
    %>
    
    <%
        //"ı" harfi sıkıntı yapıyordu, çözüldü.
        request.setCharacterEncoding("UTF-8");
        
        String ad=request.getParameter("ad");
        String soyad=request.getParameter("soyad");
        String cinsiyet=request.getParameter("cinsiyet");
        String dogumGun=request.getParameter("gun");
        String dogumAy=request.getParameter("ay");
        String dogumYil=request.getParameter("yil");
        //Ayni "name" ile tanimli birden fazla checkbox var. Birden fazla
        //deger gelebileceginden getParameterValues() ile degerler alinmali
        //ve String dizisine aktarilmali.
        String[] meslekiBirikim=request.getParameterValues("meslekiBirikim");
        String hedef=request.getParameter("hedef");
        
        if (bilgiKontrol(ad))out.print("Adiniz: "+ad+"<p>");          
        else out.print("Adiniz eksik!"+"<p>");
        if (bilgiKontrol(soyad))out.print("Soyadiniz "+soyad+"<p>");          
        else out.print("Soyadiniz eksik!"+"<p>");
        out.print("Cinsiyetiniz: "+cinsiyet+"<p>");
        out.print("Doğum gün: "+dogumGun+"<p>");
        out.print("Doğum ay : "+dogumAy+"<p>");
        out.print("Doğum yil: "+dogumYil+"<p>");
        if (meslekiBirikim.length==0) out.println("Hic mesleki birikiminiz yok!"+"<p>");
        else {
            out.print("Mesleki birikimleriniz:"+"<p>");
            for (String  s : meslekiBirikim)out.print(s+"<p>");      
        }
        out.print("Hedefleriniz: "+hedef+"<p>");
    %>
    
</body>
</html>
