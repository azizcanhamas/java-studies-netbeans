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
       if((String)session.getAttribute("kimlik")==null)
            response.sendRedirect("index.jsp");
   %>
   
   <form action="insert.jsp" method="get">
        <table border="2" style="margin-left: 40%; margin-top: 10%;">
            <tr>
                <td colspan="8" style="text-align: center; font-weight: bold;">Personel kayıt formunu doldurunuz.</td>
            </tr>
            
            <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>

            <tr>
                <td style="font-weight: bold; font-size:14px;">Personel Adı</td>
                <td><input type="text" name="ad"/></td>
            </tr>

            <tr>
                <td style="font-weight: bold; font-size:14px;">Personel Soyadı</td>
                <td><input type="text" name="soyad"/></td>
            </tr>

            <tr>
                <td style="font-weight: bold; font-size:14px;">Personel Birimi</td>
                <td>
                    <select style="width: 100%;" name="birimAD">
                        <%
                            query="SELECT * from birimler ORDER BY birimAD ASC";
                            state=con.createStatement();
                            set=state.executeQuery(query);
                            while (set.next()) {
                         %>
                         <option value="<%=set.getInt("birimID")%>">
                             <%=set.getString("birimAD")%>
                         </option>
                         <%
                             }
                        %>
                    </select>
                 </td>
            </tr>

            <tr>
                <td style="font-weight: bold; font-size:14px;">Personel Mesleği</td>
                 <td>
                     <select style="width: 100%;" name="meslekAD">
                        <%
                            query="SELECT * from meslekler ORDER BY meslekAD ASC";
                            state=con.createStatement();
                            set=state.executeQuery(query);
                            while (set.next()) {
                         %>
                         <option value="<%=set.getInt("meslekID")%>">
                             <%=set.getString("meslekAD")%>
                         </option>
                         <%
                             }
                        %>
                    </select>
                 </td>
            </tr>

            <tr>
                <td style="font-weight: bold; font-size:14px;">Personel Maaşı</td>
                <td><input type="text" name="maas"/></td>
            </tr>

            <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>

            <tr>
                <td colspan="8"><a><input type="submit" value="Ekle" style="width:100%; font-weight: bold;"/></a></td>
            </tr>

        </table>
   </form>
   
   
</body>
</html>
