package Kompozisyon_Ornek1;

public class SolKol {
    //SolKol kendi basina bir sinifdir. ve enerjiSistemi adinda ozelligi vardir.
    //SolKol olusturulurken ozellik verilmek zorundadir. Bu ozellik get edilebilir.
    private String enerjiSistemi;

    public SolKol(String enerjiSistemi) {
        this.enerjiSistemi = enerjiSistemi;
    }

    public String getEnerjiSistemi() {
        return enerjiSistemi;
    }
    
}
