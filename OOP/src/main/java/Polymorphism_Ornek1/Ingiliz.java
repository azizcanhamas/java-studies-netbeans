package Polymorphism_Ornek1;

public class Ingiliz extends Selam {
    public Ingiliz(String ad){
        super(ad);
    }
    @Override
    public String getSelam(){
        return "Hello";
    }
}
