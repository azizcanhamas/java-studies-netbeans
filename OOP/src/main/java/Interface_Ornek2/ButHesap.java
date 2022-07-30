package Interface_Ornek2;

//ButHesap sinifi Hesap sinifindan kalitim almaktadir.
//Bu sinif hesaplama isleminde kullanacak oldugu vize notunu atasi olan Hesap
//sinifinin field'larindan almaktadir. Hesaplama islemi bittigi zaman
//Hesap sinifinin icinde kapsullenmis olan genel not ortalamasini tutan gnt degiskenine
//setGNT metodu araciligiyla guncelleme islemi gerceklestirilmektedir.
public class ButHesap extends Hesap{
    public ButHesap(double vnt,double bnt){
        super(vnt, bnt);
        super.setGNT(vnt*0.4+bnt*0.6);
    }
}
