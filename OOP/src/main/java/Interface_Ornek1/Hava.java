package Interface_Ornek1;

// Hava isimli sinif ITasitlar interface'ini implemente etmistir.
// Bu yuzden ITasitlar icinde bulunan iki adet govdesiz metodu da tanimlamak zorundadir.
// getDenizTasiti() metodunu kullanmayacak olsa dahi tanimlamalidir.
public class Hava implements ITasitlar{
    public String ad;
     
    public Hava(String ad){
        this.ad=ad;
    }
    
    public String getAd(){
        return this.ad;
    }

    public String getHavaTasiti(){
        return getAd()+" hava taşıtıdır!";
    }
    
    public String getDenizTasiti(){
        return "";
    }
    
}
