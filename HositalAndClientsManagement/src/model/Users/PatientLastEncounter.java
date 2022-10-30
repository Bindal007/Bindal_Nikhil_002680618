/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Users;

import java.util.Date;
import model.Hospital.Hospital;
import model.Vitals.Vitals;

/**
 *
 * @author nikhilbindal
 */
public class PatientLastEncounter {
    private Date date;
    private Doctor doctor;
    private Hospital hospital;
    private Vitals vitalSigns;
    private Patient patient;

    
    
    public PatientLastEncounter(Date date, Doctor doctor, Hospital hospital, Patient patient) {
        this.date = date;
        this.doctor = doctor;
        this.hospital = hospital;
        this.patient = patient;
    }
    
    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public Vitals getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(Vitals vitalSigns) {
        this.vitalSigns = vitalSigns;
    }
}
