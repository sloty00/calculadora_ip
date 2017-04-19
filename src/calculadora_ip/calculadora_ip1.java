/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_ip;

import java.sql.ResultSet;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.pushingpixels.substance.api.SubstanceLookAndFeel;
import org.pushingpixels.substance.api.skin.BusinessBlueSteelSkin;
import org.pushingpixels.substance.api.skin.DustSkin;
import org.pushingpixels.substance.api.skin.OfficeBlue2007Skin;

/**
 *
 * @author Jose
 */
public class calculadora_ip1 extends javax.swing.JFrame {
    DefaultTableModel model;   
    /**
     * Creates new form calculadora_ip1
     */
    public calculadora_ip1() {
        initComponents();
    }
    
    void limpiar() {
        txt_ip.setText("");
    }
    
    void llenar_subredes() {
        if (txt_ip.getText().isEmpty()) {
            jlbl_panel.setText("Ponga un valor: xxx.xxx.xxx");
        } else {
        try {
            String [] titulos = {"Subred","Dirección de Subred","Rango IP Valida","Dirección Broadcast"};
            if (jcbx_bits.getSelectedItem().equals("/27")) {
                Object[][] data = {
                    {new Integer(0), txt_ip.getText()+".0", txt_ip.getText()+".1 / "+txt_ip.getText()+".30", txt_ip.getText()+".31"},
                    {new Integer(1), txt_ip.getText()+".32", txt_ip.getText()+".33 / "+txt_ip.getText()+".62", txt_ip.getText()+".63"},
                    {new Integer(2), txt_ip.getText()+".64", txt_ip.getText()+".65 / "+txt_ip.getText()+".94", txt_ip.getText()+".95"},
                    {new Integer(3), txt_ip.getText()+".96", txt_ip.getText()+".97 / "+txt_ip.getText()+".126", txt_ip.getText()+".127"},
                    {new Integer(4), txt_ip.getText()+".128", txt_ip.getText()+".129 / "+txt_ip.getText()+".158", txt_ip.getText()+".159"},
                    {new Integer(5), txt_ip.getText()+".160", txt_ip.getText()+".161 / "+txt_ip.getText()+".190", txt_ip.getText()+".191"},
                    {new Integer(6), txt_ip.getText()+".192", txt_ip.getText()+".193 / "+txt_ip.getText()+".222", txt_ip.getText()+".223"},
                    {new Integer(7), txt_ip.getText()+".224", txt_ip.getText()+".225 / "+txt_ip.getText()+".254", txt_ip.getText()+".255"},
                };
                model = new DefaultTableModel(data, titulos);
                jlbl_mascara.setText("255.255.255.224");
                jlbl_panel.setText("Subred Cargada (/27)");
            } else if (jcbx_bits.getSelectedItem().equals("/25")) {
                Object[][] data = {
                    {new Integer(0), txt_ip.getText()+".0", txt_ip.getText()+".1 / "+txt_ip.getText()+".126", txt_ip.getText()+".127"},
                    {new Integer(1), txt_ip.getText()+".128", txt_ip.getText()+".129 / "+txt_ip.getText()+".254", txt_ip.getText()+".255"},
                };
                model = new DefaultTableModel(data, titulos);
                jlbl_mascara.setText("255.255.255.128");
                jlbl_panel.setText("Subred Cargada (/25)");
            } else if (jcbx_bits.getSelectedItem().equals("/26")) {
                Object[][] data = {
                    {new Integer(0), txt_ip.getText()+".0", txt_ip.getText()+".1 / "+txt_ip.getText()+".62", txt_ip.getText()+".63"},
                    {new Integer(1), txt_ip.getText()+".64", txt_ip.getText()+".65 / "+txt_ip.getText()+".126", txt_ip.getText()+".127"},
                    {new Integer(2), txt_ip.getText()+".128", txt_ip.getText()+".129 / "+txt_ip.getText()+".190", txt_ip.getText()+".191"},
                    {new Integer(3), txt_ip.getText()+".191", txt_ip.getText()+".193 / "+txt_ip.getText()+".254", txt_ip.getText()+".255"},
                };
                model = new DefaultTableModel(data, titulos);
                jlbl_mascara.setText("255.255.255.192");
                jlbl_panel.setText("Subred Cargada (/26)");
            } else if (jcbx_bits.getSelectedItem().equals("/28")) {
                Object[][] data = {
                    {new Integer(0), txt_ip.getText()+".0", txt_ip.getText()+".1 / "+txt_ip.getText()+".14", txt_ip.getText()+".15"},
                    {new Integer(1), txt_ip.getText()+".16", txt_ip.getText()+".17 / "+txt_ip.getText()+".30", txt_ip.getText()+".31"},
                    {new Integer(2), txt_ip.getText()+".32", txt_ip.getText()+".33 / "+txt_ip.getText()+".46", txt_ip.getText()+".47"},
                    {new Integer(3), txt_ip.getText()+".48", txt_ip.getText()+".49 / "+txt_ip.getText()+".62", txt_ip.getText()+".63"},
                    {new Integer(4), txt_ip.getText()+".64", txt_ip.getText()+".65 / "+txt_ip.getText()+".78", txt_ip.getText()+".79"},
                    {new Integer(5), txt_ip.getText()+".80", txt_ip.getText()+".81 / "+txt_ip.getText()+".94", txt_ip.getText()+".95"},
                    {new Integer(6), txt_ip.getText()+".96", txt_ip.getText()+".97 / "+txt_ip.getText()+".110", txt_ip.getText()+".111"},
                    {new Integer(7), txt_ip.getText()+".112", txt_ip.getText()+".113 / "+txt_ip.getText()+".126", txt_ip.getText()+".127"},
                    {new Integer(8), txt_ip.getText()+".128", txt_ip.getText()+".129 / "+txt_ip.getText()+".142", txt_ip.getText()+".143"},
                    {new Integer(9), txt_ip.getText()+".144", txt_ip.getText()+".145 / "+txt_ip.getText()+".158", txt_ip.getText()+".159"},
                    {new Integer(10), txt_ip.getText()+".160", txt_ip.getText()+".161 / "+txt_ip.getText()+".174", txt_ip.getText()+".175"},
                    {new Integer(11), txt_ip.getText()+".176", txt_ip.getText()+".177 / "+txt_ip.getText()+".190", txt_ip.getText()+".191"},
                    {new Integer(12), txt_ip.getText()+".192", txt_ip.getText()+".193 / "+txt_ip.getText()+".206", txt_ip.getText()+".207"},
                    {new Integer(13), txt_ip.getText()+".208", txt_ip.getText()+".209 / "+txt_ip.getText()+".222", txt_ip.getText()+".223"},
                    {new Integer(14), txt_ip.getText()+".224", txt_ip.getText()+".225 / "+txt_ip.getText()+".238", txt_ip.getText()+".239"},
                    {new Integer(15), txt_ip.getText()+".240", txt_ip.getText()+".241 / "+txt_ip.getText()+".254", txt_ip.getText()+".255"},
                };
                model = new DefaultTableModel(data, titulos);
                jlbl_mascara.setText("255.255.255.240");
                jlbl_panel.setText("Subred Cargada (/28)");
            } else if (jcbx_bits.getSelectedItem().equals("/29")) {
                Object[][] data = {
                    {new Integer(0), txt_ip.getText()+".0",txt_ip.getText()+".1 / "+txt_ip.getText()+".6", txt_ip.getText()+".7"},
                    {new Integer(1), txt_ip.getText()+".8", txt_ip.getText()+".9 / "+txt_ip.getText()+".14", txt_ip.getText()+".15"},
                    {new Integer(2), txt_ip.getText()+".16", txt_ip.getText()+".17 / "+txt_ip.getText()+".22", txt_ip.getText()+".23"},
                    {new Integer(3), txt_ip.getText()+".24", txt_ip.getText()+".25 / "+txt_ip.getText()+".30", txt_ip.getText()+".31"},
                    {new Integer(4), txt_ip.getText()+".32", txt_ip.getText()+".33 / "+txt_ip.getText()+".38", txt_ip.getText()+".39"},
                    {new Integer(5), txt_ip.getText()+".40", txt_ip.getText()+".41 / "+txt_ip.getText()+".46", txt_ip.getText()+".47"},
                    {new Integer(6), txt_ip.getText()+".48", txt_ip.getText()+".49 / "+txt_ip.getText()+".54", txt_ip.getText()+".55"},
                    {new Integer(7), txt_ip.getText()+".56", txt_ip.getText()+".57 / "+txt_ip.getText()+".62", txt_ip.getText()+".63"},
                    {new Integer(8), txt_ip.getText()+".64", txt_ip.getText()+".65 / "+txt_ip.getText()+".70", txt_ip.getText()+".71"},
                    {new Integer(9), txt_ip.getText()+".72", txt_ip.getText()+".73 / "+txt_ip.getText()+".78", txt_ip.getText()+".79"},
                    {new Integer(10), txt_ip.getText()+".80", txt_ip.getText()+".81 / "+txt_ip.getText()+".86", txt_ip.getText()+".87"},
                    {new Integer(11), txt_ip.getText()+".88", txt_ip.getText()+".89 / "+txt_ip.getText()+".94", txt_ip.getText()+".95"},
                    {new Integer(12), txt_ip.getText()+".96", txt_ip.getText()+".97 / "+txt_ip.getText()+".102", txt_ip.getText()+".103"},
                    {new Integer(13), txt_ip.getText()+".104", txt_ip.getText()+".105 / "+txt_ip.getText()+".110", txt_ip.getText()+".111"},
                    {new Integer(14), txt_ip.getText()+".112", txt_ip.getText()+".113 / "+txt_ip.getText()+".118", txt_ip.getText()+".119"},
                    {new Integer(15), txt_ip.getText()+".120", txt_ip.getText()+".121 / "+txt_ip.getText()+".126", txt_ip.getText()+".127"},
                    {new Integer(16), txt_ip.getText()+".128", txt_ip.getText()+".129 / "+txt_ip.getText()+".134", txt_ip.getText()+".135"},
                    {new Integer(17), txt_ip.getText()+".136", txt_ip.getText()+".137 / "+txt_ip.getText()+".142", txt_ip.getText()+".143"},
                    {new Integer(18), txt_ip.getText()+".144", txt_ip.getText()+".145 / "+txt_ip.getText()+".150", txt_ip.getText()+".151"},
                    {new Integer(19), txt_ip.getText()+".152", txt_ip.getText()+".153 / "+txt_ip.getText()+".158", txt_ip.getText()+".159"},
                    {new Integer(20), txt_ip.getText()+".160", txt_ip.getText()+".161 / "+txt_ip.getText()+".166", txt_ip.getText()+".167"},
                    {new Integer(21), txt_ip.getText()+".168", txt_ip.getText()+".169 / "+txt_ip.getText()+".174", txt_ip.getText()+".175"},
                    {new Integer(22), txt_ip.getText()+".176", txt_ip.getText()+".177 / "+txt_ip.getText()+".182", txt_ip.getText()+".183"},
                    {new Integer(23), txt_ip.getText()+".184", txt_ip.getText()+".185 / "+txt_ip.getText()+".190", txt_ip.getText()+".191"},
                    {new Integer(24), txt_ip.getText()+".192", txt_ip.getText()+".193 / "+txt_ip.getText()+".198", txt_ip.getText()+".199"},
                    {new Integer(25), txt_ip.getText()+".200", txt_ip.getText()+".201 / "+txt_ip.getText()+".206", txt_ip.getText()+".207"},
                    {new Integer(26), txt_ip.getText()+".208", txt_ip.getText()+".209 / "+txt_ip.getText()+".214", txt_ip.getText()+".215"},
                    {new Integer(27), txt_ip.getText()+".216", txt_ip.getText()+".217 / "+txt_ip.getText()+".222", txt_ip.getText()+".223"},
                    {new Integer(28), txt_ip.getText()+".224", txt_ip.getText()+".225 / "+txt_ip.getText()+".230", txt_ip.getText()+".231"},
                    {new Integer(29), txt_ip.getText()+".232", txt_ip.getText()+".233 / "+txt_ip.getText()+".238", txt_ip.getText()+".239"},
                    {new Integer(30), txt_ip.getText()+".240", txt_ip.getText()+".241 / "+txt_ip.getText()+".246", txt_ip.getText()+".247"},
                    {new Integer(31), txt_ip.getText()+".248", txt_ip.getText()+".249 / "+txt_ip.getText()+".254", txt_ip.getText()+".255"},
                    
                };
                model = new DefaultTableModel(data, titulos);
                jlbl_mascara.setText("255.255.255.248");
                jlbl_panel.setText("Subred Cargada (/29)");
            }
            jtbl_subredes.setModel(model);
        }catch (Exception e) {
            e.printStackTrace();
        }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_ip = new javax.swing.JTextField();
        btn_calcular = new javax.swing.JButton();
        jcbx_bits = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbl_subredes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jlbl_mascara = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        jlbl_panel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Desarrollado por Varto");
        setBackground(java.awt.SystemColor.activeCaption);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Controles"));

        txt_ip.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        btn_calcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imganes/subred.png"))); // NOI18N
        btn_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcularActionPerformed(evt);
            }
        });

        jcbx_bits.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcbx_bits.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "/25", "/26", "/27", "/28", "/29" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(txt_ip, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jcbx_bits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                .addComponent(btn_calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_calcular, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ip, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbx_bits, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtbl_subredes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtbl_subredes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Subred", "Dirección de Subred", "Rango IP Valida", "Dirección Broadcast"
            }
        ));
        jScrollPane1.setViewportView(jtbl_subredes);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Mascara de Subred:");

        jlbl_mascara.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlbl_mascara.setForeground(new java.awt.Color(0, 0, 153));

        jToolBar1.setRollover(true);

        jlbl_panel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlbl_panel.setForeground(new java.awt.Color(0, 0, 153));
        jToolBar1.add(jlbl_panel);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("CALCULADORA DE SUBRED IPV-4");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imganes/logo1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jlbl_mascara, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jlbl_mascara, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 31, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcularActionPerformed
        // TODO add your handling code here:
        llenar_subredes();
    }//GEN-LAST:event_btn_calcularActionPerformed

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
            java.util.logging.Logger.getLogger(calculadora_ip1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculadora_ip1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculadora_ip1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculadora_ip1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                JDialog.setDefaultLookAndFeelDecorated(true);
                SubstanceLookAndFeel.setSkin(new BusinessBlueSteelSkin());
                new calculadora_ip1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_calcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JComboBox<String> jcbx_bits;
    private javax.swing.JLabel jlbl_mascara;
    private javax.swing.JLabel jlbl_panel;
    private javax.swing.JTable jtbl_subredes;
    private javax.swing.JTextField txt_ip;
    // End of variables declaration//GEN-END:variables
}
