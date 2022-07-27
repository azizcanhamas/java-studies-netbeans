package FormExamples;



import java.util.Random;

public class SayiTahmin extends javax.swing.JFrame {

    int kalanHaklar=10;
    int sayiTut=new Random().nextInt(100);
    
    public SayiTahmin() {
        initComponents();
        System.out.println(sayiTut);
        kalanHaklarLabel.setText("Kalan Haklar : "+kalanHaklar);
        durumLabel.setText("Durum : Sayı tutuldu! İlk tahmininizi giriniz.");
        tekrarOynaButton.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        girLabel = new javax.swing.JLabel();
        girField = new javax.swing.JTextField();
        durumLabel = new javax.swing.JLabel();
        sorButton = new javax.swing.JToggleButton();
        tekrarOynaButton = new javax.swing.JButton();
        kalanHaklarLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sayı Tahmin Oyunu");
        setResizable(false);

        girLabel.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        girLabel.setText("1 ile 100 arasinda bir sayi girin.");

        durumLabel.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        durumLabel.setText("Durum           :");

        sorButton.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        sorButton.setText("Sor");
        sorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sorButtonActionPerformed(evt);
            }
        });

        tekrarOynaButton.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        tekrarOynaButton.setText("Tekrar Oyna");
        tekrarOynaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tekrarOynaButtonActionPerformed(evt);
            }
        });

        kalanHaklarLabel.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        kalanHaklarLabel.setText("Kalan Haklar : ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(girLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(girField)
                    .addComponent(kalanHaklarLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tekrarOynaButton, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
                    .addComponent(durumLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(girLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(girField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tekrarOynaButton)
                    .addComponent(sorButton))
                .addGap(12, 12, 12)
                .addComponent(durumLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kalanHaklarLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sorButtonActionPerformed
        String in=girField.getText();
        if(in.equals("")){
            durumLabel.setText("Giris bolumu bos gecilemez!");
        }
        else{
            try {
                int sayi=Integer.parseInt(in);
                if(sayiTut>sayi){
                    durumLabel.setText("Tahmininizi büyültün!");
                    kalanHaklar-=1;
                    hakKontrol();
                    kalanHaklarLabel.setText("Kalan Haklar : "+kalanHaklar);
                }
                else if(sayiTut<sayi){
                    durumLabel.setText("Tahmininizi küçültün!");
                    kalanHaklar-=1;
                    hakKontrol();
                    kalanHaklarLabel.setText("Kalan Haklar : "+kalanHaklar);
                }
                else{
                    durumLabel.setText(sayi+" sayisini "+kalanHaklar+". hakkınızda bildiniz!");
                    kalanHaklarLabel.setText("Kalan Haklar : "+kalanHaklar);
                    sorButton.setEnabled(false);
                    tekrarOynaButton.setEnabled(true);
                }
                
            } catch (Exception e) {
                durumLabel.setText("Lütfen sayı giriniz!");
            }
        }
    }//GEN-LAST:event_sorButtonActionPerformed

    public void hakKontrol(){
        if(kalanHaklar==0){
            durumLabel.setText("Hakkınız kalmadı! "+sayiTut+" sayısını bilemediniz!");
            sorButton.setEnabled(false);
            tekrarOynaButton.setEnabled(true);
        }
        
        
    }
    
    private void tekrarOynaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tekrarOynaButtonActionPerformed
        kalanHaklar=10;
        sayiTut=new Random().nextInt(100);
        sorButton.setEnabled(true);
        tekrarOynaButton.setEnabled(false);
        girField.setText("");
        kalanHaklarLabel.setText("Kalan Haklar : "+kalanHaklar);
        durumLabel.setText("Durum : Sayı tutuldu! İlk tahmininizi giriniz.");
    }//GEN-LAST:event_tekrarOynaButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SayiTahmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel durumLabel;
    private javax.swing.JTextField girField;
    private javax.swing.JLabel girLabel;
    private javax.swing.JLabel kalanHaklarLabel;
    private javax.swing.JToggleButton sorButton;
    private javax.swing.JButton tekrarOynaButton;
    // End of variables declaration//GEN-END:variables
}
