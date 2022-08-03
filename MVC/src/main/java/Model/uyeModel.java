package Model;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class uyeModel{    
    private String username="root";
    private String password="";    

    private String query="";
    private Statement state;
    private PreparedStatement prepare;
    private ResultSet set;
    private Connection conn;
    
    public boolean uyeEkle(String kullaniciAdi, String ad, String soyad, String il, String adres){   
        query="INSERT INTO uyeler(kullaniciAdi,ad,soyad,il,adres) VALUES(?,?,?,?,?)";
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost/magazam?" +
                                   "user=root&password=");
            prepare=conn.prepareStatement(query);
            prepare.setString(1, kullaniciAdi);
            prepare.setString(2, ad);
            prepare.setString(3, soyad);
            prepare.setString(4, il);
            prepare.setString(5, adres);
            prepare.executeUpdate();
            return true;
        }catch(SQLException e){System.out.println(e);return false;}       
    }
    
    // uyeBilgileriGuncelle metodu cagrilmadan once
    //"Uye Guncelle" formunda yeni bilgiler ile bir uye nesnesi olusturulur.
    //Bu metod cagrilirken Session'da tutulan kullanici adi gonderilmeli.
    public boolean uyeBilgileriGuncelle(String eskiKullaniciAdi,String kullaniciAdi,String ad,String soyad,String il,String adres){ 
        query="UPDATE uyeler SET kullaniciAdi=?,ad=?,soyad=?,il=?,adres=? WHERE kullaniciAdi=?";
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost/magazam?" +
                                   "user=root&password=");
            prepare=conn.prepareStatement(query);
            prepare.setString(1, kullaniciAdi);
            prepare.setString(2, ad);
            prepare.setString(3, soyad);
            prepare.setString(4, il);
            prepare.setString(5, adres);
            prepare.setString(6, eskiKullaniciAdi);
            prepare.executeUpdate();
            return true;
        }catch(SQLException e){System.out.println(e);return false;}
    }
   
   public boolean uyeSil(String uyeKullaniciAdi){
       query="DELETE FROM uyeler WHERE kullaniciAdi='"+uyeKullaniciAdi+"'";
       try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost/magazam?" +
                                   "user=root&password=");
           state=conn.createStatement();
           state.executeUpdate(query);
           return true;
       }catch(SQLException e){System.out.println(e);return false;}
   }
   
   public boolean uyeMi(String username){
        query="SELECT * FROM uyeler WHERE kullaniciAdi='"+username+"'";
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost/magazam?" +
                                   "user=root&password=");
            state=conn.createStatement();
            set=state.executeQuery(query);
            set.next();
            if (username.equals(set.getString("kullaniciAdi")))
                return true;
            else return false;           
        }catch(SQLException e){return false;}
    }
   
   public ArrayList<ArrayList<String>> getUyeler(){
        //Alinan bir hata: state ve connection close edildigi icin
        //uyeListele sayfasi refresh edildiginde NullPointerException aliniyordu.
        //Hata gozlemlenemediginden errorList ile return edildi. Hatanin baglantinin
        //kapatildigindan dolayi oldugu gozlemlendi. Baglantiyi kapatmayinca sorun cozuldu!
        query="SELECT * FROM uyeler";
        ArrayList<ArrayList<String>>baseList=new ArrayList<>();
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost/magazam?" +
                                   "user=root&password=");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/magazam?" +
                                   "user=root&password=");          
            state=conn.createStatement();
            set=state.executeQuery(query);                      
            while (set.next()) {
                ArrayList<String>subList=new ArrayList<>();
                subList.add(set.getString("kullaniciAdi"));
                subList.add(set.getString("ad"));
                subList.add(set.getString("soyad"));
                subList.add(set.getString("il"));
                subList.add(set.getString("adres"));
                baseList.add(subList);
            }
            state.close();
            conn.close();
            return baseList;
        }catch(SQLException e){
            ArrayList<String>errorList=new ArrayList<String>();
            errorList.add(e.toString());
            baseList.add(errorList);
            return baseList;
        }       
    }
   
   public ArrayList<String> getUye(String username){
       query="SELECT * FROM uyeler WHERE kullaniciAdi='"+username+"'";
       ArrayList<String>list=new ArrayList<>();
       try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost/magazam?" +
                                   "user=root&password=");
           state=conn.createStatement();
           set=state.executeQuery(query);
           while (set.next()) {
               list.add(set.getString("kullaniciAdi"));
               list.add(set.getString("ad"));
               list.add(set.getString("soyad"));
               list.add(set.getString("il"));
               list.add(set.getString("adres"));
           }
           state.close();
           conn.close();
           return list;
       }catch(SQLException e){
           System.out.println(e);
           ArrayList<String> errorList=new ArrayList<>();
           errorList.add(e.toString());
           return errorList;
        }
   }
   
    public static void main(String[] args) {
        uyeModel m=new uyeModel();
        System.out.println(m.uyeBilgileriGuncelle("azizcanha","azizcan", "Aziz Can", "Hamasoglu", "KONYA", "MERKEZ"));
    }
   
}
