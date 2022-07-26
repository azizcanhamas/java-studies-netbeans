package FormExamples;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;

public class SinemaRezervasyon extends javax.swing.JFrame {
    int mod=0; 
    /*
        mod=0 ise default; 
        mod=1 ise rezervasyon yap; 
        mod=2 ise rezervasyon iptal et;
    */
    ArrayList<JButton>seciliKoltuklar=new ArrayList<JButton>();
    ArrayList<JButton>doluKoltuklar=new ArrayList<JButton>();
    ArrayList<JButton>bosKoltuklar=new ArrayList<JButton>();
    JButton []tumKoltuklar;
    public SinemaRezervasyon() {
        initComponents();
        tamamlaButton.setVisible(false);
        
        //Salonda bulunan tum koltuklari tut.
        tumKoltuklar=new JButton[]{
            A1,A2,A3,A4,A5,
            B1,B2,B3,B4,B5,
            C1,C2,C3,C4,C5,
            D1,D2,D3,D4,D5,
            E1,E2,E3,E4,E5,
            F1,F2,F3,F4,F5
        };
        fiyatField.setEnabled(false);
        tumKoltuklarPasif();
        //Baslangicta tum koltuklar bos durumda oldugu icin ilk durum tanimlanmali.
        for (int i = 0; i < tumKoltuklar.length; i++) {
            bosKoltuklar.add(tumKoltuklar[i]);
        }
        //Kullanicinin hangi koltuklari sectigini dinle ve sakla-guncelle.
        ActionListener listener=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton tmpButton=(JButton)e.getSource();
                int searchResult=seciliKoltuklar.indexOf(tmpButton);
                if(searchResult==-1){
                    seciliKoltuklar.add(tmpButton);
                    tmpButton.setBackground(Color.yellow);
                }
                else{
                    seciliKoltuklar.remove(tmpButton);
                    tmpButton.setBackground(Color.green);
                }
                fiyatField.setText(String.valueOf(seciliKoltuklar.size()*30));
            }
        };
        
        //Dinleme olayina tum koltuklari ekle.
        for (int i = 0; i < tumKoltuklar.length; i++) {
            tumKoltuklar[i].addActionListener(listener);
        }  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        perdeButton = new javax.swing.JButton();
        A1 = new javax.swing.JButton();
        A2 = new javax.swing.JButton();
        A3 = new javax.swing.JButton();
        A4 = new javax.swing.JButton();
        A5 = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        C2 = new javax.swing.JButton();
        C5 = new javax.swing.JButton();
        C4 = new javax.swing.JButton();
        C3 = new javax.swing.JButton();
        C1 = new javax.swing.JButton();
        D4 = new javax.swing.JButton();
        D1 = new javax.swing.JButton();
        D2 = new javax.swing.JButton();
        D3 = new javax.swing.JButton();
        D5 = new javax.swing.JButton();
        E3 = new javax.swing.JButton();
        E5 = new javax.swing.JButton();
        E4 = new javax.swing.JButton();
        E1 = new javax.swing.JButton();
        E2 = new javax.swing.JButton();
        F1 = new javax.swing.JButton();
        F5 = new javax.swing.JButton();
        F2 = new javax.swing.JButton();
        F3 = new javax.swing.JButton();
        F4 = new javax.swing.JButton();
        baslikLabel = new javax.swing.JLabel();
        bosKoltukLabel = new javax.swing.JLabel();
        doluKoltukLabel = new javax.swing.JLabel();
        rezervasyonIptalButton = new javax.swing.JButton();
        rezervasyonYapButton = new javax.swing.JButton();
        koridorLabel4 = new javax.swing.JLabel();
        koridorLabel8 = new javax.swing.JLabel();
        koridorLabel7 = new javax.swing.JLabel();
        koridorLabel6 = new javax.swing.JLabel();
        koridorLabel3 = new javax.swing.JLabel();
        koridorLabel5 = new javax.swing.JLabel();
        koridorLabel9 = new javax.swing.JLabel();
        ogrenciBiletLabel = new javax.swing.JLabel();
        yetiskinBiletLabel = new javax.swing.JLabel();
        koridorLabel = new javax.swing.JLabel();
        koridorLabel2 = new javax.swing.JLabel();
        tamamlaButton = new javax.swing.JButton();
        bilgiLabel = new javax.swing.JLabel();
        fiyatLabel = new javax.swing.JLabel();
        fiyatField = new javax.swing.JTextField();
        tlLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sinema Koltuk Rezervasyon Ekranı");
        setResizable(false);

        perdeButton.setBackground(new java.awt.Color(255, 0, 0));
        perdeButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        perdeButton.setForeground(new java.awt.Color(255, 255, 255));
        perdeButton.setText("P   E   R   D   E");

        A1.setBackground(new java.awt.Color(0, 255, 0));
        A1.setText("A1");

        A2.setBackground(new java.awt.Color(0, 255, 0));
        A2.setText("A2");

        A3.setBackground(new java.awt.Color(0, 255, 0));
        A3.setText("A3");

        A4.setBackground(new java.awt.Color(0, 255, 0));
        A4.setText("A4");

        A5.setBackground(new java.awt.Color(0, 255, 0));
        A5.setText("A5");

        B1.setBackground(new java.awt.Color(0, 255, 0));
        B1.setText("B1");

        B2.setBackground(new java.awt.Color(0, 255, 0));
        B2.setText("B2");

        B3.setBackground(new java.awt.Color(0, 255, 0));
        B3.setText("B3");

        B4.setBackground(new java.awt.Color(0, 255, 0));
        B4.setText("B4");

        B5.setBackground(new java.awt.Color(0, 255, 0));
        B5.setText("B5");

        C2.setBackground(new java.awt.Color(0, 255, 0));
        C2.setText("C2");

        C5.setBackground(new java.awt.Color(0, 255, 0));
        C5.setText("C5");

        C4.setBackground(new java.awt.Color(0, 255, 0));
        C4.setText("C4");

        C3.setBackground(new java.awt.Color(0, 255, 0));
        C3.setText("C3");

        C1.setBackground(new java.awt.Color(0, 255, 0));
        C1.setText("C1");

        D4.setBackground(new java.awt.Color(0, 255, 0));
        D4.setText("D4");

        D1.setBackground(new java.awt.Color(0, 255, 0));
        D1.setText("D1");

        D2.setBackground(new java.awt.Color(0, 255, 0));
        D2.setText("D2");

        D3.setBackground(new java.awt.Color(0, 255, 0));
        D3.setText("D3");

        D5.setBackground(new java.awt.Color(0, 255, 0));
        D5.setText("D5");

        E3.setBackground(new java.awt.Color(0, 255, 0));
        E3.setText("E3");

        E5.setBackground(new java.awt.Color(0, 255, 0));
        E5.setText("E5");

        E4.setBackground(new java.awt.Color(0, 255, 0));
        E4.setText("E4");

        E1.setBackground(new java.awt.Color(0, 255, 0));
        E1.setText("E1");

        E2.setBackground(new java.awt.Color(0, 255, 0));
        E2.setText("E2");

        F1.setBackground(new java.awt.Color(0, 255, 0));
        F1.setText("F1");

        F5.setBackground(new java.awt.Color(0, 255, 0));
        F5.setText("F5");

        F2.setBackground(new java.awt.Color(0, 255, 0));
        F2.setText("F2");

        F3.setBackground(new java.awt.Color(0, 255, 0));
        F3.setText("F3");

        F4.setBackground(new java.awt.Color(0, 255, 0));
        F4.setText("F4");

        baslikLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        baslikLabel.setText("Rezervasyon Ekranı");

        bosKoltukLabel.setBackground(new java.awt.Color(0, 153, 51));
        bosKoltukLabel.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        bosKoltukLabel.setText("Boş Koltuk Sayısı: 30");

        doluKoltukLabel.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        doluKoltukLabel.setText("Dolu Koltuk Sayısı: 0");

        rezervasyonIptalButton.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        rezervasyonIptalButton.setText("Rezervasyon İptal");
        rezervasyonIptalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rezervasyonIptalButtonActionPerformed(evt);
            }
        });

        rezervasyonYapButton.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        rezervasyonYapButton.setText("Rezervasyon Yap");
        rezervasyonYapButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rezervasyonYapButtonActionPerformed(evt);
            }
        });

        koridorLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        koridorLabel4.setText("                  O");

        koridorLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        koridorLabel8.setText("                  O");

        koridorLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        koridorLabel7.setText("                  D");

        koridorLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        koridorLabel6.setText("                  İ");

        koridorLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        koridorLabel3.setText("                  K");

        koridorLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        koridorLabel5.setText("                  R");

        koridorLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        koridorLabel9.setText("                  R");

        ogrenciBiletLabel.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        ogrenciBiletLabel.setText("Öğrenci Bilet: 30 TL");

        yetiskinBiletLabel.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        yetiskinBiletLabel.setText("Yetişkin Bilet: 60 TL");

        koridorLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        koridorLabel.setText("K      O      R      İ      D      O      R   ");

        koridorLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        koridorLabel2.setText("               K        O        R        İ        D        O        R   ");

        tamamlaButton.setText("Tamamla");
        tamamlaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamamlaButtonActionPerformed(evt);
            }
        });

        bilgiLabel.setText("Bilgi:");

        fiyatLabel.setText("Fiyat:");

        tlLabel.setText("TL");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(224, 224, 224)
                                .addComponent(baslikLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ogrenciBiletLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(doluKoltukLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bilgiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(yetiskinBiletLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bosKoltukLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(fiyatLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fiyatField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tlLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(rezervasyonYapButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rezervasyonIptalButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(tamamlaButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(perdeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(E1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(E2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(D1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(D2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(F1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(F2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(A1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(A2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(koridorLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(koridorLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                            .addComponent(koridorLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(koridorLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(koridorLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(koridorLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(koridorLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(koridorLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(D3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(D4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(D5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(F4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(F5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(C3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(C4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(C5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(F3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(E3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(E4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(E5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(A3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(A4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(A5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(koridorLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(perdeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(koridorLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(koridorLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(koridorLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(koridorLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(koridorLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(koridorLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(koridorLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(koridorLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(koridorLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(A1)
                                    .addComponent(A2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(B1)
                                    .addComponent(B2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(C1)
                                    .addComponent(C2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(D1)
                                    .addComponent(D2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(E1)
                                    .addComponent(E2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(F1)
                                    .addComponent(F2)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(A4)
                                        .addComponent(A5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(A3)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(B3)
                                    .addComponent(B4)
                                    .addComponent(B5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(C3)
                                    .addComponent(C4)
                                    .addComponent(C5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(D3)
                                    .addComponent(D4)
                                    .addComponent(D5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(E3)
                                    .addComponent(E4)
                                    .addComponent(E5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(F3)
                                    .addComponent(F4)
                                    .addComponent(F5))))))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(baslikLabel)
                    .addComponent(tamamlaButton))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ogrenciBiletLabel)
                    .addComponent(doluKoltukLabel)
                    .addComponent(rezervasyonIptalButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rezervasyonYapButton)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(yetiskinBiletLabel)
                            .addComponent(bosKoltukLabel)
                            .addComponent(fiyatLabel)
                            .addComponent(fiyatField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tlLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bilgiLabel)))
                .addGap(9, 9, 9))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rezervasyonYapButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rezervasyonYapButtonActionPerformed
        mod=1;//rezervasyon yap moduna gec.
        //Dolu koltukları dolu oldugu icin pasif duruma getir.
        for (int i = 0; i < doluKoltuklar.size(); i++) {
            doluKoltuklar.get(i).setEnabled(false);
        }
        //Bos koltukları rezerve edebilmek icin aktif duruma getir.
        for (int i = 0; i < bosKoltuklar.size(); i++) {
            bosKoltuklar.get(i).setEnabled(true);
        }       
        tamamlaButton.setVisible(true);
        bilgiLabel.setText("<html>Rezerve etmek istediğiniz boş koltukları seçiniz ardından 'Tamamla' butonuna basınız.</html>");
    }//GEN-LAST:event_rezervasyonYapButtonActionPerformed

    private void rezervasyonIptalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rezervasyonIptalButtonActionPerformed
        mod=2;//rezervasyon iptal moduna gec.
        //Bos koltuklar rezerve olmadigi icin pasif yap.
        for (int i = 0; i < bosKoltuklar.size(); i++) {
            bosKoltuklar.get(i).setEnabled(false);
        }
        tamamlaButton.setVisible(true);
        bilgiLabel.setText("<html>İptal etmek istediğiniz rezerve koltukları seçiniz ardından 'Tamamla' butonuna basınız.</html>");
        //Dolu koltuklar uzerinde rezervasyon iptal yapilacagi icin aktif yap.
        for (int i = 0; i < doluKoltuklar.size(); i++) {
            doluKoltuklar.get(i).setEnabled(true);
        }
    }//GEN-LAST:event_rezervasyonIptalButtonActionPerformed

    private void tamamlaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamamlaButtonActionPerformed
        if(mod==1){//secili koltuklari rezerve et.
            for (int i = 0; i < seciliKoltuklar.size(); i++) {
                seciliKoltuklar.get(i).setBackground(Color.red);
                seciliKoltuklar.get(i).setEnabled(false);
                bosKoltuklar.remove(seciliKoltuklar.get(i));
                doluKoltuklar.add(seciliKoltuklar.get(i));
            }
            seciliKoltuklar.removeAll(seciliKoltuklar);
        }
        else if(mod==2){//secili koltuklarin rezervasyonunu iptal et.
            for (int i = 0; i < seciliKoltuklar.size(); i++) {
                seciliKoltuklar.get(i).setBackground(Color.green);
                doluKoltuklar.remove(seciliKoltuklar.get(i));
                bosKoltuklar.add(seciliKoltuklar.get(i));
            }
            seciliKoltuklar.removeAll(seciliKoltuklar);
            for (int i = 0; i < bosKoltuklar.size(); i++) {
                bosKoltuklar.get(i).setEnabled(true);
            } 
        }
        mod=0;
        tamamlaButton.setVisible(false);
        bosDoluGuncelle();
        tumKoltuklarPasif();
        fiyatField.setText("0");
    }//GEN-LAST:event_tamamlaButtonActionPerformed
    //Bos ve dolu koltuk sayisini bildiren labellari guncelle.
    private void bosDoluGuncelle(){
        bosKoltukLabel.setText((String)("Boş koltuk sayısı: "+bosKoltuklar.size()));
        doluKoltukLabel.setText((String)("Dolu koltuk sayısı: "+doluKoltuklar.size()));
    }
    
    private void tumKoltuklarPasif(){
        //Tum koltuklar bos konumda. Erisilemez baslatiliyor.
        //"Rezervasyon yap" denildigi zaman aktif hale getirilecek.
        for (int i = 0; i < tumKoltuklar.length; i++) {
            tumKoltuklar[i].setEnabled(false);
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SinemaRezervasyon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A1;
    private javax.swing.JButton A2;
    private javax.swing.JButton A3;
    private javax.swing.JButton A4;
    private javax.swing.JButton A5;
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton C1;
    private javax.swing.JButton C2;
    private javax.swing.JButton C3;
    private javax.swing.JButton C4;
    private javax.swing.JButton C5;
    private javax.swing.JButton D1;
    private javax.swing.JButton D2;
    private javax.swing.JButton D3;
    private javax.swing.JButton D4;
    private javax.swing.JButton D5;
    private javax.swing.JButton E1;
    private javax.swing.JButton E2;
    private javax.swing.JButton E3;
    private javax.swing.JButton E4;
    private javax.swing.JButton E5;
    private javax.swing.JButton F1;
    private javax.swing.JButton F2;
    private javax.swing.JButton F3;
    private javax.swing.JButton F4;
    private javax.swing.JButton F5;
    private javax.swing.JLabel baslikLabel;
    private javax.swing.JLabel bilgiLabel;
    private javax.swing.JLabel bosKoltukLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel doluKoltukLabel;
    private javax.swing.JTextField fiyatField;
    private javax.swing.JLabel fiyatLabel;
    private javax.swing.JLabel koridorLabel;
    private javax.swing.JLabel koridorLabel2;
    private javax.swing.JLabel koridorLabel3;
    private javax.swing.JLabel koridorLabel4;
    private javax.swing.JLabel koridorLabel5;
    private javax.swing.JLabel koridorLabel6;
    private javax.swing.JLabel koridorLabel7;
    private javax.swing.JLabel koridorLabel8;
    private javax.swing.JLabel koridorLabel9;
    private javax.swing.JLabel ogrenciBiletLabel;
    private javax.swing.JButton perdeButton;
    private javax.swing.JButton rezervasyonIptalButton;
    private javax.swing.JButton rezervasyonYapButton;
    private javax.swing.JButton tamamlaButton;
    private javax.swing.JLabel tlLabel;
    private javax.swing.JLabel yetiskinBiletLabel;
    // End of variables declaration//GEN-END:variables
}
