package Abstract_Ornek1;

public abstract class Sekil {
    // Her sekil bir ture sahip oldugundan "tur" field ozelligi burada tanimlanir.
    // Sekil sinifi kalitim alan siniflar bu ozelligi kullanabilir.
    private String tur;

    public Sekil(String tur){
        this.tur=tur;
    }
    
    // "tur" ozelligi private oldugu icin getter-setter metotlar tanimlanir.
    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }
    
    // Soyut siniflarda govdesiz metot tanimlamasi yapilabilir.
    // Govdesiz metot tanimlamasi yapildigi taktirde soyut sinifi kalitim alan
    // tum metotlar bu govdesiz metotlari kullanmayacak olsa dahi tanimlamak zorundadir.
    abstract double alanHesapla();
    abstract double cevreHesapla();
}
