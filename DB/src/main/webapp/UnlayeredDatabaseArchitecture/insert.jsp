<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
    
    <%@include file="database.jsp" %>
    
    <%
        if ((String)session.getAttribute("kimlik")==null) 
                response.sendRedirect("index.jsp");
    %>
    
    <%
        String ad=request.getParameter("ad");
        String soyad=request.getParameter("soyad");
        int birimID=Integer.parseInt(request.getParameter("birimAD"));
        int meslekID=Integer.parseInt(request.getParameter("meslekAD"));
        int maas=Integer.parseInt(request.getParameter("maas"));
        
        query="INSERT INTO personel(ad,soyad,birimKod,gorevKod,maas) VALUES(?,?,?,?,?)";
        try{
            ps=con.prepareStatement(query);
            ps.setString(1, ad);
            ps.setString(2, soyad);
            ps.setInt(3, birimID);
            ps.setInt(4, meslekID);
            ps.setInt(5, maas);
            ps.executeUpdate();
            response.sendRedirect("list.jsp");
        }
        catch(SQLException e){out.print("HATA: "+e);}
          
    %>
    
</body>
</html>
