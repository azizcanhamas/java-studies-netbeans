package Interface_Ornek1;

//Kara isimli sinif ITasitlar interface'i icinde bulunan Tekerlek interface'ini
//implemente etmistir. Bu yüzden yalnizca getKaraTasiti() metodunu tanimlamalidir.
public class Kara implements ITasitlar.Tekerlek{
    private String ad;
    
    public Kara(String ad){
        this.ad=ad;
    }
    
    public String getAd(){
        return this.ad;
    }
    
    public String getKaraTasiti(){
        return getAd()+" kara taşıtıdır!";
    }
}
