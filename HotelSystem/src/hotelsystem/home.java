/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelsystem;

import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class home extends javax.swing.JFrame {
    
    public int a=0;
    

    public home() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.activeTitleBackground"));
        jButton1.setFont(new java.awt.Font("Sylfaen", 0, 13)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotelsystem/rsz_688843_arrows_512x512.png"))); // NOI18N
        jButton1.setText("Convert Layout");
        jButton1.setMaximumSize(new java.awt.Dimension(10, 10));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 32, -1, 95));

        b1.setBackground(new java.awt.Color(255, 255, 255));
        b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotelsystem/patient-info-icon.png"))); // NOI18N
        b1.setText("Add New Patient Information");
        b1.setPreferredSize(new java.awt.Dimension(260, 70));
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 159, 261, -1));

        b2.setBackground(new java.awt.Color(255, 255, 255));
        b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotelsystem/diagnosis-icon.png"))); // NOI18N
        b2.setText("Add Diagnosis Information");
        b2.setPreferredSize(new java.awt.Dimension(260, 70));
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 242, 261, 69));

        b3.setBackground(new java.awt.Color(255, 255, 255));
        b3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotelsystem/patient-history-icon.png"))); // NOI18N
        b3.setText("Entire Patient History");
        b3.setPreferredSize(new java.awt.Dimension(260, 70));
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 324, 261, -1));

        b4.setBackground(new java.awt.Color(255, 255, 255));
        b4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotelsystem/update-patient-icon.png"))); // NOI18N
        b4.setText("Update Patient Information");
        b4.setPreferredSize(new java.awt.Dimension(260, 70));
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        getContentPane().add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 412, 261, -1));

        b5.setBackground(new java.awt.Color(255, 255, 255));
        b5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotelsystem/hospital-info-icon.png"))); // NOI18N
        b5.setText("Hospital Information");
        b5.setPreferredSize(new java.awt.Dimension(260, 70));
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        getContentPane().add(b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 505, 261, -1));

        b6.setBackground(new java.awt.Color(255, 255, 255));
        b6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotelsystem/logout-icon.png"))); // NOI18N
        b6.setText("Logout");
        b6.setPreferredSize(new java.awt.Dimension(260, 70));
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        getContentPane().add(b6, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 593, 261, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 25, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotelsystem/hospital-bg.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1850, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (a==0){
            b1.setLocation(220,30);
            b2.setLocation(480,30);
            b3.setLocation(740,30);
            b4.setLocation(1000,30);
            b5.setLocation(1260,30);
            b6.setLocation(1520,30);
            a=1;
        }
        else{
            b1.setLocation(10,200);
            b2.setLocation(10,275);
            b3.setLocation(10,350);
            b4.setLocation(10,425);
            b5.setLocation(10,500);
            b6.setLocation(10,575);
                a=0;
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        new fullHistoryofthePatient().setVisible(true);
    }//GEN-LAST:event_b3ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        int var = JOptionPane.showConfirmDialog(null, "Confirm logout?", "Select", JOptionPane.YES_NO_OPTION);
        if(var==0){
            setVisible(false);
            new loginform().setVisible(true);
        }
        
        
        
        
    }//GEN-LAST:event_b6ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
        //setVisible(false);
        new newpatientinformation().setVisible(true);
        
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed

        new addDiagnosisInformation().setVisible(true);
        
    }//GEN-LAST:event_b2ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        new updatePatientInformation().setVisible(true);
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        new hospitalInformation().setVisible(true);
    }//GEN-LAST:event_b5ActionPerformed

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
