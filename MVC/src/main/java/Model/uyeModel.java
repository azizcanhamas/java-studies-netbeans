package Model;

import java.sql.SQLException;
import java.util.ArrayList;

public class uyeModel extends dbConnect {
    private String kullaniciAdi;
    private String ad;
    private String soyad;
    private String il;
    private String ilce;
    private String adres;

    public uyeModel(){
        super();
    }
    
    public uyeModel(String kullaniciAdi, String ad, String soyad, String il,String adres) {
        this.kullaniciAdi = kullaniciAdi;
        this.ad = ad;
        this.soyad = soyad;
        this.il = il;
        this.ilce = ilce;
        this.adres = adres;
    }
    
    public boolean uyeEkle(String kullaniciAdi, String ad, String soyad, String il, String adres){
        query="INSERT INTO uyeler(kullaniciAdi,ad,soyad,il,adres) VALUES(?,?,?,?,?)";
        try{
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
    public boolean uyeBilgileriGuncelle(String eskiKullaniciAdi){ 
        query="UPDATE uyeler SET kullaniciAd=? ad=? soyad=? il=? ilce=? adres=? WHERE kullaniciAd=?";
        try{
            prepare=conn.prepareStatement(query);
            prepare.setString(1, kullaniciAdi);
            prepare.setString(2, ad);
            prepare.setString(3, soyad);
            prepare.setString(4, il);
            prepare.setString(5, ilce);
            prepare.setString(6, adres);
            prepare.setString(7, eskiKullaniciAdi);
            return true;
        }catch(SQLException e){return false;}
    }
   
   public boolean uyeSil(String uyeKullaniciAdi){
       query="DELETE FROM uyeler WHERE kullaniciAdi='"+uyeKullaniciAdi+"'";
       try{
           state=conn.createStatement();
           state.executeUpdate(query);
           return true;
       }catch(SQLException e){System.out.println(e);return false;}
   }
   
   public boolean uyeMi(String username){
        query="SELECT * FROM uyeler WHERE kullaniciAdi='"+username+"'";
        try{
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
            state=conn.createStatement();
            set=state.executeQuery(query);                      
            while (set.next()) {
                ArrayList<String>subList=new ArrayList<String>();
                subList.add(set.getString("kullaniciAdi"));
                subList.add(set.getString("ad"));
                subList.add(set.getString("soyad"));
                subList.add(set.getString("il"));
                subList.add(set.getString("adres"));
                baseList.add(subList);
            }
            return baseList;
        }catch(SQLException e){
            ArrayList<String>errorList=new ArrayList<String>();
            errorList.add(e.toString());
            baseList.add(errorList);
            return baseList;}       
    }
   
   public ArrayList<String> getUye(String username){
       query="SELECT * FROM uyeler WHERE='"+username+"'";
       ArrayList<String>list=new ArrayList<String>();
       try{
           state=conn.createStatement();
           state.executeQuery(query);
           while (set.next()) {
               list.add(set.getString("kullaniciAdi"));
               list.add(set.getString("ad"));
               list.add(set.getString("soyad"));
               list.add(set.getString("il"));
               list.add(set.getString("adres"));
           }
           return list;
       }catch(SQLException e){return null;}
   }
   
}
