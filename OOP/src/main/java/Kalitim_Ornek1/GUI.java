package Kalitim_Ornek1;

import javax.swing.JOptionPane;

public class GUI extends javax.swing.JFrame {

    public GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        baslikLabel = new javax.swing.JLabel();
        adLabel = new javax.swing.JLabel();
        soyadLabel = new javax.swing.JLabel();
        yasLabel = new javax.swing.JLabel();
        boyLabel = new javax.swing.JLabel();
        dogumYeriLabel = new javax.swing.JLabel();
        pythonBilgisiLabel = new javax.swing.JLabel();
        alanLabel = new javax.swing.JLabel();
        projeSayisiLabel = new javax.swing.JLabel();
        calistigiYerSayisiLabel = new javax.swing.JLabel();
        matlabBilgisiLabel = new javax.swing.JLabel();
        gelecekHayaliLabel = new javax.swing.JLabel();
        bilardoLabel = new javax.swing.JLabel();
        patenLabel = new javax.swing.JLabel();
        adField = new javax.swing.JTextField();
        soyadField = new javax.swing.JTextField();
        boyField = new javax.swing.JTextField();
        dogumYeriField = new javax.swing.JTextField();
        alanField = new javax.swing.JTextField();
        projeSayisiSpinner = new javax.swing.JSpinner();
        calistigiYerSayisiSpinner = new javax.swing.JSpinner();
        yasSpinner = new javax.swing.JSpinner();
        matlabBilgisiCB = new javax.swing.JComboBox<>();
        gelecekHayaliField = new javax.swing.JTextField();
        patenCB = new javax.swing.JComboBox<>();
        pythonBilgisiCB = new javax.swing.JComboBox<>();
        bilardoCB = new javax.swing.JComboBox<>();
        gosterButton = new javax.swing.JButton();
        temizleButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mühendis Kişi Oluştur");
        setResizable(false);

        baslikLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        baslikLabel.setText("Mühendis Kişi Oluştur");

        adLabel.setText("Ad");

        soyadLabel.setText("Soyad");

        yasLabel.setText("Yas");

        boyLabel.setText("Boy Uzunlugu");

        dogumYeriLabel.setText("Dogum Yeri");

        pythonBilgisiLabel.setText("Python Bilgisi");

        alanLabel.setText("Alan");

        projeSayisiLabel.setText("Proje Sayisi");

        calistigiYerSayisiLabel.setText("Calistigi Yer Sayisi");

        matlabBilgisiLabel.setText("MatLab Bilgisi");

        gelecekHayaliLabel.setText("Gelecek Hayali");

        bilardoLabel.setText("Bilardo");

        patenLabel.setText("Paten");

        matlabBilgisiCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hayır", "Evet" }));

        patenCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hayır", "Evet" }));

        pythonBilgisiCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hayır", "Evet" }));

        bilardoCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hayır", "Evet" }));

