package Kalitim_Ornek1;

public class Insan {
    private String ad;
    private String soyad;
    private int yas;
    private float boyUzunlugu;
    private String dogumYeri;

    public Insan(String ad, String soyad,int yas, float boyUzunlugu, String dogumYeri) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas=yas;
        this.boyUzunlugu = boyUzunlugu;
        this.dogumYeri = dogumYeri;
    }
    
    public String goster(){
        String tmp="";
        tmp+="Ad          : "+ad+"\n";
        tmp+="Soyad       : "+soyad+"\n";
        tmp+="Yas         : "+yas+"\n";
        tmp+="Boy Uzunlugu: "+boyUzunlugu+"\n";
        tmp+="Dogum Yeri  : "+dogumYeri+"\n";
        return tmp;
    }
    
    
}
