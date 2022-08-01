<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
    
    <%@page import="java.sql.Connection" %>
    <%@page import="java.sql.DriverManager" %>
    <%@page import="java.sql.ResultSet" %>
    <%@page import="java.sql.Statement" %>
    <%@page import="java.sql.SQLException" %>
    
    <%!
        public String user="root";
        public String password="";
        public String dbName="dersler";
        public String driverName="com.mysql.jdbc.Driver";

        Connection con=null;
        Statement state=null;
    %>
    
    <% 
        try{
            Class.forName(driverName);
            con=DriverManager.getConnection("jdbc:mysql://localhost/"+dbName+"?user="+user+"&password="+password);
            if (con==null) out.print("Veritabani baglantisi basarisiz!");
            else out.print("Veritabani baglantisi basarili!");
        }
        catch(Exception e){
            out.print(e+"<br>");
        }
        
        //NOT: Birden fazla islem metodu ayni anda calistirilacaksa metotlar icinden baglanti kapatilmamalidir!
//        out.print(ogrenciGetir("Alp")); 
//        out.print("<br>"+ogrenciEkle("Gülşah", "Parlar", "BBT", 96, 75));
//        out.print(dersAdiGuncelle(10, "Görkem", "Caymaz", "Oyun Programlama"));
        out.print(ogrenciSil(21, "Gülşah", "Parlar"));
        
    %>
    
    <%!
        //Tum ogrenci kayitlarini getirir.
        String ogrenciGetir(){
            String sorgu="SELECT * FROM notlar";
            try{
                state=con.createStatement();
                ResultSet set=state.executeQuery(sorgu);
                state.close();
                con.close();
                String tmp="<p>";
                while (set.next()) {
                        tmp+=set.getInt("id")+"   "+set.getString("ad")+"   "+set.getString("soyad")+"   "+set.getString("dersad")+"<br>";
                }
                return tmp;
            }catch(SQLException e) {return "Hata meydana geldi!"+e; }
        }
        
        //Sadece belirtilen isimdeki ogrencilerin kayitlarini getirir.
        String ogrenciGetir(String ad){
            String sorgu="SELECT * FROM notlar WHERE ad=?";
            try{
                PreparedStatement ps=con.prepareStatement(sorgu);
                ps.setString(1,ad);
                ResultSet set=ps.executeQuery();
                ps.close();
                con.close();
                String tmp="<p>";
                while (set.next()) {
                        tmp+=set.getInt("id")+"   "+
                        set.getString("ad")+"   "+
                        set.getString("soyad")+"   "+
                        set.getString("dersad")+"   "+
                        set.getString("vize")+"   "+
                        set.getString("final")+"<br>";
                }
                return tmp;
            }catch(SQLException e) {return "Hata meydana geldi!"+e; }
        }
        
        String ogrenciEkle(String ad,String soyad,String dersad,int vize,int _final){
            String sorgu="INSERT INTO notlar(ad,soyad,dersad,vize,final) VALUES (?,?,?,?,?)";
            try{
                PreparedStatement ps=con.prepareStatement(sorgu);
                ps.setString(1, ad);
                ps.setString(2, soyad);
                ps.setString(3,dersad);
                ps.setInt(4, vize);
                ps.setInt(5, _final);
                ps.executeUpdate();
                ps.close();
                con.close();
            }catch(SQLException e){
                return "<br>Bir hata meydana geldi: <br>"+e;
            }           
            return ad+" "+soyad+" isimli öğrenci için kayıt başarıyla oluşturuldu!";
        }
        
        String dersAdiGuncelle(int id,String ad,String soyad,String yeniDersAdi){
            String sorgu="UPDATE notlar SET dersad=? WHERE id=? AND ad=? AND soyad=?";
            try{
                PreparedStatement ps=con.prepareStatement(sorgu);
                ps.setString(1, yeniDersAdi);
                ps.setInt(2,id);
                ps.setString(3,ad);
                ps.setString(4, soyad);
                ps.executeUpdate();
                ps.close();
                con.close();
                return "Guncelleme basarili!";
            }catch(SQLException e){return "Guncelleme sirasinda hata olustu! : "+e;}      
        }
        
        String ogrenciSil(int id,String ad,String soyad){
            String sorgu="DELETE FROM notlar WHERE id=? AND ad=? AND soyad=?";
            try{
                PreparedStatement ps=con.prepareStatement(sorgu);
                ps.setInt(1, id);
                ps.setString(2, ad);
                ps.setString(3, soyad);
                ps.executeUpdate();
                ps.close();
                con.close();
                return "<p>"+ad+" "+soyad+" isim ve soyisimli ogrencinin kaydı silinmiştir.";
            }catch(SQLException e){
                return "<p>Silme islemi sirasinda hata olustu! : "+e;
            }
        }

    %>

</body>
</html>
