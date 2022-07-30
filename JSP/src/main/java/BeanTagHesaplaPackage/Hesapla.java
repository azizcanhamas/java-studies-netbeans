package BeanTagHesaplaPackage;

public class Hesapla {
    private String ad="";
    private double vize=0,final1=0,ort=0;

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public double getVize() {
        return vize;
    }

    public void setVize(double vize) {
        this.vize = vize;
    }

    public double getFinal1() {
        return final1;
    }

    public void setFinal1(double final1) {
        this.final1 = final1;
    }

    public double getOrt() {
        double ort=(int)vize*0.4+final1*0.6;
        return ort;
    }
    
    
    
}
