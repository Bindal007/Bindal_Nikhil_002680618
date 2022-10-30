/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Users;

import java.util.ArrayList;

/**
 *
 * @author nikhilbindal
 */
public class PatientList {
    private ArrayList<Patient> patientsList;

    public ArrayList<Patient> getPatientsList() {
        return patientsList;
    }

    public void setPatientsList(ArrayList<Patient> patientsList) {
        this.patientsList = patientsList;
    }
    
    public PatientList() {
        this.patientsList = new ArrayList<Patient>();
    }
    
    public Patient addPatient() {
        Patient patient = new Patient();
        patientsList.add(patient);
        return patient;
    }
    
    public ArrayList<Patient> getPatientList() {
        return patientsList;
    }
    
    public void deletePerson(Patient patient) {
        patientsList.remove(patient);
    }

    public void setPersonList(ArrayList<Patient> patientsList) {
        this.patientsList = patientsList;
    }
    
    public int getTotalPatientsCount() {
        return this.patientsList.size();
    }
}
