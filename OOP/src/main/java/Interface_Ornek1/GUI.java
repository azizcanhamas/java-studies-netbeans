package Interface_Ornek1;

public class GUI extends javax.swing.JFrame {

    public GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cocukAdiLabel = new javax.swing.JLabel();
        karaTasitiLabel = new javax.swing.JLabel();
        havaTasitiLabel = new javax.swing.JLabel();
        denizTasitiLabel = new javax.swing.JLabel();
        cocukAdiField = new javax.swing.JTextField();
        karaTasitiCB = new javax.swing.JComboBox<>();
        havaTasitiCB = new javax.swing.JComboBox<>();
        denizTasitiCB = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        gosterButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Interface");
        setResizable(false);

        cocukAdiLabel.setText("Çocuk Adı");

        karaTasitiLabel.setText("Kara Taşıtı");

        havaTasitiLabel.setText("Hava Taşıtı");

        denizTasitiLabel.setText("Deniz Taşıtı");

        karaTasitiCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bisiklet", "Paten", "Araba", "Kamyon", "Motosiklet" }));

        havaTasitiCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Zeplin", "Uçak", "Helikopter", "Roket" }));

        denizTasitiCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gemi", "Sandal", "Yat", "Kayık" }));

        textArea.setColumns(20);
        textArea.setRows(5);
        textArea.setEnabled(false);
        jScrollPane1.setViewportView(textArea);

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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(denizTasitiLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(havaTasitiLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(karaTasitiLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cocukAdiLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cocukAdiField)
                                    .addComponent(karaTasitiCB, 0, 199, Short.MAX_VALUE)
                                    .addComponent(havaTasitiCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(denizTasitiCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(gosterButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cocukAdiLabel)
                    .addComponent(cocukAdiField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(karaTasitiLabel)
                    .addComponent(karaTasitiCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(havaTasitiLabel)
                    .addComponent(havaTasitiCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(denizTasitiLabel)
                    .addComponent(denizTasitiCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gosterButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gosterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gosterButtonActionPerformed
        //Kullanici verdigi bilgilerin degiskenlere alinmasi
        String cocukAdi=cocukAdiField.getText();
        String karaTasiti=(String)karaTasitiCB.getSelectedItem();
        String denizTasiti=(String)denizTasitiCB.getSelectedItem();
        String havaTasiti=(String)havaTasitiCB.getSelectedItem();
        
        //Interfaceler somutlastirilamaz. Yalnizca onu implemente eden siniflar
        //somutlastirilabilir.
        Insan insan=new Insan(cocukAdi);
        Kara k=new Kara(karaTasiti);
        Deniz d=new Deniz(denizTasiti);
        Hava h=new Hava(havaTasiti);
        
        textArea.setText("");
        textArea.append(insan.getCocuk()+"\n");
        textArea.append(h.getHavaTasiti()+"\n");
        textArea.append(d.getDenizTasiti()+"\n");
        textArea.append(k.getKaraTasiti()+"\n");
        
    }//GEN-LAST:event_gosterButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cocukAdiField;
    private javax.swing.JLabel cocukAdiLabel;
    private javax.swing.JComboBox<String> denizTasitiCB;
    private javax.swing.JLabel denizTasitiLabel;
    private javax.swing.JButton gosterButton;
    private javax.swing.JComboBox<String> havaTasitiCB;
    private javax.swing.JLabel havaTasitiLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> karaTasitiCB;
    private javax.swing.JLabel karaTasitiLabel;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
