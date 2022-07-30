package Interface_Ornek2;

//FinalHesap sinifi Hesap sinifindan kalitim almaktadir.
//Bu sinif hesaplama isleminde ihtiyac duydugu vize ve final notlarini
//kullanici arayuzunden almaktadir. Ancak atasi olan Hesap sinifina da gondermektedir.
//Hesaplama islemi sonucunda cikan genel not ortalamasi Hesap sinifina set edilmektedir.
//Final sinavi ardinda gecip gecmeme kontrolu burada yapilmaktadir. Eger 50'den kucuk
//bir genel not ortalamasi bulunduysa bütünleme hesap ekrani kullaniciya gosterilmektedir.
public class FinalHesap extends Hesap{
    public FinalHesap(double vnt,double fnt){
        super(vnt,fnt);
        super.setGNT(vnt*0.4+fnt*0.6);
        if (super.getGNT()<50){
            GUI_But gui=new GUI_But();
            gui.setVisible(true);
        }
    }
}
