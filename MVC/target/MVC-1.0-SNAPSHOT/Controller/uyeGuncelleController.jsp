<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
    <%@page import="Model.uyeModel" %>
    <%@page import="java.util.ArrayList" %>
    
    <%!
        public ArrayList<String> getUye(String username){
            uyeModel m=new uyeModel();
            return m.getUye(username);
        }
    %>
    
    <%
        Class.forName("com.mysql.jdbc.Driver");
        if(session.getAttribute("username")==null)response.sendRedirect("../View/adminLogin.jsp");        
        else if(request.getParameter("guncelle")==null){
            String yeniKullaniciAdi=request.getParameter("yeniKullaniciAdi");
            String yeniAd=request.getParameter("ad");
            String yeniSoyad=request.getParameter("soyad");
            String yeniIl=request.getParameter("il");
            String yeniIletisimAdresi=request.getParameter("iletisimAdresi");
            String eskiKullaniciAdi=request.getParameter("eskiKullaniciAdi");
            
            uyeModel m=new uyeModel();
            m.uyeBilgileriGuncelle(eskiKullaniciAdi, yeniKullaniciAdi, yeniAd, yeniSoyad, yeniIl, yeniIletisimAdresi); 
            response.sendRedirect("../View/uyeListele.jsp");
        }
    %>

</body>
</html>
