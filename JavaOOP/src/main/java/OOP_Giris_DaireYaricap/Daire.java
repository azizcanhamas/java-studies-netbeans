package OOP_Giris_DaireYaricap;

public class Daire {
    //private oldugu icin baska bir siniftan erisilemez.
    //final parametresinden dolayi degisken 3.14 degerine sabitlenmistir.
    private final static double pi=3.14;
    //static yapilmasaydi static olan metotlar erisemezdi.
    public static double r;
    
    //static olmadigi icin baska bir siniftan
    //erisilebilmesi icin siniftan nesne olusturulmasi
    //gerekmektedir. public olarak tanimlandigi icin her yerden erisilebilir.
    public double alan(){
        return pi*r*r;
    }
    
    //static oldugu icin baska bir siniftan
    //sadece sinif adi ile dahi erisilebilir.
    public static double cevre(){
        return 2*pi*r;
    }
    
}
