package OOP_Giris_DaireYaricap;

public class DaireForm extends javax.swing.JFrame {

    public DaireForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        yaricapLabel = new javax.swing.JLabel();
        girField = new javax.swing.JTextField();
        alanLabel = new javax.swing.JLabel();
        cevreLabel = new javax.swing.JLabel();
        hesaplaButton = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        yaricapLabel.setText("Daire Yarıçapı:");

        alanLabel.setText("Alan: ");

        cevreLabel.setText("Çevre:");

        hesaplaButton.setText("Hesapla");
        hesaplaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hesaplaButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(hesaplaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(yaricapLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(alanLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(girField)
                            .addComponent(cevreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yaricapLabel)
                    .addComponent(girField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alanLabel)
                    .addComponent(cevreLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hesaplaButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hesaplaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hesaplaButtonActionPerformed
        double input=Double.parseDouble(girField.getText());
        Daire d=new Daire();
        //
        d.r=5;
        //Static olmadigi icin olusturulan nesne uzerinden erisilir.
        alanLabel.setText("Alan: "+d.alan());
        //static oldugu icin sinif adiyla erisilebilir.
        cevreLabel.setText("Cevre: "+Daire.cevre());    
    }//GEN-LAST:event_hesaplaButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DaireForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alanLabel;
    private javax.swing.JLabel cevreLabel;
    private javax.swing.JTextField girField;
    private javax.swing.JToggleButton hesaplaButton;
    private javax.swing.JLabel yaricapLabel;
    // End of variables declaration//GEN-END:variables
}
