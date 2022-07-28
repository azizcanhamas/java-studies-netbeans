package Polymorphism_Ornek1;

public class Alman extends Selam {
    public Alman(String ad){
        super(ad);
    }
    @Override
    public String getSelam(){
        return "Hallo";
    }
}
