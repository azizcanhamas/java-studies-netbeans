package Kalitim_Ornek1;

public class Kisi extends Muhendis{
    private boolean patenHobi;
    private boolean bilardoHobi;
    private String gelecekHayali;
    
    public Kisi(String ad,String soyad,int yas,float boyUzunlugu,String dogumYeri,String alan,
                int projeSayisi,int calistigiYerSayisi,boolean patenHobi,boolean bilardoHobi,String gelecekHayali){
        super(ad,soyad,yas,boyUzunlugu,dogumYeri,alan,projeSayisi,calistigiYerSayisi);
        this.patenHobi=patenHobi;
        this.bilardoHobi=bilardoHobi;
        this.gelecekHayali=gelecekHayali;
    }

    public Kisi(boolean patenHobi, boolean bilardoHobi, String gelecekHayali, String ad, String soyad, int yas, float boyUzunlugu, String dogumYeri, String alan, int projeSayisi, int calistigiYerSayisi, boolean matlabBilgisi, boolean pythonBilgisi) {
        super(ad, soyad, yas, boyUzunlugu, dogumYeri, alan, projeSayisi, calistigiYerSayisi, matlabBilgisi, pythonBilgisi);
        this.patenHobi = patenHobi;
        this.bilardoHobi = bilardoHobi;
        this.gelecekHayali = gelecekHayali;
    }
    
    
    
    @Override
    public String goster(){
        String tmp=super.goster();
        tmp+="Paten Hobi    : "+patenHobi+"\n";
        tmp+="Bilardo Hobi  : "+bilardoHobi+"\n";
        tmp+="Gelecek Hayali: "+gelecekHayali+"\n";
        return tmp;
    }
}