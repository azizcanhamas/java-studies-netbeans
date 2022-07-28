package Interface_Ornek2;

// Hesap sinifi INotHesaplama interface'ini implemente etmektedir.
// Bu yüzden interface'de bulunan iki govdesiz metodu govdeli olarak tanimlamalidir.
// Hesap sinifindan vnt,fnt,gnt isimli ozellikler bulunur. Vize,final ve genel not ortalamasi
// degerleri burada saklanmaktadir.
public class Hesap implements INotHesaplama{
    private double vnt;
    private double fnt;
    private double gnt;
    
    public Hesap(double vnt,double fnt){
        this.vnt=vnt;
        this.fnt=fnt;
    }
    
    public double getGNT(){
        return this.gnt;
    }
    
    public void setGNT(double gnt){
        this.gnt=gnt;
    }
    
    
}
