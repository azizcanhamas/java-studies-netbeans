package Polymorphism_Ornek1;

public class GUI extends javax.swing.JFrame {
    public GUI() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adLabel = new javax.swing.JLabel();
        adField = new javax.swing.JTextField();
        ulkeSecLabel = new javax.swing.JLabel();
        ulkeCB = new javax.swing.JComboBox<>();
        sonucLabel = new javax.swing.JLabel();
        gosterButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        adLabel.setText("Adını gir:");

        ulkeSecLabel.setText("Ülke seç:");

        ulkeCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Türk", "İngiliz", "Alman" }));

        sonucLabel.setText("Sonuc:");

        gosterButton.setText("Göster");
        gosterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gosterButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(sonucLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(gosterButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ulkeSecLabel)
                                .addGap(18, 18, 18)
                                .addComponent(ulkeCB, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(adLabel)
                                .addGap(18, 18, 18)
                                .addComponent(adField, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adLabel)
                    .addComponent(adField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ulkeSecLabel)
                    .addComponent(ulkeCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gosterButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sonucLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gosterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gosterButtonActionPerformed
        //Kullanici adinin alinmasi
        String ad=adField.getText();
        
        //Turk,Ingiliz,Alman siniflari Selam sinifindan turetilmistir.
        //Bu yuzden Polymorphism yapisina uygundur.
        //Selam sinifimiz alt siniflari gibi davranabilecektir.
        //Her sinifta getSelam() metodu tanimlanmistir.
        //Selam sinifimiz hangi millete gore tanimlandiysa o siniftaki
        //getSelam() metodunu cagiracaktir. Buna polymorphism denir.
        Selam[]arr={new Turk(ad),new Ingiliz(ad),new Alman(ad)};
        
        if (ulkeCB.getSelectedIndex()==0) {
            sonucLabel.setText(arr[0].getSelam()+" "+ad+" !");
        }
        else if (ulkeCB.getSelectedIndex()==1) {
            sonucLabel.setText(arr[1].getSelam()+" "+ad+" !");
        }
        else{
            sonucLabel.setText(arr[2].getSelam()+" "+ad+" !");
        }
    }//GEN-LAST:event_gosterButtonActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adField;
    private javax.swing.JLabel adLabel;
    private javax.swing.JButton gosterButton;
    private javax.swing.JLabel sonucLabel;
    private javax.swing.JComboBox<String> ulkeCB;
    private javax.swing.JLabel ulkeSecLabel;
    // End of variables declaration//GEN-END:variables
}
