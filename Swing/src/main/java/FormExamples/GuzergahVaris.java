package FormExamples;



import javax.swing.JOptionPane;

public class GuzergahVaris extends javax.swing.JFrame {

    public GuzergahVaris() {
        initComponents();
        mesafeField.setEnabled(false);
        sureField.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        guzergahLabel = new javax.swing.JLabel();
        guzergahComboBox = new javax.swing.JComboBox<>();
        hesaplaButton = new javax.swing.JButton();
        varisLabel = new javax.swing.JLabel();
        mesafeLabel = new javax.swing.JLabel();
        hizLabel = new javax.swing.JLabel();
        sureLabel = new javax.swing.JLabel();
        mesafeField = new javax.swing.JTextField();
        sureField = new javax.swing.JTextField();
        hizSpinner = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        guzergahLabel.setText("Güzergah");

        guzergahComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hatay-Adana", "Hatay-Ankara", "Hatay-İstanbul", "Hatay-İzmir", "Hatay-Diyarbakır", "Hatay-Trabzon" }));

        hesaplaButton.setText("Hesapla");
        hesaplaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hesaplaButtonActionPerformed(evt);
            }
        });

        varisLabel.setText("Varış Bilgileri");

        mesafeLabel.setText("Mesafe(km)");

        hizLabel.setText("Hız(km/h)");

        sureLabel.setText("Süre(h)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(guzergahComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hesaplaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(guzergahLabel)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mesafeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hizLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(sureLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(varisLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sureField)
                            .addComponent(hizSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addComponent(mesafeField))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(guzergahLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guzergahComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hesaplaButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(varisLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mesafeLabel)
                            .addComponent(mesafeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hizLabel)
                            .addComponent(hizSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sureLabel)
                            .addComponent(sureField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hesaplaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hesaplaButtonActionPerformed
        int[]mesafeArr={191,680,1110,1200,350,700};
        int sehirSecim=guzergahComboBox.getSelectedIndex();
        mesafeField.setText((String)guzergahComboBox.getSelectedItem());
        int hiz=(int)hizSpinner.getValue();
        if (hiz==0){
            JOptionPane.showMessageDialog(null,"Hız 0 km/h olamaz!", "HATA",JOptionPane.ERROR_MESSAGE);
            return;
        }
        double sure=mesafeArr[sehirSecim]/(double)hiz;
        int saat=(int)sure;
        double dakika=(sure-saat)*60;
        sureField.setText(String.format(saat+" saat %.2f dakika",dakika));     
    }//GEN-LAST:event_hesaplaButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuzergahVaris().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> guzergahComboBox;
    private javax.swing.JLabel guzergahLabel;
    private javax.swing.JButton hesaplaButton;
    private javax.swing.JLabel hizLabel;
    private javax.swing.JSpinner hizSpinner;
    private javax.swing.JTextField mesafeField;
    private javax.swing.JLabel mesafeLabel;
    private javax.swing.JTextField sureField;
    private javax.swing.JLabel sureLabel;
    private javax.swing.JLabel varisLabel;
    // End of variables declaration//GEN-END:variables
}
