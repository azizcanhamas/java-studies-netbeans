package Kapsulleme_Ornek2;

public class Araba {
    private String tur;
    private String marka;
    private int fiyat;
    
    //Kullanicinin girdigi bilgilerin field'lara set edilmesi
    public void setTur(String tur){
        this.tur=tur;
    }
    
    public void setMarka(String marka){
        this.marka=marka;
    }
    
    public void setFiyat(int fiyat){
        this.fiyat=fiyat;
    }
    /////////////////////////////////////////////////////////
    //Kullaniciya bilgilerin gosterilmesi icin private field'larin get edilmesi
    public String getTur(){
        return this.tur;
    }
    
    public String getMarka(){
        return this.marka;
    }
    
    public int getFiyat(){
        return this.fiyat;
    }
    
}
