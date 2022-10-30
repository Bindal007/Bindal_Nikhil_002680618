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
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    City city;
    CommunityList communityList;
    HouseList houseList;
    public Dashboard(City city, CommunityList communityList,HouseList houseList) {
        initComponents();
        this.city = city;
        this.communityList = communityList;
        this.houseList = houseList;
    }

    private Dashboard() {
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

        cityPanel = new javax.swing.JPanel();
        cityWorkPanel = new javax.swing.JPanel();
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
        jPanel3 = new javax.swing.JPanel();
        lblAddUpdateCommunity1 = new javax.swing.JLabel();
        txtCityName = new javax.swing.JTextField();
        lblAddUpdateCommunity2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtHouseNo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        comboCommunity = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        comboCity = new javax.swing.JComboBox<>();
        btnSaveCity = new javax.swing.JButton();
        btnSaveHouse = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        dashboardPanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        lblWelcome = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        cityTabPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        userTabPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        hospitalTabPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblHospitalMAnagement = new javax.swing.JLabel();
        lblUserManagement = new javax.swing.JLabel();
        lblCityManagement = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cityWorkPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        cityWorkPanel.add(txtCitySearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 734, 35));

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

        cityWorkPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 53, 734, 183));

        btnEdit.setText("Edit");
        cityWorkPanel.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(746, 53, 154, -1));

        btnDelete.setText("Delete");
        cityWorkPanel.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(746, 88, 154, -1));

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

        cityWorkPanel.add(communityAddPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 484, 238));

        lblAddUpdateCommunity1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblAddUpdateCommunity1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddUpdateCommunity1.setText("Add City");

        lblAddUpdateCommunity2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblAddUpdateCommunity2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddUpdateCommunity2.setText("Add House");

        jLabel1.setText("House No.:");

        jLabel5.setText("Community:");

        jLabel6.setText("City:");

        btnSaveCity.setBackground(new java.awt.Color(102, 102, 255));
        btnSaveCity.setForeground(new java.awt.Color(255, 255, 255));
        btnSaveCity.setText("Save");
        btnSaveCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveCityActionPerformed(evt);
            }
        });

        btnSaveHouse.setBackground(new java.awt.Color(102, 102, 255));
        btnSaveHouse.setForeground(new java.awt.Color(255, 255, 255));
        btnSaveHouse.setText("Save");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtCityName, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSaveCity, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtHouseNo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblAddUpdateCommunity1)
                            .addComponent(lblAddUpdateCommunity2)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(66, 66, 66)
                                .addComponent(jLabel5)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(comboCity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(btnSaveHouse, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 125, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAddUpdateCommunity1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSaveCity, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblAddUpdateCommunity2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHouseNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(btnSaveHouse, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        cityWorkPanel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 390, -1));

        backBtn.setText("Back");

        jLabel7.setText("City Management");

        javax.swing.GroupLayout cityPanelLayout = new javax.swing.GroupLayout(cityPanel);
        cityPanel.setLayout(cityPanelLayout);
        cityPanelLayout.setHorizontalGroup(
            cityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cityPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 252, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addContainerGap())
            .addGroup(cityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cityPanelLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cityWorkPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 906, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        cityPanelLayout.setVerticalGroup(
            cityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cityPanelLayout.createSequentialGroup()
                .addGroup(cityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cityPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cityPanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(553, Short.MAX_VALUE))
            .addGroup(cityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cityPanelLayout.createSequentialGroup()
                    .addGap(0, 57, Short.MAX_VALUE)
                    .addComponent(cityWorkPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        lblWelcome.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblWelcome.setText("Welcome, System Administrator!");

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
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 805, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWelcome))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        cityTabPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cityTabPanelMouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Admin_Icon_125px.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout cityTabPanelLayout = new javax.swing.GroupLayout(cityTabPanel);
        cityTabPanel.setLayout(cityTabPanelLayout);
        cityTabPanelLayout.setHorizontalGroup(
            cityTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cityTabPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        cityTabPanelLayout.setVerticalGroup(
            cityTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cityTabPanelLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Admin_Icon_125px.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout userTabPanelLayout = new javax.swing.GroupLayout(userTabPanel);
        userTabPanel.setLayout(userTabPanelLayout);
        userTabPanelLayout.setHorizontalGroup(
            userTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userTabPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        userTabPanelLayout.setVerticalGroup(
            userTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userTabPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Admin_Icon_125px.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout hospitalTabPanelLayout = new javax.swing.GroupLayout(hospitalTabPanel);
        hospitalTabPanel.setLayout(hospitalTabPanelLayout);
        hospitalTabPanelLayout.setHorizontalGroup(
            hospitalTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hospitalTabPanelLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        hospitalTabPanelLayout.setVerticalGroup(
            hospitalTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hospitalTabPanelLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        lblHospitalMAnagement.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblHospitalMAnagement.setText("Hospital Management");

        lblUserManagement.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblUserManagement.setText("User Management");

        lblCityManagement.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblCityManagement.setText("City Management");

        javax.swing.GroupLayout dashboardPanelLayout = new javax.swing.GroupLayout(dashboardPanel);
        dashboardPanel.setLayout(dashboardPanelLayout);
        dashboardPanelLayout.setHorizontalGroup(
            dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(dashboardPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(userTabPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(cityTabPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(hospitalTabPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(dashboardPanelLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(lblUserManagement)
                .addGap(67, 67, 67)
                .addComponent(lblCityManagement)
                .addGap(62, 62, 62)
                .addComponent(lblHospitalMAnagement))
        );
        dashboardPanelLayout.setVerticalGroup(
            dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardPanelLayout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addGroup(dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userTabPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dashboardPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cityTabPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hospitalTabPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUserManagement)
                    .addComponent(lblCityManagement)
                    .addComponent(lblHospitalMAnagement))
                .addContainerGap(286, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashboardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(cityPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(235, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashboardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(cityPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(68, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        UserPanel userPanel = new UserPanel();
        userPanel.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void cityTabPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cityTabPanelMouseClicked
        // TODO add your handling code here:
          cityPanel.setVisible(true);
          dashboardPanel.setVisible(false);          
    }//GEN-LAST:event_cityTabPanelMouseClicked

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnSaveCity;
    private javax.swing.JButton btnSaveCommunity;
    private javax.swing.JButton btnSaveHouse;
    private javax.swing.JPanel cityPanel;
    private javax.swing.JPanel cityTabPanel;
    private javax.swing.JPanel cityWorkPanel;
    private javax.swing.JComboBox<String> comboCity;
    private javax.swing.JComboBox<String> comboCommunity;
    private javax.swing.JPanel communityAddPanel;
    private javax.swing.JComboBox<String> communityCityDropdown;
    private javax.swing.JPanel dashboardPanel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JPanel hospitalTabPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddUpdateCommunity;
    private javax.swing.JLabel lblAddUpdateCommunity1;
    private javax.swing.JLabel lblAddUpdateCommunity2;
    private javax.swing.JLabel lblCityManagement;
    private javax.swing.JLabel lblCommunityCity;
    private javax.swing.JLabel lblCommunityName;
    private javax.swing.JLabel lblCommunityZip;
    private javax.swing.JLabel lblHospitalMAnagement;
    private javax.swing.JLabel lblUserManagement;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JTable tblCityView;
    private javax.swing.JTextField txtCityName;
    private javax.swing.JTextField txtCitySearch;
    private javax.swing.JTextField txtCommunityName;
    private javax.swing.JTextField txtCommunityZipCode;
    private javax.swing.JTextField txtHouseNo;
    private javax.swing.JPanel userTabPanel;
    // End of variables declaration//GEN-END:variables
}