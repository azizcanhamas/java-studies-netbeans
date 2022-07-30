package Interface_Ornek2;

public class GUI_But extends javax.swing.JFrame {

    public GUI_But() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        butLabel = new javax.swing.JLabel();
        butField = new javax.swing.JTextField();
        sonucLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        butLabel.setText("Bütünleme");

        butField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                butFieldKeyReleased(evt);
            }
        });

        sonucLabel.setText("Sonuc:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(sonucLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(butLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(butField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butLabel)
                    .addComponent(butField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sonucLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_butFieldKeyReleased
        //Kullanicidan butunleme notunun alinmasi ve ButHesap sinifi ile guncel
        //not ortalamasinin hesaplatilmasi. vize notu Final arayüzünde saklanan
        //static degiskenden alinmaktadir.
        double bnt=Double.parseDouble(butField.getText());
        ButHesap bh=new ButHesap(GUI_Final.vnt, bnt);
        if(bh.getGNT()<50)sonucLabel.setText("Dersten "+bh.getGNT()+" ortalama ile kaldiniz!");
        else sonucLabel.setText("Dersten "+bh.getGNT()+" ortalama ile gectiniz!");
    }//GEN-LAST:event_butFieldKeyReleased

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_But().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField butField;
    private javax.swing.JLabel butLabel;
    private javax.swing.JLabel sonucLabel;
    // End of variables declaration//GEN-END:variables
}
