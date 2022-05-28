/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import javax.swing.JOptionPane;

/**
 *  
 * @author ardhiansaa
 */
// oop 1
public class FormMenuUtama extends javax.swing.JFrame {
    public String[][] pilih = {{"Cuci Kering","5000"},
                              {"Cuci Basah","4000"},
                              {"Cuci Setrika","6000"},
                              {"Setrika","3000"},
                              };
    // methode dan variabel tipe data array
    public FormMenuUtama() {
        initComponents();
    }
    public int Total_harga;
    public int Kembalian;
    public void reset(){
        jTextFieldNamaPelanggan.setText("");
        jComboBoxJenisCuci.setSelectedItem("Jenis Cuci");
        jTextFieldJenisCuci.setText("");
        jTextFieldBerat.setText("");
        jTextFieldHarga.setText("");
        jTextFieldBayar.setText("");
        jTextFieldKembali.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Bayar = new javax.swing.JPanel();
        LNamaPelanggan = new javax.swing.JLabel();
        LJenisCuci = new javax.swing.JLabel();
        jTextFieldNamaPelanggan = new javax.swing.JTextField();
        jComboBoxJenisCuci = new javax.swing.JComboBox<>();
        jTextFieldJenisCuci = new javax.swing.JTextField();
        LBerat = new javax.swing.JLabel();
        jTextFieldBerat = new javax.swing.JTextField();
        LHarga = new javax.swing.JLabel();
        jTextFieldHarga = new javax.swing.JTextField();
        LBayar = new javax.swing.JLabel();
        jTextFieldBayar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButtonBayar = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jButtonLogOut = new javax.swing.JButton();
        LKembali = new javax.swing.JLabel();
        jTextFieldKembali = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabelTekomLaundry = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FormUtama");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        Bayar.setBackground(new java.awt.Color(10, 150, 200));

        LNamaPelanggan.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LNamaPelanggan.setText("Nama Pelanggan");
        LNamaPelanggan.setPreferredSize(new java.awt.Dimension(85, 25));

        LJenisCuci.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LJenisCuci.setText("Jenis Cuci");

        jTextFieldNamaPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNamaPelangganActionPerformed(evt);
            }
        });

        jComboBoxJenisCuci.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jenis Cuci", "Cuci Kering", "Cuci Basah", "Cuci Setrika", "Setrika" }));
        jComboBoxJenisCuci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxJenisCuciActionPerformed(evt);
            }
        });

        LBerat.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LBerat.setText("Berat");

        jTextFieldBerat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldBeratKeyReleased(evt);
            }
        });

        LHarga.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LHarga.setText("Harga");

        jTextFieldHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldHargaActionPerformed(evt);
            }
        });

        LBayar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LBayar.setText("Bayar");

        jTextFieldBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBayarActionPerformed(evt);
            }
        });
        jTextFieldBayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldBayarKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Harga per-Kilo");

        jButtonBayar.setText("Bayar");
        jButtonBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBayarActionPerformed(evt);
            }
        });

        jButtonClear.setText("Clear");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        jButtonLogOut.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        jButtonLogOut.setText("LOGOUT");
        jButtonLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogOutActionPerformed(evt);
            }
        });

        LKembali.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LKembali.setText("Kembalian");

        jTextFieldKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldKembaliActionPerformed(evt);
            }
        });
        jTextFieldKembali.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldKembaliKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout BayarLayout = new javax.swing.GroupLayout(Bayar);
        Bayar.setLayout(BayarLayout);
        BayarLayout.setHorizontalGroup(
            BayarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BayarLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(BayarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(BayarLayout.createSequentialGroup()
                        .addComponent(LKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldKembali))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BayarLayout.createSequentialGroup()
                        .addGroup(BayarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LJenisCuci, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(BayarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxJenisCuci, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldJenisCuci, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BayarLayout.createSequentialGroup()
                        .addGroup(BayarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LBayar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(BayarLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(LHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(BayarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BayarLayout.createSequentialGroup()
                        .addGroup(BayarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LBerat, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LNamaPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(BayarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldBerat)
                            .addGroup(BayarLayout.createSequentialGroup()
                                .addComponent(jTextFieldNamaPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(BayarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonBayar, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                    .addComponent(jButtonClear, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                    .addComponent(jButtonLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))
                .addGap(141, 141, 141))
        );
        BayarLayout.setVerticalGroup(
            BayarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BayarLayout.createSequentialGroup()
                .addGroup(BayarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BayarLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(BayarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNamaPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LNamaPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BayarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxJenisCuci)
                            .addComponent(LJenisCuci, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BayarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldJenisCuci, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(BayarLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jButtonBayar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(16, 16, 16)
                .addGroup(BayarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BayarLayout.createSequentialGroup()
                        .addGroup(BayarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldBerat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LBerat))
                        .addGap(22, 22, 22)
                        .addGroup(BayarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LHarga)))
                    .addGroup(BayarLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BayarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BayarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LKembali)
                    .addComponent(jTextFieldKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(228, 228, 228))
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/laun.jpeg"))); // NOI18N

        jLabelTekomLaundry.setBackground(new java.awt.Color(10, 150, 200));
        jLabelTekomLaundry.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabelTekomLaundry.setForeground(new java.awt.Color(10, 150, 200));
        jLabelTekomLaundry.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTekomLaundry.setText("Tekom Laundry");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(10, 150, 200));
        jLabel5.setText("Jl. Prof. Sudarto No. 69 Kelurahan Tembalang, Kecamatan Tembalang");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(10, 150, 200));
        jLabel6.setText("CP : 08765432189, PickUp Delivery : 0234567");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabelTekomLaundry, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(Bayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabelTekomLaundry, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Bayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(600, 618));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
     
    
    private void jButtonBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBayarActionPerformed
        // pengkondisian
        if(jTextFieldBayar.getText().isEmpty()||jTextFieldBerat.getText().isEmpty()||jTextFieldHarga.getText().isEmpty()||jTextFieldKembali.getText().isEmpty())
        {JOptionPane.showMessageDialog(rootPane,"Data Harus Diisi");
        }else{
                
            
            JOptionPane.showMessageDialog(null, "## Tekom Laundry ##\n"+ 
                    "Nama Pelanggan: "+jTextFieldNamaPelanggan.getText()+"\n"
                     +"Jenis Cuci: "+jComboBoxJenisCuci.getSelectedItem()+ "\n"
                     + "Berat Cuci: "+jTextFieldBerat.getText()+ "kg"+ "\n"
                     + "Total:    Rp." + jTextFieldHarga.getText()+ "\n"
                     + "Bayar:    Rp." + jTextFieldBayar.getText()+ "\n"
                     + "Kembali:  Rp." + jTextFieldKembali.getText()+"\n"
                     +"!!!Transaksi Berhasil!!!", "Rincian", JOptionPane.INFORMATION_MESSAGE);
                int jawab = JOptionPane.showOptionDialog(this, 
                        "Apakah anda ingin Keluar?", 
                        "Keluar", 
                        JOptionPane.YES_NO_OPTION, 
                        JOptionPane.QUESTION_MESSAGE, null, null, null);
        
                    switch(jawab){
                    case JOptionPane.YES_OPTION: 
                        System.exit(0);
                    case JOptionPane.NO_OPTION:
                         reset();
                    }
        }
    }//GEN-LAST:event_jButtonBayarActionPerformed
    
    private void jTextFieldBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBayarActionPerformed
        
    }//GEN-LAST:event_jTextFieldBayarActionPerformed

    private void jTextFieldHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldHargaActionPerformed
        
    }//GEN-LAST:event_jTextFieldHargaActionPerformed

    private void jComboBoxJenisCuciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxJenisCuciActionPerformed
        if(jComboBoxJenisCuci.getSelectedItem().equals("Jenis Cuci")){
            jTextFieldJenisCuci.setText("");
            }
            for(int i=0;i<pilih.length;i++){
                if(jComboBoxJenisCuci.getSelectedItem().equals(pilih[i][0])){
            jTextFieldJenisCuci.setText(pilih[i][1]);  
            }
            }
        /*
        if(jComboBoxJenisCuci.getSelectedItem().equals("Pilih Jenis")){
        jTextFieldJenisCuci.setText("");
        }else if(jComboBoxJenisCuci.getSelectedItem().equals("Cuci Kering")){
        jTextFieldJenisCuci.setText("5000");
        }else if(jComboBoxJenisCuci.getSelectedItem().equals("Cuci Basah")){
        jTextFieldJenisCuci.setText("4000");
        }else if(jComboBoxJenisCuci.getSelectedItem().equals("Cuci Setrika")){
        jTextFieldJenisCuci.setText("6000");
        }else if(jComboBoxJenisCuci.getSelectedItem().equals("Setrika")){
        jTextFieldJenisCuci.setText("3000");
        }*/
    }//GEN-LAST:event_jComboBoxJenisCuciActionPerformed

    private void jTextFieldBeratKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBeratKeyReleased
        
        if(jTextFieldBerat.getText().equals("")){
        jTextFieldHarga.setText("");
        }else{
            int harga = Integer.parseInt(jTextFieldJenisCuci.getText());
            int berat = Integer.parseInt(jTextFieldBerat.getText());
            Total_harga= harga*berat;
            jTextFieldHarga.setText(String.valueOf(Total_harga));
        }
        
    }//GEN-LAST:event_jTextFieldBeratKeyReleased

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
       
        reset();
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jButtonLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogOutActionPerformed
        
        this.setVisible(false);
        new HomeLogin().setVisible(true);
    }//GEN-LAST:event_jButtonLogOutActionPerformed
    
    private void jTextFieldNamaPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNamaPelangganActionPerformed
        
    }//GEN-LAST:event_jTextFieldNamaPelangganActionPerformed

    private void jTextFieldKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldKembaliActionPerformed
       
    }//GEN-LAST:event_jTextFieldKembaliActionPerformed

    private void jTextFieldKembaliKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldKembaliKeyReleased
        
    }//GEN-LAST:event_jTextFieldKembaliKeyReleased

    private void jTextFieldBayarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBayarKeyReleased
       
        int bayar = Integer.parseInt(jTextFieldBayar.getText());
        int Kembalian = bayar-Total_harga;
        jTextFieldKembali.setText(String.valueOf(Kembalian));
    }//GEN-LAST:event_jTextFieldBayarKeyReleased
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormMenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bayar;
    private javax.swing.JLabel LBayar;
    private javax.swing.JLabel LBerat;
    private javax.swing.JLabel LHarga;
    private javax.swing.JLabel LJenisCuci;
    private javax.swing.JLabel LKembali;
    private javax.swing.JLabel LNamaPelanggan;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonBayar;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonLogOut;
    private javax.swing.JComboBox<String> jComboBoxJenisCuci;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelTekomLaundry;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldBayar;
    private javax.swing.JTextField jTextFieldBerat;
    private javax.swing.JTextField jTextFieldHarga;
    private javax.swing.JTextField jTextFieldJenisCuci;
    private javax.swing.JTextField jTextFieldKembali;
    private javax.swing.JTextField jTextFieldNamaPelanggan;
    // End of variables declaration//GEN-END:variables
}
