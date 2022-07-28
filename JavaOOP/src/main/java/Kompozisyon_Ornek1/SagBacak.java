package Kompozisyon_Ornek1;

public class SagBacak {
    //SagBacak kendi basina bir sinifdir. ve ateslemeSistemi adinda ozelligi vardir.
    //SagBacak olusturulurken ozellik verilmek zorundadir. Bu ozellik get edilebilir.
    private String ateslemeSistemi;

    public SagBacak(String ateslemeSistemi) {
        this.ateslemeSistemi = ateslemeSistemi;
    }

    public String getAteslemeSistemi() {
        return ateslemeSistemi;
    }
       
}
