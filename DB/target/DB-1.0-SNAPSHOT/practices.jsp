<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>

    <%@page import="java.sql.Connection" %>
    <%@page import="java.sql.DriverManager"%>
    <%@page import="java.sql.ResultSet"%>
    <%@page import="java.sql.Statement" %>
    <%@page import="java.sql.SQLException" %>
    
    <% //SQL sorgusu ile ""dersler" adinda veritabaninin olusturulmasi      
//        Connection con=null;
//        Statement state=null;       
//        try{
//            Class.forName("com.mysql.jdbc.Driver");
//            con=DriverManager.getConnection("jdbc:mysql://localhost/?user=root&password=");
//            if (con==null) {
//                out.print("Veritabani baglantisi basarisiz!");
//            }
//            else {
//                out.print("Veritabani baglantisi basarili!");
//                
//                String sorgu="CREATE DATABASE dersler";
//                state=con.createStatement();
//                state.executeUpdate(sorgu);
//                state.close();
//                con.close();
//            }
//        }catch(Exception e){
//            out.print(e);
//        }
        
 %>
 
 <% //"dersler" isimli veritabanina baglanilmasi
//        Connection con=null;
//        Statement state=null;
//        try{
//            Class.forName("com.mysql.jdbc.Driver");
//            con=DriverManager.getConnection("jdbc:mysql://localhost/dersler?user=root&password=");
//            if (con==null) out.print("Veritabani baglantisi basarisiz!");
//            else out.print("Veritabani baglantisi basarili!");            
//        }catch(Exception e){ out.print(e); }

%>

