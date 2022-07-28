package Kapsulleme_Ornek2;

import javax.swing.JOptionPane;

public class ArabaTest extends javax.swing.JFrame {

    public ArabaTest() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        turLabel = new javax.swing.JLabel();
        turMarka = new javax.swing.JLabel();
        turFiyat = new javax.swing.JLabel();
        turField = new javax.swing.JTextField();
        markaField = new javax.swing.JTextField();
        fiyatField = new javax.swing.JTextField();
        gosterButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        turLabel.setText("Araba Türü:");

        turMarka.setText("Araba Marka:");

        turFiyat.setText("Araba Fiyatı:");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(gosterButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(turLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(turMarka, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                            .addComponent(turFiyat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fiyatField, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                            .addComponent(markaField)
                            .addComponent(turField))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(turLabel)
                    .addComponent(turField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(turMarka)
                    .addComponent(markaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(turFiyat)
                    .addComponent(fiyatField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gosterButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gosterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gosterButtonActionPerformed
        String tur,marka;
        int fiyat;
        
        Araba a=new Araba();
        String tmp="";
        //Bilgilerin set edilmeden once kullaniciya gosterilmesi
        tmp+="Tur  : "+a.getTur()+"\n";
        tmp+="Marka: "+a.getMarka()+"\n";
        tmp+="Fiyat: "+a.getFiyat();
        JOptionPane.showMessageDialog(null, tmp);
        
        a.setTur(turField.getText());
        a.setMarka(markaField.getText());
        a.setFiyat(Integer.parseInt(fiyatField.getText()));
        
        //Bilgilerin set edildikten sonra kullaniciya gosterilmesi
        tmp="";
        tmp+="Tur  : "+a.getTur()+"\n";
        tmp+="Marka: "+a.getMarka()+"\n";
        tmp+="Fiyat: "+a.getFiyat();
        JOptionPane.showMessageDialog(null, tmp);
    }//GEN-LAST:event_gosterButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ArabaTest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fiyatField;
    private javax.swing.JButton gosterButton;
    private javax.swing.JTextField markaField;
    private javax.swing.JTextField turField;
    private javax.swing.JLabel turFiyat;
    private javax.swing.JLabel turLabel;
    private javax.swing.JLabel turMarka;
    // End of variables declaration//GEN-END:variables
}
