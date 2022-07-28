package Interface_Ornek2;

// INotHesaplama bir interface'tir. İcerisinde getGNT() isimli double return eden
// ve setGNT() isimli double gnt degiskenini set eden iki adet govdesiz metot bulundurur.
// INotHesaplama interface'ini implemente eden siniflar bu iki govdesiz metodu implemente etmelidir.
public interface INotHesaplama {
    public double getGNT();
    public void setGNT(double gnt);
}
