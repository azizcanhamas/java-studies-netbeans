package FormExamples;

public class IkıSayiliHesapMakinesi extends javax.swing.JFrame {

    public IkıSayiliHesapMakinesi() {
        initComponents();
        sonucTA.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        birinciSayiLabel = new javax.swing.JLabel();
        ikinciSayiLabel = new javax.swing.JLabel();
        birinciSayiField = new javax.swing.JTextField();
        ikinciSayiField = new javax.swing.JTextField();
        hesaplaButton = new javax.swing.JButton();
        temizleButton = new javax.swing.JButton();
        islemLabel = new javax.swing.JLabel();
        girisLabel = new javax.swing.JLabel();
        toplaCB = new javax.swing.JCheckBox();
        cikarCB = new javax.swing.JCheckBox();
        carpCB = new javax.swing.JCheckBox();
        bolCB = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        sonucTA = new javax.swing.JTextArea();
        sonucLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        birinciSayiLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        birinciSayiLabel.setText("1. Sayı");

        ikinciSayiLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ikinciSayiLabel.setText("2. Sayı");

        hesaplaButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        hesaplaButton.setText("Hesapla");
        hesaplaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hesaplaButtonActionPerformed(evt);
            }
        });

        temizleButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        temizleButton.setText("Temizle");
        temizleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temizleButtonActionPerformed(evt);
            }
        });

        islemLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        islemLabel.setText("             İşlem Türleri");

        girisLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        girisLabel.setText("                     Giriş");

        toplaCB.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        toplaCB.setText("    +");

        cikarCB.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cikarCB.setText("    -");

        carpCB.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        carpCB.setText("     *");

        bolCB.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bolCB.setText("    /");

        sonucTA.setColumns(20);
        sonucTA.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sonucTA.setRows(5);
        jScrollPane1.setViewportView(sonucTA);

        sonucLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sonucLabel.setText("                                                  Sonuç");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ikinciSayiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ikinciSayiField))
                            .addComponent(hesaplaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(birinciSayiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(birinciSayiField))
                            .addComponent(girisLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(temizleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(islemLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(carpCB, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                            .addComponent(toplaCB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cikarCB, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(bolCB, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jScrollPane1)
                    .addComponent(sonucLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(islemLabel)
                    .addComponent(girisLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(birinciSayiField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(toplaCB)
                        .addComponent(cikarCB))
                    .addComponent(birinciSayiLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ikinciSayiLabel)
                    .addComponent(ikinciSayiField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carpCB)
                    .addComponent(bolCB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hesaplaButton)
                    .addComponent(temizleButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sonucLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void temizleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temizleButtonActionPerformed
        birinciSayiField.setText("");
        ikinciSayiField.setText("");
        sonucTA.setText("");
        toplaCB.setSelected(false);
        cikarCB.setSelected(false);
        carpCB.setSelected(false);
        bolCB.setSelected(false);
    }//GEN-LAST:event_temizleButtonActionPerformed

    private void hesaplaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hesaplaButtonActionPerformed
        int sayiBir,sayiIki;
        try{
            sayiBir=Integer.parseInt(birinciSayiField.getText());
            sayiIki=Integer.parseInt(ikinciSayiField.getText());
        }catch(Exception e){
            sonucTA.setText("1. ve 2. sayılarda istenmeyen karakterler mevcut!");
            return;
        }
        String sonucStr="";
        if(toplaCB.isSelected()){
            sonucStr+=(sayiBir+" + "+sayiIki+" = "+(sayiBir+sayiIki)+"\n");
        }
        if(cikarCB.isSelected()){
            sonucStr+=(sayiBir+" - "+sayiIki+" = "+(sayiBir-sayiIki)+"\n");
        }
        if(carpCB.isSelected()){
            sonucStr+=(sayiBir+" * "+sayiIki+" = "+(sayiBir*sayiIki)+"\n");
        }
        if(bolCB.isSelected()){
            sonucStr+=(sayiBir+" / "+sayiIki+" = "+(sayiBir/sayiIki)+"\n");
        }
        
        sonucTA.setText(sonucStr);
    }//GEN-LAST:event_hesaplaButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IkıSayiliHesapMakinesi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField birinciSayiField;
    private javax.swing.JLabel birinciSayiLabel;
    private javax.swing.JCheckBox bolCB;
    private javax.swing.JCheckBox carpCB;
    private javax.swing.JCheckBox cikarCB;
    private javax.swing.JLabel girisLabel;
    private javax.swing.JButton hesaplaButton;
    private javax.swing.JTextField ikinciSayiField;
    private javax.swing.JLabel ikinciSayiLabel;
    private javax.swing.JLabel islemLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel sonucLabel;
    private javax.swing.JTextArea sonucTA;
    private javax.swing.JButton temizleButton;
    private javax.swing.JCheckBox toplaCB;
    // End of variables declaration//GEN-END:variables
}
