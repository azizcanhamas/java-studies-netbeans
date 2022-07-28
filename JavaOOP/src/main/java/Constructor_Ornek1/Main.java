package Constructor_Ornek1;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        this.setResizable(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        markaLabel = new javax.swing.JLabel();
        cpuLabel = new javax.swing.JLabel();
        ramLabel = new javax.swing.JLabel();
        hddLabel = new javax.swing.JLabel();
        markaCB = new javax.swing.JComboBox<>();
        cpuCB = new javax.swing.JComboBox<>();
        ramCB = new javax.swing.JComboBox<>();
        hddCB = new javax.swing.JComboBox<>();
        islemButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        markaLabel.setText("Marka");

        cpuLabel.setText("CPU");

        ramLabel.setText("RAM");

        hddLabel.setText("HDD");

        markaCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HP", "ASUS", "LENOVO", "DELL", "MSI" }));

        cpuCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "i3", "i5", "i7", "i9", "Ryzen 5", "Ryzen 7" }));

        ramCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4 GB", "8 GB", "16 GB", "32 GB" }));

        hddCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "256 GB", "512 GB", "1024 GB" }));

        islemButton.setText("İşlem");
        islemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                islemButtonActionPerformed(evt);
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
                        .addComponent(hddLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(hddCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(markaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(markaCB, 0, 159, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cpuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cpuCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ramLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ramCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(islemButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(markaLabel)
                    .addComponent(markaCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cpuLabel)
                    .addComponent(cpuCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ramLabel)
                    .addComponent(ramCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hddLabel)
                    .addComponent(hddCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(islemButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void islemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_islemButtonActionPerformed
        String marka=(String)markaCB.getSelectedItem();
        String cpu=(String)cpuCB.getSelectedItem();
        String ram=(String)ramCB.getSelectedItem();
        String hdd=(String)hddCB.getSelectedItem();
        
        Laptop l=new Laptop();
        Laptop l1=new Laptop(marka);
        Laptop l2=new Laptop(marka,cpu);
        Laptop l3=new Laptop(marka,cpu,ram);
        Laptop l4=new Laptop(marka,cpu,ram,hdd);
    }//GEN-LAST:event_islemButtonActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cpuCB;
    private javax.swing.JLabel cpuLabel;
    private javax.swing.JComboBox<String> hddCB;
    private javax.swing.JLabel hddLabel;
    private javax.swing.JButton islemButton;
    private javax.swing.JComboBox<String> markaCB;
    private javax.swing.JLabel markaLabel;
    private javax.swing.JComboBox<String> ramCB;
    private javax.swing.JLabel ramLabel;
    // End of variables declaration//GEN-END:variables
}
