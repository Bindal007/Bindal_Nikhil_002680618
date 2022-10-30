/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import java.util.ArrayList;
import model.City.City;
import model.City.Community;
import model.City.CommunityList;
import model.City.HouseList;

/**
 *
 * @author nikhilbindal
 */
public class CityAdminDashboard extends javax.swing.JFrame {

    /**
     * Creates new form CityAdminDashboard
     */
    City city;
    CommunityList communityList;
    HouseList houseList;
    public CityAdminDashboard(City city, CommunityList communityList,HouseList houseList) {
        initComponents();
        this.city = city;
        this.communityList = communityList;
        this.houseList = houseList;
        
    }

    private CityAdminDashboard() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerPanel = new javax.swing.JPanel();
        lblWelcome = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        cityPanel = new javax.swing.JPanel();
        txtCitySearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCityView = new javax.swing.JTable();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        communityAddPanel = new javax.swing.JPanel();
        lblAddUpdateCommunity = new javax.swing.JLabel();
        lblCommunityName = new javax.swing.JLabel();
        txtCommunityName = new javax.swing.JTextField();
        lblCommunityZip = new javax.swing.JLabel();
        txtCommunityZipCode = new javax.swing.JTextField();
        lblCommunityCity = new javax.swing.JLabel();
        communityCityDropdown = new javax.swing.JComboBox<>();
        btnSaveCommunity = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblAddUpdateCommunity1 = new javax.swing.JLabel();
        txtCityName = new javax.swing.JTextField();
        lblAddUpdateCommunity2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        btnSaveCity = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblWelcome.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblWelcome.setText("Welcome, City Administrator!");

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 805, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblWelcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        cityPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        cityPanel.add(txtCitySearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 734, 35));

        tblCityView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Community", "City", "Zipcode", "No. of Houses"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCityView);

        cityPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 53, 734, 183));

        btnEdit.setText("Edit");
        cityPanel.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 50, 154, -1));

        btnDelete.setText("Delete");
        cityPanel.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 90, 154, -1));

        lblAddUpdateCommunity.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblAddUpdateCommunity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddUpdateCommunity.setText("Add/Update Community");

        lblCommunityName.setText("Name:");

        lblCommunityZip.setText("Zipcode:");

        lblCommunityCity.setText("City:");

        communityCityDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                communityCityDropdownActionPerformed(evt);
            }
        });

        btnSaveCommunity.setBackground(new java.awt.Color(102, 102, 255));
        btnSaveCommunity.setForeground(new java.awt.Color(255, 255, 255));
        btnSaveCommunity.setText("Save");
        btnSaveCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveCommunityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout communityAddPanelLayout = new javax.swing.GroupLayout(communityAddPanel);
        communityAddPanel.setLayout(communityAddPanelLayout);
        communityAddPanelLayout.setHorizontalGroup(
            communityAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(communityAddPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(communityAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAddUpdateCommunity)
                    .addGroup(communityAddPanelLayout.createSequentialGroup()
                        .addGroup(communityAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCommunityName, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCommunityZip)
                            .addComponent(lblCommunityCity))
                        .addGap(44, 44, 44)
                        .addGroup(communityAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSaveCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(communityAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCommunityZipCode, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                                .addComponent(txtCommunityName)
                                .addComponent(communityCityDropdown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        communityAddPanelLayout.setVerticalGroup(
            communityAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(communityAddPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAddUpdateCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(communityAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCommunityName)
                    .addComponent(txtCommunityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(communityAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCommunityZip)
                    .addComponent(txtCommunityZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(communityAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCommunityCity)
                    .addComponent(communityCityDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(btnSaveCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cityPanel.add(communityAddPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 484, 238));

        lblAddUpdateCommunity1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblAddUpdateCommunity1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddUpdateCommunity1.setText("Add City");

        lblAddUpdateCommunity2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblAddUpdateCommunity2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddUpdateCommunity2.setText("Add House");

        jLabel1.setText("House No.:");

        jLabel2.setText("Community:");

        jLabel3.setText("City:");

        btnSaveCity.setBackground(new java.awt.Color(102, 102, 255));
        btnSaveCity.setForeground(new java.awt.Color(255, 255, 255));
        btnSaveCity.setText("Save");
        btnSaveCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveCityActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(102, 102, 255));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Save");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtCityName, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSaveCity, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblAddUpdateCommunity1)
                            .addComponent(lblAddUpdateCommunity2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(66, 66, 66)
                                .addComponent(jLabel2)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 125, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAddUpdateCommunity1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSaveCity, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblAddUpdateCommunity2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        cityPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 390, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(cityPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cityPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void communityCityDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_communityCityDropdownActionPerformed
        // TODO add your handling code here:
        communityCityDropdown.getSelectedItem().toString();
    }//GEN-LAST:event_communityCityDropdownActionPerformed

    private void btnSaveCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveCommunityActionPerformed
        // TODO add your handling code here:
        String communityName = txtCommunityName.getText();
        long communityZip = Long.parseLong(txtCommunityZipCode.getText());
        Community community = communityList.addNewCommunity();
        community.setName(communityName);
        community.setZipcode(communityZip);
        //        selectedCity =
        //        community.setCity();
    }//GEN-LAST:event_btnSaveCommunityActionPerformed

    private void btnSaveCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveCityActionPerformed
        // TODO add your handling code here:
        String cityName = txtCityName.getText();
        city.addCityName(cityName);
        setValuesToCityDropdown();
    }//GEN-LAST:event_btnSaveCityActionPerformed
    
    private void setValuesToCityDropdown() {
        ArrayList<String> cities = city.getCityList();
        for(String city: cities) {
            communityCityDropdown.addItem(city);
        }
    }
    
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
            java.util.logging.Logger.getLogger(CityAdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CityAdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CityAdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CityAdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CityAdminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnSaveCity;
    private javax.swing.JButton btnSaveCommunity;
    private javax.swing.JPanel cityPanel;
    private javax.swing.JPanel communityAddPanel;
    private javax.swing.JComboBox<String> communityCityDropdown;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblAddUpdateCommunity;
    private javax.swing.JLabel lblAddUpdateCommunity1;
    private javax.swing.JLabel lblAddUpdateCommunity2;
    private javax.swing.JLabel lblCommunityCity;
    private javax.swing.JLabel lblCommunityName;
    private javax.swing.JLabel lblCommunityZip;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JTable tblCityView;
    private javax.swing.JTextField txtCityName;
    private javax.swing.JTextField txtCitySearch;
    private javax.swing.JTextField txtCommunityName;
    private javax.swing.JTextField txtCommunityZipCode;
    // End of variables declaration//GEN-END:variables
}
