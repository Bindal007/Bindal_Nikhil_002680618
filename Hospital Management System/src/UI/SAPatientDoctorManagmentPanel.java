/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

/**
 *
 * @author nikhilbindal
 */


import Directories.DoctorDirectory;
import Directories.EncounterHistory;
import Directories.HospitalDirectory;
import Directories.PatientDirectory;
import Directories.PersonDirectory;

public class SAPatientDoctorManagmentPanel extends javax.swing.JPanel {

    /**
     * Creates new form SAPatientManagmentPanel
     */
    
      DoctorDirectory doctorDirectory;
    EncounterHistory encounterHistory;
    HospitalDirectory hospitalDirectory;
    PatientDirectory patientDirectory;
    PersonDirectory personDirectory;

    public SAPatientDoctorManagmentPanel(DoctorDirectory doctorDirectory, EncounterHistory encounterHistory, HospitalDirectory hospitalDirectory, PatientDirectory patientDirectory, PersonDirectory personDirectory) {
        initComponents();
        
        this.doctorDirectory = doctorDirectory;
        this.encounterHistory = encounterHistory;
        this.hospitalDirectory = hospitalDirectory;
        this.patientDirectory = patientDirectory;
        this.personDirectory = personDirectory;
    }
    
//    public SAPatientManagmentPanel() {
//        initComponents();
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PatientManagmentSplitpane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        btnCreatePatient = new javax.swing.JButton();
        btnViewPatient = new javax.swing.JButton();
        btnCreateDoctor = new javax.swing.JButton();
        btnViewDoctor = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        btnCreatePatient.setText("Create a patient");
        btnCreatePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreatePatientActionPerformed(evt);
            }
        });

        btnViewPatient.setText("View Patient");
        btnViewPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPatientActionPerformed(evt);
            }
        });

        btnCreateDoctor.setText("Create a doctor");
        btnCreateDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateDoctorActionPerformed(evt);
            }
        });

        btnViewDoctor.setText("View Doctor");
        btnViewDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDoctorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnViewDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnCreateDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnViewPatient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCreatePatient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(btnCreatePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(btnViewPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnCreateDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnViewDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
        );

        PatientManagmentSplitpane.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(153, 255, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 809, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 492, Short.MAX_VALUE)
        );

        PatientManagmentSplitpane.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PatientManagmentSplitpane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PatientManagmentSplitpane)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreatePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreatePatientActionPerformed
       SAPatientManagementWorkArea sAPatientManagementWorkArea =new SAPatientManagementWorkArea(doctorDirectory, encounterHistory, hospitalDirectory, patientDirectory, personDirectory);
       PatientManagmentSplitpane.setRightComponent(sAPatientManagementWorkArea);
        
    }//GEN-LAST:event_btnCreatePatientActionPerformed

    private void btnViewPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPatientActionPerformed
        SAViewPatientPanel sAViewPatientPanel = new SAViewPatientPanel(doctorDirectory, encounterHistory, hospitalDirectory, patientDirectory, personDirectory);
        PatientManagmentSplitpane.setRightComponent(sAViewPatientPanel);
        
        
    }//GEN-LAST:event_btnViewPatientActionPerformed

    private void btnCreateDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateDoctorActionPerformed
        SADoctorManagmentWorkArea sADoctorManagmentWorkArea =new SADoctorManagmentWorkArea(doctorDirectory, encounterHistory, hospitalDirectory, patientDirectory, personDirectory);
        PatientManagmentSplitpane.setRightComponent(sADoctorManagmentWorkArea);
       
    }//GEN-LAST:event_btnCreateDoctorActionPerformed

    private void btnViewDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDoctorActionPerformed
        SAViewDoctorPanel sAViewDoctorPanel = new SAViewDoctorPanel(doctorDirectory, encounterHistory, hospitalDirectory, patientDirectory, personDirectory);
        PatientManagmentSplitpane.setRightComponent(sAViewDoctorPanel);
    }//GEN-LAST:event_btnViewDoctorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSplitPane PatientManagmentSplitpane;
    private javax.swing.JButton btnCreateDoctor;
    private javax.swing.JButton btnCreatePatient;
    private javax.swing.JButton btnViewDoctor;
    private javax.swing.JButton btnViewPatient;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
