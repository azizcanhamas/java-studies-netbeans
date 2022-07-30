package Interface_Ornek1;

// ITasitlar sinifi bir interfacedir. Kendi icinde Tekerlek isminde bir
// interface ve iki adet govdesiz metot barindirir. Baska siniflar
// bu interface icinde tanimlanmis olan Tekerlek isimli interface'i implemente edebilir.
// Sadece Tekerlek isimli interface'i implemente eden bir sinif asagidaki
// govdesiz metotlari implemente etmek zorunda degildir.
public interface ITasitlar {
    public interface Tekerlek{
        public String getKaraTasiti();
    }
    public String getHavaTasiti();
    public String getDenizTasiti();
}
