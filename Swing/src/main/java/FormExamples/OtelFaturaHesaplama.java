package FormExamples;


public class OtelFaturaHesaplama extends javax.swing.JFrame {
    public OtelFaturaHesaplama() {
        initComponents();
        faturaField.setEnabled(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        baslikLabel = new javax.swing.JLabel();
        adLabel = new javax.swing.JLabel();
        odaLabel = new javax.swing.JLabel();
        sureLabel = new javax.swing.JLabel();
        faturaLabel = new javax.swing.JLabel();
        adField = new javax.swing.JTextField();
        odaComboBox = new javax.swing.JComboBox<>();
        sureSpinner = new javax.swing.JSpinner();
        faturaField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        baslikLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        baslikLabel.setText("Otel Fatura Hesaplama Ekranı");

        adLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        adLabel.setText("Ad-Soyad");

        odaLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        odaLabel.setText("Oda Tipi");

        sureLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sureLabel.setText("Süre(Gün)");

        faturaLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        faturaLabel.setText("Fatura");

        odaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Standart", "Suit", "Family" }));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Hesapla");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(adLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(odaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sureLabel))
                            .addComponent(faturaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(faturaField)
                            .addComponent(sureSpinner)
                            .addComponent(odaComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(adField))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addComponent(baslikLabel)
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(baslikLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adLabel)
                    .addComponent(adField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(odaLabel)
                    .addComponent(odaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sureLabel)
                    .addComponent(sureSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(faturaLabel)
                    .addComponent(faturaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        faturaField.setText("");
        if(adField.getText().equals("")){
            faturaField.setText("Ad-soyad boş geçilemez!");
            return;
        }
        if((int)sureSpinner.getValue()==0){
            faturaField.setText("Süre 0 gün olamaz!");
            return;
        }
        int odaTipGunlukFiyat=0;
        
        if(odaComboBox.getSelectedIndex()==0) odaTipGunlukFiyat=100;
        else if(odaComboBox.getSelectedIndex()==1) odaTipGunlukFiyat=400;
        else odaTipGunlukFiyat=1000;
        
        int fatura=odaTipGunlukFiyat*(int)sureSpinner.getValue();
        faturaField.setText("Fatura: "+fatura+" TL");
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OtelFaturaHesaplama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adField;
    private javax.swing.JLabel adLabel;
    private javax.swing.JLabel baslikLabel;
    private javax.swing.JTextField faturaField;
    private javax.swing.JLabel faturaLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> odaComboBox;
    private javax.swing.JLabel odaLabel;
    private javax.swing.JLabel sureLabel;
    private javax.swing.JSpinner sureSpinner;
    // End of variables declaration//GEN-END:variables
}
