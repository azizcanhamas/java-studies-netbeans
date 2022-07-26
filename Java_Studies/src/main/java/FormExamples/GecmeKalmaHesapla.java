package FormExamples;

public class GecmeKalmaHesapla extends javax.swing.JFrame {

    public GecmeKalmaHesapla() {
        initComponents();
        hesaplaButton2.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        butPanel = new javax.swing.JPanel();
        butLabel = new javax.swing.JLabel();
        butField = new javax.swing.JTextField();
        hesaplaButton2 = new javax.swing.JButton();
        vizfinalPanel = new javax.swing.JPanel();
        vizeLabel = new javax.swing.JLabel();
        finalLabel = new javax.swing.JLabel();
        vizeField = new javax.swing.JTextField();
        finalField = new javax.swing.JTextField();
        hesaplaButton1 = new javax.swing.JButton();
        durumLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        butLabel.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        butLabel.setText("Bütünleme");

        hesaplaButton2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        hesaplaButton2.setText("Bütünleme ile Hesapla");
        hesaplaButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hesaplaButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout butPanelLayout = new javax.swing.GroupLayout(butPanel);
        butPanel.setLayout(butPanelLayout);
        butPanelLayout.setHorizontalGroup(
            butPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(butPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(butPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(butField)
                    .addGroup(butPanelLayout.createSequentialGroup()
                        .addComponent(butLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(hesaplaButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        butPanelLayout.setVerticalGroup(
            butPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(butPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(butLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(butField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hesaplaButton2))
        );

        vizfinalPanel.setToolTipText("");

        vizeLabel.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        vizeLabel.setText("Vize");

        finalLabel.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        finalLabel.setText("Final");

        hesaplaButton1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        hesaplaButton1.setText("Hesapla");
        hesaplaButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hesaplaButton1ActionPerformed(evt);
            }
        });

        durumLabel.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        durumLabel.setText("Durum: Hesaplanmadı");

        javax.swing.GroupLayout vizfinalPanelLayout = new javax.swing.GroupLayout(vizfinalPanel);
        vizfinalPanel.setLayout(vizfinalPanelLayout);
        vizfinalPanelLayout.setHorizontalGroup(
            vizfinalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vizfinalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(vizfinalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(vizfinalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, vizfinalPanelLayout.createSequentialGroup()
                            .addComponent(vizeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(vizeField))
                        .addGroup(vizfinalPanelLayout.createSequentialGroup()
                            .addComponent(finalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(finalField))
                        .addComponent(hesaplaButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(durumLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        vizfinalPanelLayout.setVerticalGroup(
            vizfinalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vizfinalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(vizfinalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vizeLabel)
                    .addComponent(vizeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(vizfinalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(finalLabel)
                    .addComponent(finalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hesaplaButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(durumLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(vizfinalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(butPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(vizfinalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(butPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hesaplaButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hesaplaButton1ActionPerformed
        int vizeNot,finalNot;
        try{
            vizeNot=Integer.parseInt(vizeField.getText());
            finalNot=Integer.parseInt(finalField.getText());
        }
        catch(Exception e){
            durumLabel.setText("Durum: Vize ve final 0..100 aralığında bir sayı olmalıdır.");
            return;
        }      
        double ort=vizeNot*0.4+finalNot*0.6;
        if(ort>=50) durumLabel.setText("Durum: "+ort+" ortalama ile ilgili dersten finalde geçtiniz!");
        else{
            durumLabel.setText("<html>Durum: "+ort+" ortalama ile ilgili dersten finalde kaldınız! Bütünleme notunu girerek hesaplayiniz.</html>");
            hesaplaButton2.setVisible(true);
        }
    }//GEN-LAST:event_hesaplaButton1ActionPerformed

    private void hesaplaButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hesaplaButton2ActionPerformed
        int vizeNot,butNot;
        try{
            vizeNot=Integer.parseInt(vizeField.getText());
            butNot=Integer.parseInt(butField.getText());
        }
        catch(Exception e){
            durumLabel.setText("Durum: Vize ve büt notları 0..100 aralığında bir sayı olmalıdır.");
            return;
        }
        double ort=vizeNot*0.4+butNot*0.6;        
        if(ort>=50) durumLabel.setText("Durum: "+ort+" ortalama ile ilgili dersten bütünlemede geçtiniz!");
        else{
            durumLabel.setText("<html>Durum: "+ort+" ortalama ile ilgili dersten bütünlemede kaldınız! Bütünleme notunu girerek hesaplayiniz.</html>");
            hesaplaButton2.setVisible(true);
        }
    }//GEN-LAST:event_hesaplaButton2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GecmeKalmaHesapla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField butField;
    private javax.swing.JLabel butLabel;
    private javax.swing.JPanel butPanel;
    private javax.swing.JLabel durumLabel;
    private javax.swing.JTextField finalField;
    private javax.swing.JLabel finalLabel;
    private javax.swing.JButton hesaplaButton1;
    private javax.swing.JButton hesaplaButton2;
    private javax.swing.JTextField vizeField;
    private javax.swing.JLabel vizeLabel;
    private javax.swing.JPanel vizfinalPanel;
    // End of variables declaration//GEN-END:variables
}
