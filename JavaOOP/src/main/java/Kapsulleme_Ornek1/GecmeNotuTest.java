package Kapsulleme_Ornek1;

public class GecmeNotuTest extends javax.swing.JFrame {
    public GecmeNotuTest() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gecmeNotuLabel = new javax.swing.JLabel();
        gecmeNotuField = new javax.swing.JTextField();
        kontrolButton = new javax.swing.JButton();
        getterLabel = new javax.swing.JLabel();
        setterLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        gecmeNotuLabel.setText("Gecme Notu: ");

        kontrolButton.setText("Kontrol");
        kontrolButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kontrolButtonActionPerformed(evt);
            }
        });

        getterLabel.setText("Getter: ");

        setterLabel.setText("Setter: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(getterLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kontrolButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(gecmeNotuLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gecmeNotuField, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(setterLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gecmeNotuLabel)
                    .addComponent(gecmeNotuField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kontrolButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(getterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(setterLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kontrolButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kontrolButtonActionPerformed
        //Kullanicidan yeni gecme notu bilgisi alinir.
        int not=Integer.parseInt(gecmeNotuField.getText());
        //Diger siniftan bir nesne tanimlanir ve alinmak ve guncellenmek istenen
        //degerin getter setter metotlari cagrilir.
        GecmeNotu g=new GecmeNotu();
        getterLabel.setText("Getter: "+String.valueOf(g.getGecmeNotu()));
        setterLabel.setText("Setter: "+g.setGecmeNotu(not));
    }//GEN-LAST:event_kontrolButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GecmeNotuTest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField gecmeNotuField;
    private javax.swing.JLabel gecmeNotuLabel;
    private javax.swing.JLabel getterLabel;
    private javax.swing.JButton kontrolButton;
    private javax.swing.JLabel setterLabel;
    // End of variables declaration//GEN-END:variables
}
