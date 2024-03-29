package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class adminModel{
    
    private String username="root";
    private String password=""; 
    
    public String query="";
    public Statement state;
    public PreparedStatement prepare;
    public ResultSet set;
    public Connection conn;

    //Sisteme admin olarak giris yapmis bir kullanicinin kendi "username"
    //bilgisini degistirmesi icin yazilmistir.
    public boolean adminUsernameGuncelle(String username,String newUsername){
        query="UPDATE yoneticiler SET username='"+newUsername+"' WHERE username='"+username+"'";
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost/magazam?" +
                                   "user=root&password=");
            state=conn.createStatement();
            state.executeUpdate(query);
            state.close();
            conn.close();
            return true;
        }catch(SQLException e){System.out.println(e);return false;}
    }
    
    //Sisteme admin olarak giris yapan bir kullanicin kendi parolasini degistirmesi
    //icin yazilmistir.
    public boolean adminPasswordGuncelle(String username,String newPassword){
        query="UPDATE yoneticiler SET password='"+newPassword+"' WHERE username='"+username+"'";
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost/magazam?" +
                                   "user=root&password=");
            state=conn.createStatement();
            state.executeUpdate(query);
            state.close();
            conn.close();
            return true;
        }catch(SQLException e){System.out.println(e);return false;}
    }
    
    //Sisteme admin olarak giris yapan bir kullanicinin diger adminlerin
    //bilgilerini gormesi icin yazilmistir.
    public ArrayList<ArrayList<String>> getAdmins(){
        query="SELECT * FROM yoneticiler";
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost/magazam?" +
                                   "user=root&password=");
            state=conn.createStatement();
            set=state.executeQuery(query);          
            ArrayList<ArrayList<String>>baseList=new ArrayList<>();
            while (set.next()) {
                ArrayList<String>subList=new ArrayList<String>();
                subList.add(set.getString("username"));
                subList.add(set.getString("password"));
                baseList.add(subList);
            }
            state.close();
            conn.close();
            return baseList;
        }catch(SQLException e){return null;}       
    }
    
    //Admin paneline girilen username ve password bilgisinin "yoneticiler"
    //tablosunda kontrol edilme islemi icin yazilmistir.
    public boolean adminMi(String username,String parola){
        query="SELECT * FROM yoneticiler WHERE username='"+username+"'";
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost/magazam?" +
                                   "user=root&password=");
            state=conn.createStatement();
            set=state.executeQuery(query);
            set.next();
            if (username.equals(set.getString("username"))&&parola.equals(set.getString("password")))
                return true;
            else return false;           
        }catch(SQLException e){return false;}
    }

}
