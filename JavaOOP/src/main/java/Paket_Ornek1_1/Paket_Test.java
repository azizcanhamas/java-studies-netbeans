package Paket_Ornek1_1;

import Paket_Ornek1_2.Basamaklar;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Paket_Test extends javax.swing.JFrame {

    public Paket_Test() {
        initComponents();
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        girLabel = new javax.swing.JLabel();
        girField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        hesaplaButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        girLabel.setText("Bir sayı gir:");

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(girLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(girField))
                    .addComponent(jScrollPane1)
                    .addComponent(hesaplaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(girLabel)
                    .addComponent(girField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hesaplaButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hesaplaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hesaplaButtonActionPerformed
        //Girilen sayinin 0.9999 araliginda olup olmadiginin kontrol edilmesi
        //Sayi belirtilen aralikta degilse program akisina musade edilmez.
        int sayi=Integer.parseInt(girField.getText());
        if (sayi>9999) {
            JOptionPane.showMessageDialog(null, "Sayi 0...9999 araliginda olmalidir!");
            girField.setText("");
            return;
        }
   
        //Girilen sayinin diger paketteki sinifin metodu ile hesaplatilmasi
        Basamaklar b=new Basamaklar(sayi);
        //Hesaplanan basamaklarin bir string listesi olarak alinmasi
        ArrayList<String> list=b.hesapla();
        //Alinan listenin TextArea listesine yazdirilmasi
        for (String string : list) {
            textArea.append(string);
        }
    }//GEN-LAST:event_hesaplaButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Paket_Test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField girField;
    private javax.swing.JLabel girLabel;
    private javax.swing.JButton hesaplaButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
