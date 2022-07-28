package Abstract_Ornek1;

// Sekil sinifindan kalitim alindi. Sekil sinifi soyut sinif oldugundan
// govdesiz metotlar tanimlanmali ve ust sinifin constructor'i
// gerekli parametrelerle cagrilmalidir.
public class Daire extends Sekil {
    private int yaricapDegeri;
    
    public Daire(String tur,int yaricapDegeri){
        super(tur);// Ust sinifin constructor'inin cagrilmasi
        this.yaricapDegeri=yaricapDegeri;
    }
    // Bu sinifa ait cevre ve alan hesaplama metotlari
    public double cevreHesapla(){
        return 2*3.14*yaricapDegeri;
    }
    
    public double alanHesapla(){
        return 3.14*yaricapDegeri*yaricapDegeri;
    }
}
