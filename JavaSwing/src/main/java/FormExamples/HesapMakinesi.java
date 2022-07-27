package FormExamples;



import java.util.ArrayList;

public class HesapMakinesi extends javax.swing.JFrame {

    String islem="";
    
    public HesapMakinesi() {
        initComponents();
        //ekranin tam ortasinda baslatmak icin
        this.setLocationRelativeTo(null);
        inputField.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inputField = new javax.swing.JTextField();
        temizleButton = new javax.swing.JToggleButton();
        silButton = new javax.swing.JToggleButton();
        birButton = new javax.swing.JToggleButton();
        ikiButton = new javax.swing.JToggleButton();
        ucButton = new javax.swing.JToggleButton();
        toplaButton = new javax.swing.JToggleButton();
        altiButton = new javax.swing.JToggleButton();
        besButton = new javax.swing.JToggleButton();
        cikarButton = new javax.swing.JToggleButton();
        dortButton = new javax.swing.JToggleButton();
        yediButton = new javax.swing.JToggleButton();
        sekizButton = new javax.swing.JToggleButton();
        carpButton = new javax.swing.JToggleButton();
        dokuzButton = new javax.swing.JToggleButton();
        sifirButton = new javax.swing.JToggleButton();
        noktaButton = new javax.swing.JToggleButton();
        bolButton = new javax.swing.JToggleButton();
        modButton = new javax.swing.JToggleButton();
        esitButton = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hesap Makinesi");
        setResizable(false);

        temizleButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        temizleButton.setText("C");
        temizleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temizleButtonActionPerformed(evt);
            }
        });

        silButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        silButton.setText("←");
        silButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silButtonActionPerformed(evt);
            }
        });

        birButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        birButton.setText("1");
        birButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                birButtonActionPerformed(evt);
            }
        });

        ikiButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ikiButton.setText("2");
        ikiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ikiButtonActionPerformed(evt);
            }
        });

        ucButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ucButton.setText("3");
        ucButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ucButtonActionPerformed(evt);
            }
        });

        toplaButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        toplaButton.setText("+");
        toplaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toplaButtonActionPerformed(evt);
            }
        });

        altiButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        altiButton.setText("6");
        altiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altiButtonActionPerformed(evt);
            }
        });

        besButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        besButton.setText("5");
        besButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                besButtonActionPerformed(evt);
            }
        });

        cikarButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cikarButton.setText("-");
        cikarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cikarButtonActionPerformed(evt);
            }
        });

        dortButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        dortButton.setText("4");
        dortButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dortButtonActionPerformed(evt);
            }
        });

        yediButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        yediButton.setText("7");
        yediButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yediButtonActionPerformed(evt);
            }
        });

        sekizButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sekizButton.setText("8");
        sekizButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sekizButtonActionPerformed(evt);
            }
        });

        carpButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        carpButton.setText("X");
        carpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carpButtonActionPerformed(evt);
            }
        });

        dokuzButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        dokuzButton.setText("9");
        dokuzButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dokuzButtonActionPerformed(evt);
            }
        });

        sifirButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sifirButton.setText("0");
        sifirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sifirButtonActionPerformed(evt);
            }
        });

        noktaButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        noktaButton.setText(".");
        noktaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noktaButtonActionPerformed(evt);
            }
        });

        bolButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bolButton.setText("/");
        bolButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bolButtonActionPerformed(evt);
            }
        });

        modButton.setFont(new java.awt.Font("Segoe UI", 1, 6)); // NOI18N
        modButton.setText("MOD");
        modButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modButtonActionPerformed(evt);
            }
        });

        esitButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        esitButton.setText("=");
        esitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(inputField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(silButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(birButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ikiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ucButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(dortButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(besButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(altiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(esitButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(yediButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sifirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(noktaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sekizButton, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dokuzButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(temizleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(toplaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cikarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(bolButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(modButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(silButton)
                    .addComponent(inputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(birButton)
                    .addComponent(ucButton)
                    .addComponent(ikiButton)
                    .addComponent(toplaButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dortButton)
                    .addComponent(altiButton)
                    .addComponent(besButton)
                    .addComponent(cikarButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yediButton)
                    .addComponent(dokuzButton)
                    .addComponent(sekizButton)
                    .addComponent(carpButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sifirButton)
                    .addComponent(noktaButton)
                    .addComponent(bolButton)
                    .addComponent(temizleButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(esitButton)
                    .addComponent(modButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void birButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_birButtonActionPerformed
        inputField.setText(inputField.getText()+"1");
    }//GEN-LAST:event_birButtonActionPerformed

    private void ikiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ikiButtonActionPerformed
        inputField.setText(inputField.getText()+"2");
    }//GEN-LAST:event_ikiButtonActionPerformed

    private void ucButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ucButtonActionPerformed
        inputField.setText(inputField.getText()+"3");
    }//GEN-LAST:event_ucButtonActionPerformed

    private void dortButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dortButtonActionPerformed
        inputField.setText(inputField.getText()+"4");
    }//GEN-LAST:event_dortButtonActionPerformed

    private void besButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_besButtonActionPerformed
        inputField.setText(inputField.getText()+"5");
    }//GEN-LAST:event_besButtonActionPerformed

    private void altiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altiButtonActionPerformed
        inputField.setText(inputField.getText()+"6");
    }//GEN-LAST:event_altiButtonActionPerformed

    private void yediButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yediButtonActionPerformed
        inputField.setText(inputField.getText()+"7");
    }//GEN-LAST:event_yediButtonActionPerformed

    private void sekizButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sekizButtonActionPerformed
        inputField.setText(inputField.getText()+"8");
    }//GEN-LAST:event_sekizButtonActionPerformed

    private void dokuzButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dokuzButtonActionPerformed
        inputField.setText(inputField.getText()+"9");
    }//GEN-LAST:event_dokuzButtonActionPerformed

    private void sifirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sifirButtonActionPerformed
        if(inputField.getText().equals("")){
            if (String.valueOf(inputField.getText().charAt(inputField.getText().length()-1)).equals("0")) return;
        }
        else inputField.setText(inputField.getText()+"0");
    }//GEN-LAST:event_sifirButtonActionPerformed

    private void noktaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noktaButtonActionPerformed
        if (inputField.getText().equals("")) inputField.setText("0.");
        else if (String.valueOf(inputField.getText().charAt(inputField.getText().length()-1)).equals(".")) return;
        else inputField.setText(inputField.getText()+".");  
    }//GEN-LAST:event_noktaButtonActionPerformed

    private void temizleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temizleButtonActionPerformed
        inputField.setText("");
    }//GEN-LAST:event_temizleButtonActionPerformed

    private void silButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silButtonActionPerformed
        String input=inputField.getText();
        String newString="";
        for (int i = 0; i < input.length()-1; i++) newString+=input.charAt(i);      
        inputField.setText(newString);
    }//GEN-LAST:event_silButtonActionPerformed
    
    private void toplaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toplaButtonActionPerformed
        if (inputField.getText().equals("")) return;
        else if (String.valueOf(inputField.getText().charAt(inputField.getText().length()-1)).equals("+")) return;
        else {
            islem="+";
            inputField.setText(inputField.getText()+"+");
            islemlerPasif();
        }       
    }//GEN-LAST:event_toplaButtonActionPerformed

    private void cikarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cikarButtonActionPerformed
        if (inputField.getText().equals("")) return;
        else if (String.valueOf(inputField.getText().charAt(inputField.getText().length()-1)).equals("-")) return;
        else {
            islem="-";
            inputField.setText(inputField.getText()+"-");
            islemlerPasif();
        }
    }//GEN-LAST:event_cikarButtonActionPerformed

    private void carpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carpButtonActionPerformed
        if (inputField.getText().equals("")) return;
        else if (String.valueOf(inputField.getText().charAt(inputField.getText().length()-1)).equals("*")) return;
        else {
            islem="*";
            inputField.setText(inputField.getText()+"*");
            islemlerPasif();
        }
    }//GEN-LAST:event_carpButtonActionPerformed

    private void bolButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bolButtonActionPerformed
        if (inputField.getText().equals("")) return;
        else if (String.valueOf(inputField.getText().charAt(inputField.getText().length()-1)).equals("/")) return;
        else {
            islem="/";
            inputField.setText(inputField.getText()+"/");
            islemlerPasif();
        }
    }//GEN-LAST:event_bolButtonActionPerformed

    private void modButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modButtonActionPerformed
        if (inputField.getText().equals("")) return;
        else if (String.valueOf(inputField.getText().charAt(inputField.getText().length()-1)).equals("%")) return;
        else {
            islem="%";
            inputField.setText(inputField.getText()+"%");
            islemlerPasif();
        }
    }//GEN-LAST:event_modButtonActionPerformed

    private void esitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esitButtonActionPerformed
        islemlerAktif();
        if(inputField.getText().length()==0)return;
        else{
            ArrayList<Double> arr=new ArrayList<Double>();
            String tmp="";
            for (int i = 0; i < inputField.getText().length(); i++) {
                if(!String.valueOf(inputField.getText().charAt(i)).equals(islem)){
                    tmp+=String.valueOf(inputField.getText().charAt(i));
                }
                else{
                    arr.add(Double.parseDouble(tmp));
                    tmp="";
                }
            }
            arr.add(Double.parseDouble(tmp));
            if(arr.size()==1)return;
            switch (islem) {
                case "+":
                    inputField.setText(String.valueOf(arr.get(0)+arr.get(1)));
                    break;
                    
                case "-":
                    inputField.setText(String.valueOf(arr.get(0)-arr.get(1)));
                    break;
                    
                case "*":
                    inputField.setText(String.valueOf(arr.get(0)*arr.get(1)));
                    break;
                    
                case "/":
                    inputField.setText(String.valueOf(arr.get(0)/arr.get(1)));
                    break;

                case "%":
                    inputField.setText(String.valueOf(arr.get(0)%arr.get(1)));
                break;
                default:
                    throw new AssertionError();
            }
//            double sayi1=Double.parseDouble(arr[0]);
//            double sayi2=Double.parseDouble(arr[1]);
//            System.out.println(String.valueOf(sayi1)+String.valueOf(sayi2)+String.valueOf(islem));
        }
        
    }//GEN-LAST:event_esitButtonActionPerformed

    private void islemlerPasif(){
        toplaButton.setEnabled(false);
        cikarButton.setEnabled(false);
        carpButton.setEnabled(false);
        bolButton.setEnabled(false);
    }
    
    private void islemlerAktif(){
        toplaButton.setEnabled(true);
        cikarButton.setEnabled(true);
        carpButton.setEnabled(true);
        bolButton.setEnabled(true);
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HesapMakinesi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton altiButton;
    private javax.swing.JToggleButton besButton;
    private javax.swing.JToggleButton birButton;
    private javax.swing.JToggleButton bolButton;
    private javax.swing.JToggleButton carpButton;
    private javax.swing.JToggleButton cikarButton;
    private javax.swing.JToggleButton dokuzButton;
    private javax.swing.JToggleButton dortButton;
    private javax.swing.JToggleButton esitButton;
    private javax.swing.JToggleButton ikiButton;
    private javax.swing.JTextField inputField;
    private javax.swing.JToggleButton modButton;
    private javax.swing.JToggleButton noktaButton;
    private javax.swing.JToggleButton sekizButton;
    private javax.swing.JToggleButton sifirButton;
    private javax.swing.JToggleButton silButton;
    private javax.swing.JToggleButton temizleButton;
    private javax.swing.JToggleButton toplaButton;
    private javax.swing.JToggleButton ucButton;
    private javax.swing.JToggleButton yediButton;
    // End of variables declaration//GEN-END:variables
}
