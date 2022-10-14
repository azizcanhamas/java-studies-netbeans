package veri;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Kisi {

    public String ad;
    public String soyad;
    public String parola;

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }
    

 
    
    public boolean sifreKontrol(String name,String surname,String password) throws SQLException, ClassNotFoundException{
        DB_Katmani db=new DB_Katmani();
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn;
        try{
            conn=db.baglan();
        }catch(SQLException exception){
            return false;
        }
        
        if(kullaniciKontrol(name, surname)){
            String sql="Select sifre from kisiler where ad=? and soyad=? and sifre=?";
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, surname);
            ps.setString(3, password);
            ResultSet set=ps.executeQuery();
            while(set.next()){
                 if(set.getString("sifre").equals(password))
                    return true;
            }
            return false;
        }
        else{
            return false;
        }
    }
    
    public boolean kullaniciKontrol(String name,String surname) throws SQLException{
        DB_Katmani db=new DB_Katmani();
        Connection conn;
        try{
            conn=db.baglan();
        }catch(SQLException exception){
            System.out.println(exception);
            return false;
        }
        String sql="Select * from kisiler where ad=? and soyad=?";
        PreparedStatement ps=conn.prepareStatement(sql);
        ps.setString(1, name);
        ps.setString(2, surname);
        ResultSet set=ps.executeQuery();
        while(set.next()){
            if(set.getString("ad").equals(name) && set.getString("soyad").equals(surname))
                return true;
        }
        return false;
    }
    
    
    
    
    
}