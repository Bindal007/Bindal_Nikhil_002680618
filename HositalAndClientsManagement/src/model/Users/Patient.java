/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Users;

import java.util.ArrayList;
import model.Hospital.Hospital;

/**
 *
 * @author nikhilbindal
 */
public class Patient extends Person {
    private String illness;
    private String symptoms;
    private long patientId;
    private ArrayList<PatientLastEncounter> encounterList;
    private Hospital hospital;

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public long getPatientId() {
        return patientId;
    }

    public void setPatientId(long patientId) {
        this.patientId = patientId;
    }

    public ArrayList<PatientLastEncounter> getEncounterList() {
        return encounterList;
    }

    public void setEncounterList(ArrayList<PatientLastEncounter> encounterList) {
        this.encounterList = encounterList;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
    
    
    
}
