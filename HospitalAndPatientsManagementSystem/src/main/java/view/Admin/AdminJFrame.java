/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View.Admin;

import View.Admin.CommunityAdmin.CommunityAdmin;
import View.Admin.HospitalAdmin.HospitalAdminJFrame;
import View.MainJFrame;
import View.login.LoginView;

/**
 *
 * @author nikhilbindal
 */
public class AdminJFrame extends javax.swing.JFrame {

    /**
     * Creates new form AdminJFrame
     */
    public AdminJFrame() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(102, 255, 204));
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_admin = new javax.swing.JLabel();
        btn_back_main = new javax.swing.JButton();
        btn_system_admin = new javax.swing.JButton();
        btn_community_admin = new javax.swing.JButton();
        btn_hospital_admin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_admin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_admin.setText("Select the type of admin");
        lbl_admin.setFont(new java.awt.Font("Hiragino Maru Gothic ProN", 1, 18)); // NOI18N

        btn_back_main.setText(" Back");
        btn_back_main.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_back_mainActionPerformed(evt);
            }
        });

        btn_system_admin.setText("System Admin");
        btn_system_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_system_adminActionPerformed(evt);
            }
        });

        btn_community_admin.setText("Community Admin");
        btn_community_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_community_adminActionPerformed(evt);
            }
        });

        btn_hospital_admin.setText("Hospital Admin");
        btn_hospital_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hospital_adminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_back_main, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(btn_system_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btn_community_admin)
                        .addGap(44, 44, 44)
                        .addComponent(btn_hospital_admin)
                        .addGap(0, 63, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(lbl_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_back_main, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lbl_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_system_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_community_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_hospital_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(173, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_back_mainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_back_mainActionPerformed
        
        this.setVisible(false);
        new MainJFrame().setVisible(true); // Main Form to show after the Login Form..
    
    }//GEN-LAST:event_btn_back_mainActionPerformed

    private void btn_system_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_system_adminActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new LoginView("system").setVisible(true);
    }//GEN-LAST:event_btn_system_adminActionPerformed

    private void btn_hospital_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hospital_adminActionPerformed
        
        this.dispose();
        new LoginView("hospital").setVisible(true);
        
    }//GEN-LAST:event_btn_hospital_adminActionPerformed

    private void btn_community_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_community_adminActionPerformed
        this.dispose();
        new LoginView("community").setVisible(true);
        
    }//GEN-LAST:event_btn_community_adminActionPerformed

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
            java.util.logging.Logger.getLogger(AdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back_main;
    private javax.swing.JButton btn_community_admin;
    private javax.swing.JButton btn_hospital_admin;
    private javax.swing.JButton btn_system_admin;
    private javax.swing.JLabel lbl_admin;
    // End of variables declaration//GEN-END:variables
}
