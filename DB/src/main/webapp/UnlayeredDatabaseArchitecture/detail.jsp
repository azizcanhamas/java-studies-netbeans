<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body style="margin-left:40%; margin-top:20%;">
    
    <%@include file="database.jsp"%>
    <%
        if((String)session.getAttribute("kimlik")==null)
            response.sendRedirect("index.jsp");
    %>
    
    <%
        int sicilNo=Integer.parseInt(request.getParameter("sicilNo"));
        
        //personel tablosunu meslekler tablosu ile personsel tablosunun gorevKod ve meslekler tablosunun meslekID tablolarini baz alarak birlestir.
        //ayni sekilde personel birimler tablosu personel tablosunun birimKod ve birimler tablosunun birimID tablosunu baz alarak birlestir.
        query="SELECT * FROM personel INNER JOIN meslekler ON personel.gorevKod=meslekler.meslekID "
                + "INNER JOIN birimler ON personel.birimKod=birimler.birimID "
                + "WHERE sicilNo="+sicilNo;
        try{
            state=con.createStatement();
            set=state.executeQuery(query);
        }catch(SQLException e){out.println("HATA: "+e);}
        
        if(set!=null) {
            set.next();  
    %>  
            <table border="2" style="width:250px;">
                <tr><td colspan="8" style="text-align:center;">Personel Detay Ekranı</td></tr>
                <tr>
                    <td>Sicil Numarası</td>
                    <td colspan="8" style="text-align:center;"><%=set.getInt("sicilNo")%></td>
                </tr>
                <tr>
                    <td>Adı</td>
                    <td colspan="8" style="text-align:center;"><%=set.getString("ad")%></td>
                </tr>
                <tr>
                    <td>Soyadı</td>
                    <td colspan="8" style="text-align:center;"><%=set.getString("soyad")%></td>
                </tr>
                <tr>
                    <td>Birim Adı</td>
                    <td colspan="8" style="text-align:center;"><%=set.getString("birimAD")%></td>
                </tr>
                <tr>
                    <td>Meslek Adı</td>
                    <td colspan="8" style="text-align:center;"><%=set.getString("meslekAD")%></td>
                </tr>
                <tr>
                    <td>Maaşı</td>
                    <td colspan="8" style="text-align:center;"><%=set.getInt("maas")%></td>
                </tr>
                
                <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>
                <tr>
                    <td style="width: 100%;" colspan="8"><a href="list.jsp"><input type="submit" value="Listele" style="width: 100%;"/></a></td>
                </tr>
            </table>
    <%}
        
    %>
</body>
</html>
