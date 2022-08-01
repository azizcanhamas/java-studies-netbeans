<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <%@include file="database.jsp" %>
    <%
        if((String)session.getAttribute("kimlik")==null)response.sendRedirect("index.jsp");
    %>
    
    <%
        query="SELECT * FROM personel INNER JOIN birimler ON personel.birimKod=birimID INNER JOIN meslekler ON personel.gorevKod=meslekler.meslekID WHERE sicilNo="+request.getParameter("sicilNo");
        state=con.createStatement();
        ResultSet set_inner=state.executeQuery(query);
        set_inner.next();
    %>
    
    <body>
        <div style="margin-left: 40%; margin-top: 10%;">
            <form action="update.jsp" method="get">
                <table border="2">
                    <tr>
                        <td style="text-align: center; font-weight: bold;" colspan="8">Kayıt Güncelleme Ekranı</td>
                    </tr>

                    <tr>
                        <td>Personel Sicil No</td>
                        <td><input type="text" name="sicilNo" value="<%=request.getParameter("sicilNo")%>" readonly/></td>
                    </tr>

                    <tr>
                        <td>Personel Adı</td>
                        <td><input type="text" name="ad" value="<%=set_inner.getString("ad")%>"/></td>
                    </tr>

                    <tr>
                        <td>Personel Soyadı</td>
                        <td><input type="text" name="soyad" value="<%=set_inner.getString("soyad")%>"/></td>
                    </tr>

                    <tr>
                        <td>Personel Birimi</td>
                        <td>
                            <select style="width: 100%;" name="birimID">
                                <option name="birimID" value="<%=set_inner.getString("birimID")%>"><%=set_inner.getString("birimAD")%></option>
                                <%
                                    query="SELECT * FROM birimler";
                                    state=con.createStatement();
                                    set=state.executeQuery(query);
                                    while (set.next()) {
                                        if(set.getString("birimAD").equals(set_inner.getString("birimAD")))continue;
                                %>
                                        <option name="birimID" value="<%=set.getString("birimID")%>"><%=set.getString("birimAD")%></option>
                                <%
                                    }
                                %>
                                
                            </select>
                        </td>
                    </tr>

                    <tr>
                        <td>Personel Mesleği</td>
                        <td>
                            <select style="width: 100%;" name="meslekID">
                                <option name="meslekID" value="<%=set_inner.getString("meslekID")%>"><%=set_inner.getString("meslekAD")%></option>
                                <%
                                    query="SELECT * FROM meslekler";
                                    state=con.createStatement();
                                    set=state.executeQuery(query);
                                    while (set.next()) {
                                        if(set.getString("meslekAD").equals(set_inner.getString("meslekAD")))continue;
                                %>
                                        <option name="meslekID" value="<%=set.getString("meslekID")%>"><%=set.getString("meslekAD")%></option>
                                <%
                                    }
                                %>      
                            </select>
                        </td>
                    </tr>

                    <tr>
                        <td>Personel Maaşı</td>
                        <td>
                            <input type="text" name="maas" value="<%=set_inner.getInt("maas")%>"/>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="8">
                            <input type="submit" style="width:100%;"/>
                        </td>
                    </tr>
                    
                </table>
            </form>
        </div>
    </body>
</html>
