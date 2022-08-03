<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
    
    <%@page import="Model.uyeModel" %>
    <%
        if(session.getAttribute("username")==null)response.sendRedirect("../View/adminLogin.jsp");
        else{
            String username=request.getParameter("username");
            String ad=request.getParameter("ad");
            String soyad=request.getParameter("soyad");
            String il=request.getParameter("il"); //kod olarak geliyor!
            String iletisimAdresi=request.getParameter("iletisimAdresi");

            uyeModel m=new uyeModel();
            boolean status=m.uyeEkle(username, ad, soyad, il, iletisimAdresi);
            if(status)response.sendRedirect("../View/uyeListele.jsp");
            else response.sendRedirect("../View/adminPanel.jsp");
        }
    %>
    
</body>
</html>
