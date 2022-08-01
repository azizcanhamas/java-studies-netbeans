<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
    </head>
    <body>
        
        <%@include file="database.jsp" %>
        <%
            //"index.jsp" sayfasinda session nesnesine aktarilan "kimlik" degisken
            //adina sahip username bilgisini al.
            String s=(String)session.getAttribute("kimlik");
            //Eger "null" ise dogrudan oturum acilmadan bu sayfaya girilmeye calisiliyordur.
            //Kullanicinin oturum acmasi icin "index.jsp" sayfasina yonlendir.
            if(s==null)response.sendRedirect("index.jsp");
        %>
    <div style="margin-left:25%; width:75%;">
        <form action="list.jsp?action=yes">
            <table border="2" style="width:50%;">
                <tr>
                    <th><input type="text" id="arama" name="arama" placeholder="Adinizi ve soyadinizi giriniz." style="width:98%;"/></th>
                    <th><input type="submit" id="gonder" name="gonder" style="width:98%;"/></th>
                </tr>
            </table>
        </form><p>
        
        <%
            if (request.getParameter("arama")!=null){
                query="SELECT * FROM personel WHERE ad LIKE ? OR soyad LIKE ?";
                try{
                    ps=con.prepareStatement(query);
                    ps.setString(1, request.getParameter("arama")+"%");
                    ps.setString(2, request.getParameter("arama")+"%");
                    set=ps.executeQuery();
                }
                catch(SQLException e){out.println("HATA: "+e);}
            }
                
                
            else {
                query="SELECT * FROM personel";
                try{
                    state=con.createStatement();
                    set=state.executeQuery(query);
                }catch(SQLException e){out.println("HATA: "+e);}
            }            
        %>
                <table border="2" style="width:50%;">
                    <tr>
                        <td style="font-weight: bold; text-align: center;">Sicil Numarası</td>
                        <td style="font-weight: bold; text-align: center;">Ad</td>
                        <td style="font-weight: bold; text-align: center;">Soyad</td>
                        <td style="font-weight: bold; text-align: center;" colspan="6">İşlemler</td>
                    </tr>
        <%
                    while(set.next()){
        %>
                        
                        <tr>
                            <td style="text-align: center;"><%=set.getInt("sicilNo")%></td>
                            <td style="text-align: center;"><%=set.getString("ad")%></td>
                            <td style="text-align: center;"><%=set.getString("soyad")%></td>
                            <td colspan="2" style="text-align: center;"><a href="detail.jsp?sicilNo=<%=set.getInt("sicilNo")%>"><input  type="submit" value="Detay" style="width:100%;"/></a></td>
                            <td colspan="2" style="text-align: center;"><a href="updateform.jsp?sicilNo=<%=set.getInt("sicilNo")%>"><input  type="submit" value="Güncelle" style="width:100%;"/></a></td>
                            <td colspan="2" style="text-align: center;"><a href="delete.jsp?sicilNo=<%=set.getInt("sicilNo")%>"><input  type="submit" value="Sil" style="width:100%;"/></a></td>
                        </tr> 
                                               
        <%              
            }      
        %>
                <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>
                <tr>
                    <td colspan="8"><a href="insertform.jsp"><input type="submit" value="Ekle" style="width:100%;"/></a></td>
                </tr>
            </table>
        </div>
    </body>
</html>
