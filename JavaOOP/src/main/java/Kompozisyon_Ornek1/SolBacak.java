package Kompozisyon_Ornek1;

public class SolBacak {
    //SolBacak kendi basina bir sinifdir. ve kalkanKoruma adinda ozelligi vardir.
    //SolBacak olusturulurken ozellik verilmek zorundadir. Bu ozellik get edilebilir.
    private String kalkanKoruma;

    public SolBacak(String kalkanKoruma) {
        this.kalkanKoruma = kalkanKoruma;
    }

    public String getKalkanKoruma() {
        return kalkanKoruma;
    }
   
}
