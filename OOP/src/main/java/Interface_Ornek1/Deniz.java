package Interface_Ornek1;

// Deniz isimli sinif ITasitlar interface'ini implemente etmistir.
// Bu yuzden ITasitlar icinde bulunan iki adet govdesiz metodu da tanimlamak zorundadir.
// getHavaTasiti() metodunu kullanmayacak olsa dahi tanimlamalidir.
public class Deniz implements ITasitlar{
    public String ad;
    
    public Deniz(String ad){
        this.ad=ad;
    }
    
    public String getAd(){
        return this.ad;
    }
    
    public String getDenizTasiti(){
        return getAd()+" deniz taşıtıdır!";
    }
    
    public String getHavaTasiti(){
        return "";
    }
}
