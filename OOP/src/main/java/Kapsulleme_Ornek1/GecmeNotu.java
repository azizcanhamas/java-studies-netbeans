package Kapsulleme_Ornek1;

public class GecmeNotu {
    private int gecmeNotu;
    
    //Private bir field'a disaridan erisilemeyecegi icin
    //getter metot tanimlanir ve bu metot uzerinden deger return edilir.
    public int getGecmeNotu(){
        return this.gecmeNotu;
    }
    
    //private bir field'a disaridan erisilemeyeceginden ve
    //kontrollu bir sekilde deger guncelleme islemi yapilmasi gerektiginden
    //setter metot tanimlanir ve guncelleme islemi bu metot uzerinden gerceklestirilir.
    public String setGecmeNotu(int not){
        if(not>=50){
            this.gecmeNotu=not;
            return "Gecme notu guncelleme basarili. Yeni gecme notu: "+this.gecmeNotu;
        }
        else{
            return "Gecme notu 50'den büyük olmalidir. Guncel gecme notu: "+this.gecmeNotu;
        }
    }
}