<%
    Connection con=null;
    Statement state=null;    
    try{
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost/dersler?user=root&password=");
        if(con==null) out.print("Veritabani baglantisi basarisiz!");
        else {
            out.print("Veritabani baglantisi basarili!");

            
            //Tablo olusturulmasi
//            String sorgu="CREATE TABLE notlar (id INT PRIMARY KEY AUTO_INCREMENT,"
//            + "ad VARCHAR(50) NOT NULL, "
//            + "soyad VARCHAR(50) NOT NULL,"
//            + " dersad VARCHAR(50) NULL,"
//            + " vize INT NULL,"
//            + " final INT NULL)";
//            state=con.createStatement();
//            state.executeUpdate(sorgu);
//            state.close();
//            con.close();
//            out.print("<p> Tablo olusturuldu!");


            //notlar tablosuna veri eklenmesi
//            String sorgu="INSERT INTO notlar(id,ad,soyad,dersad,vize,final) VALUES(1,'Hakan','Yilmaz','BBT',40,50)";
//            state=con.createStatement();
//            state.executeUpdate(sorgu);
//            state.close();
//            con.close();
//            out.print("<p>Veri ekleme basarili!");


            //notlar tablosuna veri eklenmesi YONTEM-2
//            String sorgu="INSERT INTO notlar VALUES(5,'Canan','Su','Mikroislemciler',58,69)";
//            state=con.createStatement();
//            state.executeUpdate(sorgu);
//            state.close();
//            con.close();
//            out.print("<p> Veri ekleme basarili!");


            //notlar tablosuna veri eklenmesi YONTEM-3
            //dersad,vize,final sutunlari NULL olarak tanimlandigi ve deger
            //gonderilmedigi icin NULL olarak deger atanacaktir.
//            String sorgu="INSERT INTO notlar(id,ad,soyad) VALUES(7,'Guler','Can')";
//            state=con.createStatement();
//            state.executeUpdate(sorgu);
//            state.close();
//            con.close();
//            out.print("<p>Veri ekleme basarili!");


            //UPDATE komutu ile bir sutunun guncellenmesi
//            String sorgu="UPDATE notlar SET final=89";
//            state=con.createStatement();
//            state.executeUpdate(sorgu);
//            state.close();
//            con.close();
//            out.print("<p> Veri guncelleme basarili!");


            //WHERE ile kosul kosarak bir sutunun guncellenmesi
//            String sorgu="UPDATE notlar SET final=65 WHERE final>80";
//            state=con.createStatement();
//            state.executeUpdate(sorgu);
//            state.close();
//            con.close();
//            out.print("<p> Kosullu veri guncelleme basarili!");


            //Veritabanindaki bir tablonun tum iceriginin silinmesi
//            String sorgu="DELETE FROM notlar";
//            state=con.createStatement();
//            state.executeUpdate(sorgu);
//            state.close();
//            con.close();
//            out.print("<p> Tablo icerigi silme basarili!");

            //Veritabanindaki verilerin kosullu olarak silinmesi
            //dersad degeri NULL olanlari siler.
//            String sorgu="DELETE FROM notlar WHERE dersad IS NULL";
//            state=con.createStatement();
//            state.executeUpdate(sorgu);
//            state.close();
//            con.close();
//            out.print("<p>Kosullu veri silme basarili!");


            //notlar tablosundaki tum verileriin yazdirilmasi
//            String sorgu="SELECT * FROM notlar";
//            state=con.createStatement();
//            ResultSet set=state.executeQuery(sorgu);
//            out.print("<p>Veriler yazdiriliyor....<br><hr>");
//            while(set.next()){
//                out.print(set.getInt("id")+"  ");
//                out.print(set.getString("ad")+"  ");
//                out.print(set.getString("soyad")+"  ");
//                out.print(set.getString("dersad")+"  ");
//                out.print(set.getInt("vize")+"  ");
//                out.print(set.getInt("final")+"  <br>");
//            }
//            state.close();
//            con.close();


            //notlar tablosundan belirtilen sutunlari getir.
//            String sorgu="SELECT id,ad,soyad FROM notlar";
//            state=con.createStatement();
//            ResultSet set=state.executeQuery(sorgu);
//            while(set.next()){
//                out.print(set.getInt("id")+"  ");
//                out.print(set.getString("ad")+"  ");
//                out.print(set.getString("soyad")+"  <br>");               
//            }
            
            //Sutun isimlerinin daha uygun sekilde gosterilmesi.
            //HTML'de gozlemlenemedi,manuel yazdirildi. phpMyAdmin'de gozlemlendi.
//            String sorgu="SELECT id as 'Ogrenci No',ad as 'Adı',soyad as 'Soyadı' FROM notlar";
//            state=con.createStatement();
//            ResultSet set=state.executeQuery(sorgu);
//            out.print("<p>Ogrenci No  Adı  Soyadı<br>");
//            while(set.next()){
//                out.print(set.getInt("Ogrenci No")+"  ");
//                out.print(set.getString("Adı")+"  ");
//                out.print(set.getString("Soyadı")+"  <br>");
//            }
            

            //dersad degeri Mikroişlemciler olan verileri tüm sütunlarla getir.
//            String sorgu="SELECT * FROM notlar WHERE dersad='Mikroişlemciler'";
//            state=con.createStatement();
//            ResultSet set=state.executeQuery(sorgu);
//            out.print("<p>");
//            while (set.next()) {
//                out.print(set.getInt("id")+"  ");
//                out.print(set.getString("ad")+"  ");
//                out.print(set.getString("soyad")+"  <br>");
//            }





            //final not degeri 74 olan tum kayitlari tum sutunlarla getir.
//            String sorgu="SELECT * FROM notlar WHERE final=50 OR final=74";

            //final not degeri 47,48,52,64 degerlerinden herhangi biri olan
            //tum kayitlari tum sutunlarla getir.
//            String sorgu="SELECT * FROM notlar WHERE final IN(47,48,52,64)";

            //vize not degeri 50'den buyuk veya esit VE 85'den kucuk veya esit
            //olan tum kayitlari getir.
//            String sorgu="SELECT * FROM notlar WHERE vize>=50 AND vize<=85";

            //vize not degeri NULL olmayan tum kayitlari getir.
//            String sorgu="SELECT * FROM notlar WHERE vize IS NOT NULL";
        
            //dersad degeri A ile baslayan tum kayitlari tum sutunlarla getir.
//            String sorgu="SELECT * FROM notlar WHERE dersad LIKE 'A%'";
                
            //dersad degerinin herhangi bir yerinde 'A' bulunan tum kayitlari tum sutunlarla getir.
//            String sorgu="SELECT * FROM notlar WHERE dersad LIKE '%A%'";

            //dersad degerine gore sirali bir sekilde tum kayitlari tum sutunlarla getir.
//            String sorgu="SELECT * FROM notlar ORDER BY dersad ASC";

            //dersad degerine gore sirali bir sekilde tum kayitlari tum sutunlarla getir.
            //dersad degeri ayni olanlari da kendi icinde soyad degerine gore sirala.
//            String sorgu="SELECT * FROM notlar ORDER BY dersad,soyad ASC";
            
            //dersad degeri 'Mikroişlemciler' olan tüm kayıtları id numarasina
            //gore sirali bir sekilde getir.
//            String sorgu="SELECT * FROM notlar WHERE dersad='Mikroişlemciler' ORDER BY id";
            
            //SELECT * FROM ILE BASLAYAN ORNEKLER ICIN YAZDIRMA SCRIPTI
//            state=con.createStatement();
//            ResultSet set=state.executeQuery(sorgu);
//            out.print("<p>");
//            while (set.next()) {
//                out.print(set.getInt("id")+"  ");
//                out.print(set.getString("ad")+"  ");
//                out.print(set.getString("soyad")+"  ");
//                out.print(set.getString("dersad")+"  ");
//                out.print(set.getInt("vize")+"  ");
//                out.print(set.getInt("final")+"  <br>");
//            }



            //dersad sutunundaki degerleri her degerden bir tane olacak
            //sekilde getir.
//            String sorgu="SELECT DISTINCT dersad FROM notlar";
//            state=con.createStatement();
//            ResultSet set=state.executeQuery(sorgu);
//            out.print("<p>");
//            while (set.next()) {
//                out.print(set.getString("dersad")+"<br>");
//            }
            
            //dersad sutununda bulunan NULL olmayan deger sayisini bulur.
//            String sorgu="SELECT COUNT(dersad) as value from NOTLAR";
            
            //dersad sutununda bulunan birbirinden farkli olan deger sayisini bulur.
//            String sorgu="SELECT COUNT(DISTINCT dersad) as value from NOTLAR";      
            
            //vize sutununda bulunan en dusuk degeri bulur..
//            String sorgu="SELECT MIN(vize) as value from NOTLAR";      
            
            //Mikroişlemciler dersinde alinan en yuksek final notunu doner.
//            String sorgu="SELECT MAX(final) as value from NOTLAR WHERE dersad='Mikroişlemciler'";      
            
            //Algoritma ve Programlama dersinde alinan final notlarinin toplamini doner.
//            String sorgu="SELECT SUM(final) as value from NOTLAR WHERE dersad='Algoritma ve Programlama-1'";
            
            //Benzetim ve Modelleme dersinde alinan vize notlarının ortalamasini doner.
//            String sorgu="SELECT AVG(vize) as value from NOTLAR WHERE dersad='Benzetim ve Modelleme'";

            // "value" CIKTI VERECEK SORGULAR ICIN CIKTI SCRIPTI
//            state=con.createStatement();
//            ResultSet set=state.executeQuery(sorgu);
//            while (set.next()) {
//                out.print(set.getInt("value")+"<br><br>");
//            }
  

            //tum sutunlari yazar ayrica 'Ortalama' adinda bir sutunda ders ortalamasini yazar.
//            String sorgu="SELECT id,ad,soyad,dersad,vize,final,vize*0.4+final*0.6 as 'Ortalama' FROM notlar";
//            state=con.createStatement();
//            ResultSet set=state.executeQuery(sorgu);
//            out.print("<p>");
//            while (set.next()) {
//                out.print(set.getInt("id")+"  ");
//                out.print(set.getString("ad")+"  ");
//                out.print(set.getString("soyad")+"  ");
//                out.print(set.getString("dersad")+"  ");
//                out.print(set.getInt("vize")+"  ");
//                out.print(set.getInt("final")+"  ");
//                out.print(set.getInt("ortalama")+"  <br>");
//           }

            //dersad sutununda bulunan ayni degerleri kumeler ve bu kumelerdeki
            //eleman sayisini yazdirir.
//            String sorgu="SELECT dersad,COUNT(dersad) as count from NOTLAR GROUP BY dersad";
//            state=con.createStatement();
//            ResultSet set=state.executeQuery(sorgu);
//            out.print("<p>");
//            while (set.next()) {
//                    out.print(set.getString("dersad")+"    ");
//                    out.print(set.getString("count")+"<br>");
//            }

            //dersad sutununda bulunan ayni degerleri kumeler ve her kumede
            //bulunan kayitlarin vize ortalamasini alir.
//            String sorgu="SELECT dersad,AVG(vize) as 'Vize Ort.' from notlar GROUP BY dersad";
//            state=con.createStatement();
//            ResultSet set=state.executeQuery(sorgu);
//            out.print("<p>");
//            while (set.next()) {
//                    out.print(set.getString("dersad")+"    ");
//                    out.print(set.getDouble("Vize Ort.")+"<br>");
//            }
    }
    }catch(Exception e){
        out.print("<p> BASARISIZ: "+e);
    }
%>    

    
</body>
</html>