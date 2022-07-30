package Interface_Ornek1;

// Insan sinifi IDunya sinifini implemente etmistir.
// Bu yuzden IDunya sinifind govdesiz olarak tanimlanmis olan
// getCocuk() isimli metodu kendi icinde tanimlamak zorundadir.
public class Insan implements IDunya{
    private String ad;
    
    public Insan(String ad){
        this.ad=ad;
    }
    
    public String getAd(){
        return this.ad;
    }
    
    public String getCocuk(){
        return getAd()+" dunyamizin gelecegidir!";
    }
}
