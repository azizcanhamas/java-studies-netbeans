package Kalitim_Ornek1;

public class Muhendis extends Insan {
    private String alan; //(Zorunlu bilgi)Yazilim,Insaat,Makine vb.
    private int projeSayisi;//(Zorunlu bilgi)
    private int calistigiYerSayisi;//(Zorunlu bilgi)
    private boolean matlabBilgisi=false;//Bos gecilebilir
    private boolean pythonBilgisi=false;//Bos gecilebilir

    public Muhendis(String ad,String soyad,int yas,float boyUzunlugu,String dogumYeri,String alan,int projeSayisi,int calistigiYerSayisi){
        super(ad, soyad, yas, boyUzunlugu, dogumYeri);
        this.alan=alan;
        this.projeSayisi=projeSayisi;
        this.calistigiYerSayisi=calistigiYerSayisi;
    }
    
    public Muhendis(String ad,String soyad,int yas,float boyUzunlugu,String dogumYeri,String alan,int projeSayisi,int calistigiYerSayisi,boolean  matlabBilgisi,boolean pythonBilgisi){
        super(ad, soyad, yas, boyUzunlugu, dogumYeri);
        this.alan=alan;
        this.projeSayisi=projeSayisi;
        this.calistigiYerSayisi=calistigiYerSayisi;
        this.matlabBilgisi=matlabBilgisi;
        this.pythonBilgisi=pythonBilgisi;
    }
    
    @Override
    public String goster(){
        String tmp=super.goster();
        tmp+="Alan                : "+alan+"\n";
        tmp+="Proje Sayisi        : "+projeSayisi+"\n";
        tmp+="Calistigi Yer Sayisi: "+calistigiYerSayisi+"\n";
        tmp+="MatLab Bilgisi      : "+matlabBilgisi+"\n";
        tmp+="Python Bilgisi      : "+pythonBilgisi+"\n";
        return tmp;
    }
}
