package Kompozisyon_Ornek1;

public class SagKol {
    //SagKol kendi basina bir sinifdir. ve cevreTarama adinda ozelligi vardir.
    //SagKol olusturulurken ozellik verilmek zorundadir. Bu ozellik get edilebilir.
    private String cevreTarama;

    public SagKol(String cevreTarama) {
        this.cevreTarama = cevreTarama;
    }

    public String getCevreTarama() {
        return cevreTarama;
    }
     
}
