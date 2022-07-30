package FormExamples;



public class ArabaOpsiyon extends javax.swing.JFrame {

    public ArabaOpsiyon() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        arabaFiyatLabel = new javax.swing.JLabel();
        arabaFiyatField = new javax.swing.JTextField();
        tlLabel = new javax.swing.JLabel();
        aksesuarLabel = new javax.swing.JLabel();
        farYikamaCB = new javax.swing.JCheckBox();
        geriGorusCB = new javax.swing.JCheckBox();
        seritAsistanCB = new javax.swing.JCheckBox();
        parkAsistanCB = new javax.swing.JCheckBox();
        xenonFarCB = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        arabaFiyatLabel.setText("Araba Satış Fiyatı");

        arabaFiyatField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                arabaFiyatFieldKeyPressed(evt);
            }
        });

        tlLabel.setText("TL");

        aksesuarLabel.setText("Aksesuar");

        farYikamaCB.setText("Far Yıkama");
        farYikamaCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                farYikamaCBActionPerformed(evt);
            }
        });

        geriGorusCB.setText("Geri Görüş Kamerası");
        geriGorusCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geriGorusCBActionPerformed(evt);
            }
        });

        seritAsistanCB.setText("Şerit Asistanı");
        seritAsistanCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seritAsistanCBActionPerformed(evt);
            }
        });

        parkAsistanCB.setText("Park Asistanı");
        parkAsistanCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parkAsistanCBActionPerformed(evt);
            }
        });

        xenonFarCB.setText("Xenon Far");
        xenonFarCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xenonFarCBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(farYikamaCB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(aksesuarLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(arabaFiyatLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(arabaFiyatField, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(tlLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(geriGorusCB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(seritAsistanCB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(parkAsistanCB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(xenonFarCB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(arabaFiyatLabel)
                    .addComponent(arabaFiyatField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tlLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aksesuarLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(farYikamaCB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(geriGorusCB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seritAsistanCB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(parkAsistanCB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xenonFarCB)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void farYikamaCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_farYikamaCBActionPerformed
        if(farYikamaCB.isSelected()) fiyatGuncelle(1500);
        else fiyatGuncelle(-1500);
    }//GEN-LAST:event_farYikamaCBActionPerformed

    private void geriGorusCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geriGorusCBActionPerformed
        if(geriGorusCB.isSelected()) fiyatGuncelle(200);
        else fiyatGuncelle(-200);
    }//GEN-LAST:event_geriGorusCBActionPerformed

    private void seritAsistanCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seritAsistanCBActionPerformed
        if(seritAsistanCB.isSelected()) fiyatGuncelle(3500);
        else fiyatGuncelle(-3500);
    }//GEN-LAST:event_seritAsistanCBActionPerformed

    private void parkAsistanCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parkAsistanCBActionPerformed
        if(parkAsistanCB.isSelected()) fiyatGuncelle(1200);
        else fiyatGuncelle(-1200);
    }//GEN-LAST:event_parkAsistanCBActionPerformed

    private void xenonFarCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xenonFarCBActionPerformed
        if(xenonFarCB.isSelected()) fiyatGuncelle(300);
        else fiyatGuncelle(-300);
    }//GEN-LAST:event_xenonFarCBActionPerformed

    private void arabaFiyatFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_arabaFiyatFieldKeyPressed
        farYikamaCB.setSelected(false);
        geriGorusCB.setSelected(false);
        seritAsistanCB.setSelected(false);
        parkAsistanCB.setSelected(false);
        xenonFarCB.setSelected(false);
    }//GEN-LAST:event_arabaFiyatFieldKeyPressed

    private int fiyatCek(){
        try{
            int fiyat=Integer.parseInt(arabaFiyatField.getText());
            return fiyat;
        }
        catch(Exception e){
            return 0;
        }
    }
    private void fiyatGuncelle(int opsiyonFiyat){
        int fiyat=fiyatCek();
        arabaFiyatField.setText(String.valueOf(fiyat+opsiyonFiyat));
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ArabaOpsiyon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aksesuarLabel;
    private javax.swing.JTextField arabaFiyatField;
    private javax.swing.JLabel arabaFiyatLabel;
    private javax.swing.JCheckBox farYikamaCB;
    private javax.swing.JCheckBox geriGorusCB;
    private javax.swing.JCheckBox parkAsistanCB;
    private javax.swing.JCheckBox seritAsistanCB;
    private javax.swing.JLabel tlLabel;
    private javax.swing.JCheckBox xenonFarCB;
    // End of variables declaration//GEN-END:variables
}
