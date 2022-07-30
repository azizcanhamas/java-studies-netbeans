package FormExamples;



import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

public class KDVFaturaHesapla extends javax.swing.JFrame {
    ButtonGroup group;
    public KDVFaturaHesapla() {
        initComponents();
        
        kdvField.setEnabled(false);
        faturaField.setEnabled(false);
        birimFiyatField.setEnabled(false);
        urunAdediSpinner.setValue(1);
        
        group=new ButtonGroup();
        group.add(gidaRB);
        group.add(elektronikRB);
        group.add(giyimRB);
        
        gidaRB.setActionCommand("gidaRB");
        elektronikRB.setActionCommand("elektronikRB");
        giyimRB.setActionCommand("giyimRB");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        baslikLabel = new javax.swing.JLabel();
        reyonAdiLabel = new javax.swing.JLabel();
        elektronikRB = new javax.swing.JRadioButton();
        giyimRB = new javax.swing.JRadioButton();
        gidaRB = new javax.swing.JRadioButton();
        urunAdiLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        urunAdiCB = new javax.swing.JComboBox<>();
        urunAdediSpinner = new javax.swing.JSpinner();
        birimFiyatField = new javax.swing.JTextField();
        kdvField = new javax.swing.JTextField();
        faturaField = new javax.swing.JTextField();
        hesaplaButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KDV-Fatura");
        setResizable(false);

        baslikLabel.setText("                 KDV-Fatura Hesaplayıcı");

        reyonAdiLabel.setText("Reyon Adı");

        elektronikRB.setText("Elektronik");
        elektronikRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elektronikRBActionPerformed(evt);
            }
        });

        giyimRB.setText("Giyim");
        giyimRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giyimRBActionPerformed(evt);
            }
        });

        gidaRB.setText("Gıda");
        gidaRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gidaRBActionPerformed(evt);
            }
        });

        urunAdiLabel.setText("Ürün Adı");

        jLabel4.setText("Ürün Adedi");

        jLabel5.setText("Birim Fiyatı");

        jLabel6.setText("KDV Tutarı");

        jLabel7.setText("Fatura Tutarı");

        urunAdiCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urunAdiCBActionPerformed(evt);
            }
        });

        urunAdediSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                urunAdediSpinnerStateChanged(evt);
            }
        });

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
                    .addComponent(hesaplaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(baslikLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(reyonAdiLabel)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(elektronikRB)
                                            .addGap(18, 18, 18)
                                            .addComponent(giyimRB)
                                            .addGap(18, 18, 18)
                                            .addComponent(gidaRB)))
                                    .addGap(1, 1, 1))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(urunAdiLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(urunAdediSpinner)
                                        .addComponent(birimFiyatField)
                                        .addComponent(kdvField)
                                        .addComponent(faturaField)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGap(0, 0, Short.MAX_VALUE)
                                            .addComponent(urunAdiCB, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(baslikLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reyonAdiLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elektronikRB)
                    .addComponent(giyimRB)
                    .addComponent(gidaRB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(urunAdiLabel)
                    .addComponent(urunAdiCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(urunAdediSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(birimFiyatField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(kdvField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(faturaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hesaplaButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void elektronikRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elektronikRBActionPerformed
        urunAdiCB.removeAllItems();
        kdvField.setText("");
        faturaField.setText("");
        urunAdediSpinner.setValue(1);
        urunAdiCB.addItem("Bilgisayar");
        urunAdiCB.addItem("Telefon");
        urunAdiCB.addItem("Buzdolabı");
        urunAdiCB.addItem("HDMI Kablo");
        urunAdiCB.addItem("SSD");        
    }//GEN-LAST:event_elektronikRBActionPerformed

    private void giyimRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giyimRBActionPerformed
        urunAdiCB.removeAllItems();
        kdvField.setText("");
        faturaField.setText("");
        urunAdediSpinner.setValue(1);
        urunAdiCB.addItem("Kravat");
        urunAdiCB.addItem("Takım Elbise");
        urunAdiCB.addItem("Gömlek");
        urunAdiCB.addItem("Pantolon");
        urunAdiCB.addItem("Çorap");
    }//GEN-LAST:event_giyimRBActionPerformed

    private void gidaRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gidaRBActionPerformed
        urunAdiCB.removeAllItems();
        kdvField.setText("");
        faturaField.setText("");
        urunAdediSpinner.setValue(1);
        urunAdiCB.addItem("Ton balığı");
        urunAdiCB.addItem("Mercimek");
        urunAdiCB.addItem("Su");
        urunAdiCB.addItem("Sakız");
        urunAdiCB.addItem("Salça");
    }//GEN-LAST:event_gidaRBActionPerformed

    private void hesaplaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hesaplaButtonActionPerformed
        int birimFiyati;
        try{
            birimFiyati=Integer.parseInt(birimFiyatField.getText());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Birim fiyatı boş veya rakam harici karakterler içeriyor!","HATA",JOptionPane.ERROR_MESSAGE);
            birimFiyatField.setText("");
            return;
        }
        
        String seciliReyon=group.getSelection().getActionCommand();
        int vergiOrani=0;
        if(seciliReyon.equals("elektronikRB"))vergiOrani=20;
        else if(seciliReyon.equals("giyimRB"))vergiOrani=15;
        else vergiOrani=5;
        
        int urunAdedi=(int)urunAdediSpinner.getValue();
        double kdvTutari=urunAdedi*birimFiyati*vergiOrani/100;
        kdvField.setText(kdvTutari+" TL");
        
        double faturaTutari=kdvTutari+birimFiyati;
        faturaField.setText(String.valueOf(faturaTutari));
    }//GEN-LAST:event_hesaplaButtonActionPerformed

    private void urunAdiCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urunAdiCBActionPerformed
        String seciliReyon=group.getSelection().getActionCommand();
        if(seciliReyon.equals("elektronikRB")){
            switch (urunAdiCB.getSelectedIndex()) {
                case 0:
                    birimFiyatField.setText("1000");
                    break;
                case 1:
                    birimFiyatField.setText("2000");
                    
                    break;
                case 2:
                    birimFiyatField.setText("3000");                  
                    break;
                case 3:
                    birimFiyatField.setText("4000");                   
                    break;
                case 4:
                    birimFiyatField.setText("5000");
                    break;
                    
                default:
                    break;
            }
        }
        else if(seciliReyon.equals("gidaRB")){
            switch (urunAdiCB.getSelectedIndex()) {
                case 0:
                    birimFiyatField.setText("10");
                    break;
                case 1:
                    birimFiyatField.setText("20");
                    
                    break;
                case 2:
                    birimFiyatField.setText("30");                  
                    break;
                case 3:
                    birimFiyatField.setText("40");                   
                    break;
                case 4:
                    birimFiyatField.setText("50");
                    break;
                    
                default:
                    break;
            }
        }
        else{
            switch (urunAdiCB.getSelectedIndex()) {
                case 0:
                    birimFiyatField.setText("100");
                    break;
                case 1:
                    birimFiyatField.setText("200");               
                    break;
                case 2:
                    birimFiyatField.setText("300");                  
                    break;
                case 3:
                    birimFiyatField.setText("400");                   
                    break;
                case 4:
                    birimFiyatField.setText("500");
                    break;
                    
                default:
                    break;
            }
        }
    }//GEN-LAST:event_urunAdiCBActionPerformed

    private void urunAdediSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_urunAdediSpinnerStateChanged
        kdvField.setText("");
        faturaField.setText("");
    }//GEN-LAST:event_urunAdediSpinnerStateChanged

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KDVFaturaHesapla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel baslikLabel;
    private javax.swing.JTextField birimFiyatField;
    private javax.swing.JRadioButton elektronikRB;
    private javax.swing.JTextField faturaField;
    private javax.swing.JRadioButton gidaRB;
    private javax.swing.JRadioButton giyimRB;
    private javax.swing.JButton hesaplaButton;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField kdvField;
    private javax.swing.JLabel reyonAdiLabel;
    private javax.swing.JSpinner urunAdediSpinner;
    private javax.swing.JComboBox<String> urunAdiCB;
    private javax.swing.JLabel urunAdiLabel;
    // End of variables declaration//GEN-END:variables
}
