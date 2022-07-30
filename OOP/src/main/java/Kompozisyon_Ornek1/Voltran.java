package Kompozisyon_Ornek1;

import java.util.ArrayList;

public class Voltran {
    //Voltran sinifi Kafa,SolKol,SagKol,SagBacak,SolBacak siniflarindan olusur.
    //Voltran bu ozelliklere sahip olmak zorundadir.
    //Voltran bu ozelliklerinin neye sahip oldugunu return eder.
    private Kafa kafa;
    private SolKol solKol;
    private SagKol sagKol;
    private SolBacak solBacak;
    private SagBacak sagBacak;

    public Voltran(Kafa kafa, SolKol solKol, SagKol sagKol, SolBacak solBacak, SagBacak sagBacak) {
        this.kafa = kafa;
        this.solKol = solKol;
        this.sagKol = sagKol;
        this.solBacak = solBacak;
        this.sagBacak = sagBacak;
    }
    
    public ArrayList<String> goster(){
        ArrayList<String> list=new ArrayList<String>();
        list.add(kafa.getVoltranKontrol()+"\n");
        list.add(solKol.getEnerjiSistemi()+"\n");
        list.add(sagKol.getCevreTarama()+"\n");
        list.add(solBacak.getKalkanKoruma()+"\n");
        list.add(sagBacak.getAteslemeSistemi()+"\n");
        return list;
    }
    
}
