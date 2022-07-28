package Abstract_Ornek1;

// Sekil sinifindan kalitim alindi. Sekil sinifi soyut sinif oldugundan
// govdesiz metotlar tanimlanmali ve ust sinifin constructor'i
// gerekli parametrelerle cagrilmalidir.
public class Kare extends Sekil {
    private int kenarUzunlugu;
    
    public Kare(String tur,int kenarUzunlugu){
        super(tur); // Ust sinifin constructor'inin cagrilmasi
        this.kenarUzunlugu=kenarUzunlugu;
    }
    
    // Bu sinifa ait cevre ve alan hesaplama metotlari
    public double cevreHesapla(){
        return 4*kenarUzunlugu;
    }
    
    public double alanHesapla(){
        return kenarUzunlugu*kenarUzunlugu;
    }
    
}
