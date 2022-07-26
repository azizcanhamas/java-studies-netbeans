package FormExamples;

public class ParaAyirici extends javax.swing.JFrame {

    public ParaAyirici() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paraLabel = new javax.swing.JLabel();
        paraField = new javax.swing.JTextField();
        hesaplaButton = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        sonucArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        paraLabel.setText("Para Miktarı:");

        hesaplaButton.setText("Hesapla");
        hesaplaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hesaplaButtonActionPerformed(evt);
            }
        });

        sonucArea.setColumns(20);
        sonucArea.setRows(5);
        jScrollPane1.setViewportView(sonucArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(paraLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(paraField, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hesaplaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paraLabel)
                    .addComponent(paraField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hesaplaButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Buton olayi tetiklendigi zaman hesaplama ve kullaniciya gosterme
    //isleminin gerceklestirilmesi
    private void hesaplaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hesaplaButtonActionPerformed
        String paraStr=paraField.getText();
        String banknotAdetleri=hesapla(Integer.parseInt(paraStr));
        sonucArea.setText(banknotAdetleri);
        
    }//GEN-LAST:event_hesaplaButtonActionPerformed
    //Hesaplanan banknotlar adetlerinin kullaniciya
    //gosterilmesi icin cikti stringinin olusturulmasi
    public static String createString(int[]arr){
        int[]banknotlar={200,100,50,20,10,5,1};
        String str="";
        for (int i = 0; i < arr.length; i++) {
            str+=banknotlar[i]+" banknot adedi: "+arr[i]+"\n";
        }
        return str;
    }
    //Banknot adetlerinin hesaplanmasi
    public static String hesapla(int para){
        int[]banknotlar={200,100,50,20,10,5,1};
        int[]banknotAdetleri=new int[]{0,0,0,0,0,0,0};//200,100,50,20,10,5,1
        for(int i=0;i<banknotlar.length;i++){
            int calc=para/banknotlar[i];
            if(calc>=0){
                banknotAdetleri[i]+=calc;
                para-=banknotlar[i]*calc;
            }
        }
        return createString(banknotAdetleri);
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ParaAyirici().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton hesaplaButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField paraField;
    private javax.swing.JLabel paraLabel;
    private javax.swing.JTextArea sonucArea;
    // End of variables declaration//GEN-END:variables
}