        gosterButton.setText("Göster");
        gosterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gosterButtonActionPerformed(evt);
            }
        });

        temizleButton.setText("Temizle");
        temizleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temizleButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(baslikLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(calistigiYerSayisiLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(matlabBilgisiLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pythonBilgisiLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(projeSayisiLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(alanLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dogumYeriLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(yasLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(soyadLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(adLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gelecekHayaliLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bilardoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(patenLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(soyadField)
                                .addComponent(boyField)
                                .addComponent(dogumYeriField)
                                .addComponent(alanField)
                                .addComponent(yasSpinner)
                                .addComponent(projeSayisiSpinner)
                                .addComponent(calistigiYerSayisiSpinner)
                                .addComponent(adField)
                                .addComponent(matlabBilgisiCB, 0, 276, Short.MAX_VALUE)
                                .addComponent(gelecekHayaliField))
                            .addComponent(bilardoCB, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(patenCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pythonBilgisiCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(gosterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(temizleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(baslikLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adLabel)
                    .addComponent(adField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soyadLabel)
                    .addComponent(soyadField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yasLabel)
                    .addComponent(yasSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boyLabel)
                    .addComponent(boyField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dogumYeriLabel)
                    .addComponent(dogumYeriField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alanLabel)
                    .addComponent(alanField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(projeSayisiLabel)
                    .addComponent(projeSayisiSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calistigiYerSayisiLabel)
                    .addComponent(calistigiYerSayisiSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(matlabBilgisiLabel)
                    .addComponent(matlabBilgisiCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pythonBilgisiLabel)
                    .addComponent(pythonBilgisiCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patenLabel)
                    .addComponent(patenCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bilardoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bilardoCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gelecekHayaliLabel)
                    .addComponent(gelecekHayaliField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gosterButton)
                    .addComponent(temizleButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void temizleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temizleButtonActionPerformed
        adField.setText("");
        soyadField.setText("");
        yasSpinner.setValue(0);
        boyField.setText("");
        dogumYeriField.setText("");
        alanField.setText("");
        projeSayisiSpinner.setValue(0);
        calistigiYerSayisiSpinner.setValue(0);
        matlabBilgisiCB.setSelectedIndex(0);
        pythonBilgisiCB.setSelectedIndex(0);
        patenCB.setSelectedIndex(0);
        bilardoCB.setSelectedIndex(0);
        gelecekHayaliField.setText("");
    }//GEN-LAST:event_temizleButtonActionPerformed

    private void gosterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gosterButtonActionPerformed
        String ad=adField.getText();
        String soyad=soyadField.getText();
        int yas=(Integer)yasSpinner.getValue();
        float boyUzunlugu=Float.parseFloat(boyField.getText());
        String dogumYeri=dogumYeriField.getText();
        String alan=alanField.getText();
        int projeSayisi=(Integer)projeSayisiSpinner.getValue();
        int calistigiYerSayisi=(Integer)calistigiYerSayisiSpinner.getValue();
        
        boolean matlabBilgisi=false;
        if(matlabBilgisiCB.getSelectedIndex()==1)matlabBilgisi=true;
        boolean pythonBilgisi=false;
        if(pythonBilgisiCB.getSelectedIndex()==1)pythonBilgisi=true;
        boolean paten=false;
        if(patenCB.getSelectedIndex()==1)paten=true;
        boolean bilardo=false;
        if(bilardoCB.getSelectedIndex()==1)bilardo=true;
  
        String gelecekHayali=gelecekHayaliField.getText();        
        Kisi k=new Kisi(paten,bilardo,gelecekHayali,ad,soyad,yas,boyUzunlugu,dogumYeri,alan,projeSayisi,calistigiYerSayisi,pythonBilgisi,matlabBilgisi);
        String tmp=k.goster();
        JOptionPane.showMessageDialog(null, tmp);
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
    private javax.swing.JTextField alanField;
    private javax.swing.JLabel alanLabel;
    private javax.swing.JLabel baslikLabel;
    private javax.swing.JComboBox<String> bilardoCB;
    private javax.swing.JLabel bilardoLabel;
    private javax.swing.JTextField boyField;
    private javax.swing.JLabel boyLabel;
    private javax.swing.JLabel calistigiYerSayisiLabel;
    private javax.swing.JSpinner calistigiYerSayisiSpinner;
    private javax.swing.JTextField dogumYeriField;
    private javax.swing.JLabel dogumYeriLabel;
    private javax.swing.JTextField gelecekHayaliField;
    private javax.swing.JLabel gelecekHayaliLabel;
    private javax.swing.JButton gosterButton;
    private javax.swing.JComboBox<String> matlabBilgisiCB;
    private javax.swing.JLabel matlabBilgisiLabel;
    private javax.swing.JComboBox<String> patenCB;
    private javax.swing.JLabel patenLabel;
    private javax.swing.JLabel projeSayisiLabel;
    private javax.swing.JSpinner projeSayisiSpinner;
    private javax.swing.JComboBox<String> pythonBilgisiCB;
    private javax.swing.JLabel pythonBilgisiLabel;
    private javax.swing.JTextField soyadField;
    private javax.swing.JLabel soyadLabel;
    private javax.swing.JButton temizleButton;
    private javax.swing.JLabel yasLabel;
    private javax.swing.JSpinner yasSpinner;
    // End of variables declaration//GEN-END:variables
}
