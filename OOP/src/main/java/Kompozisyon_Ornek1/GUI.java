package Kompozisyon_Ornek1;

import java.util.ArrayList;

public class GUI extends javax.swing.JFrame {

    public GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        baslikLabel = new javax.swing.JLabel();
        kafaLabel = new javax.swing.JLabel();
        sagKolLabel = new javax.swing.JLabel();
        solKolLabel = new javax.swing.JLabel();
        sagBacakLabel = new javax.swing.JLabel();
        solBacakLabel = new javax.swing.JLabel();
        kafaCB = new javax.swing.JComboBox<>();
        sagKolCB = new javax.swing.JComboBox<>();
        solKolCB = new javax.swing.JComboBox<>();
        sagBacakCB = new javax.swing.JComboBox<>();
        solBacakCB = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        gonderButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        baslikLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        baslikLabel.setText("                                    V         O          L          T          R          A          N");

        kafaLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        kafaLabel.setText("Kafa");

        sagKolLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sagKolLabel.setText("Sağ Kol");

        solKolLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        solKolLabel.setText("Sol Kol");

        sagBacakLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sagBacakLabel.setText("Sağ Bacak");

        solBacakLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        solBacakLabel.setText("Sol Bacak");

        kafaCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Voltran Sistemi", "Voltran Oluşturuldu", "Voltran Oluşturulamadı" }));

        sagKolCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Çevre Tarama Sistemi", "Düşman Var", "Düşman Yok" }));

        solKolCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enerji Sistemi", "Tam Güç", "Gücüm Yok" }));

        sagBacakCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ateşleme Sistemi", "Ateşleme Sistemi Hazır", "Ateşleme Sistemi Arızalı" }));

        solBacakCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kalkan Koruma Sistemi", "Kalkan Koruma Aktif", "Kalkan Koruma Pasif" }));

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        gonderButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        gonderButton.setText("Gönder");
        gonderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gonderButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gonderButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(baslikLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(solBacakLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sagBacakLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(solKolLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sagKolLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(kafaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sagBacakCB, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(solBacakCB, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kafaCB, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sagKolCB, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(solKolCB, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(baslikLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kafaLabel)
                            .addComponent(kafaCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sagKolLabel)
                            .addComponent(sagKolCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(solKolLabel)
                            .addComponent(solKolCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sagBacakLabel)
                            .addComponent(sagBacakCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(solBacakLabel)
                            .addComponent(solBacakCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gonderButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gonderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gonderButtonActionPerformed
        //Kafa,SolKol,SagKol,SolBacak,SagBacak ayri ayri olusturulur.
        //Ayrica Voltran olusturulur ve olusturulan alt nesneler Voltran'a kazandirilir.
        Kafa kafa=new Kafa((String)kafaCB.getSelectedItem());
        SolKol solKol=new SolKol((String)solKolCB.getSelectedItem());
        SagKol sagKol=new SagKol((String)sagKolCB.getSelectedItem());
        SolBacak solBacak=new SolBacak((String)solBacakCB.getSelectedItem());
        SagBacak sagBacak=new SagBacak((String)sagBacakCB.getSelectedItem());
              
        Voltran v=new Voltran(kafa, solKol, sagKol, solBacak, sagBacak);
        ArrayList<String> tmp=v.goster();
        for (String string : tmp) {
            textArea.append(string);
        }
    }//GEN-LAST:event_gonderButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel baslikLabel;
    private javax.swing.JButton gonderButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> kafaCB;
    private javax.swing.JLabel kafaLabel;
    private javax.swing.JComboBox<String> sagBacakCB;
    private javax.swing.JLabel sagBacakLabel;
    private javax.swing.JComboBox<String> sagKolCB;
    private javax.swing.JLabel sagKolLabel;
    private javax.swing.JComboBox<String> solBacakCB;
    private javax.swing.JLabel solBacakLabel;
    private javax.swing.JComboBox<String> solKolCB;
    private javax.swing.JLabel solKolLabel;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
