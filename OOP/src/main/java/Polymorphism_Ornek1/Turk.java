package Polymorphism_Ornek1;

public class Turk extends Selam{
    public Turk(String ad){
        super(ad);
    }
    @Override
    public String getSelam(){
        return "Merhaba";
    }
}
