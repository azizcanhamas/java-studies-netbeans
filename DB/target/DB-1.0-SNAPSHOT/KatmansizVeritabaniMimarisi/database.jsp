<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
    
    <!--
        Database: sirketim
        
    Table: admin
        username : varchar(10) PrimaryKey
        password : varchar(10)
        
    Table: birimler
        birimID : int (3) PrimaryKey Auto_Increment
        birimAD : varchar(50)
        
    Table: meslekler
        meslekID : int (3) PrimaryKey Auto_Increment
        meslekAD : varchar(50)
        
    Table: personel
        sicilNo : int (3) PrimaryKey Auto_Increment
        ad / soyad : varchar(50)
        birimKod / gorevKod : int(3) / maas: int(6)
    -->
    
    <%@page import="java.sql.Connection" %>
    <%@page import="java.sql.DriverManager" %>
    <%@page import="java.sql.ResultSet" %>
    <%@page import="java.sql.Statement" %>
    <%@page import="java.sql.SQLException" %>
    <%@page import="java.sql.PreparedStatement"%>
    <%@page import="java.sql.ResultSet" %>
    
    
    
    <%
        String query=null;
        PreparedStatement ps=null;
        Connection con=null;
        Statement state=null;
        ResultSet set=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/sirketim?user=root&password=");
            if (con==null) out.print("<br>Veritabanina baglanti basarisiz!<br>");
            else{
//                out.print("<br>Veritabani ile basariyla baglanti kuruldu.<br>");
                
            }
        }catch(Exception e){
            out.print("<br>Veritabani baglantisi sirasinda hata meydana geldi! HATA: "+e+"<br>");
        }
    
    %>
    
</body>
</html>
