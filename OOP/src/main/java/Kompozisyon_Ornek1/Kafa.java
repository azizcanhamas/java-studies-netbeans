package Kompozisyon_Ornek1;

public class Kafa {   
    //Kafa kendi basina bir sinifdir. ve voltranKontrol adinda ozelligi vardir.
    //Kafa olusturulurken ozellik verilmek zorundadir. Bu ozellik get edilebilir.
    private String voltranKontrol;

    public Kafa(String voltranKontrol) {
        this.voltranKontrol = voltranKontrol;
    }

    public String getVoltranKontrol() {
        return voltranKontrol;
    }
     
}
