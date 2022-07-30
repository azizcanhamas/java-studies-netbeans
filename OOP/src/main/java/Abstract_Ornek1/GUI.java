package Abstract_Ornek1;

public class GUI extends javax.swing.JFrame {

    public GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sekilLabel = new javax.swing.JLabel();
        sekilCB = new javax.swing.JComboBox<>();
        kenarLabel = new javax.swing.JLabel();
        kenarSpinner = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        hesaplaButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        sekilLabel.setText("Şekil");

        sekilCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kare", "Daire" }));

        kenarLabel.setText("Kenar-Yaricap");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sekilLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(kenarLabel)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sekilCB, 0, 135, Short.MAX_VALUE)
                            .addComponent(kenarSpinner)))
                    .addComponent(hesaplaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sekilCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sekilLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kenarLabel)
                            .addComponent(kenarSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hesaplaButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hesaplaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hesaplaButtonActionPerformed
        // Kullanicinin sectigi sekil turunun alinmasi
        int secim=sekilCB.getSelectedIndex();
        
        // Kullanici "Kare" secenegini sectiyse
        if (secim==0) {
            //Kullanicinin girmis oldugu kare kenar bilgisinin alinmasi
            int kenar=(Integer)kenarSpinner.getValue();
            
            // Kare sinifindan bir nesne turetilir.
            // Kare sinifi soyut bir sinif olmadigindan bu siniftan nesne turetilebilir.
            // Ancak Sekil sinifi soyut bir sinif oldugundan Sekil sinifindan bir nesne somutlastirilamaz.
            // Fakat Sekil sinifi Kare sinifi gibi davranarak Polymorphism yapabilir.
            Kare k=new Kare("Kare", kenar);
            textArea.setText("");
            // k nesnesi Kare sinifinin nesnesidir ve Kare sinifi Sekil sinifindan kalitim alinmistir.
            // Bu yüzden Sekil sinifinin metotlari kullanilabilir. Bu sayede Sekil tur bilgisi Sekil sinifinin
            // icinden alinabilir.
            textArea.append(k.getTur()+" alan : "+k.alanHesapla()+"\n");
            textArea.append(k.getTur()+" cevre: "+k.cevreHesapla());
        }
        // Kullanici "Daire" secenegini sectiyse
        else {
            int yaricap=(Integer)kenarSpinner.getValue();
            Daire d=new Daire("Daire", yaricap);
            textArea.setText("");
            textArea.append(d.getTur()+" alan : "+d.alanHesapla()+"\n");
            textArea.append(d.getTur()+" cevre: "+d.cevreHesapla());
        }
    }//GEN-LAST:event_hesaplaButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton hesaplaButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel kenarLabel;
    private javax.swing.JSpinner kenarSpinner;
    private javax.swing.JComboBox<String> sekilCB;
    private javax.swing.JLabel sekilLabel;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
