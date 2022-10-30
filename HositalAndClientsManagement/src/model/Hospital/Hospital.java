/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Hospital;

import java.util.ArrayList;
import model.City.City;
import model.City.Community;
import model.Users.Doctor;
import model.Users.Patient;

/**
 *
 * @author nikhilbindal
 */
public class Hospital {
    private String hospitalName;
    private Community community;
    private City city;
    private ArrayList<Doctor> doctorsList;
    private ArrayList<Patient> patientList;
    private String about;

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public ArrayList<Doctor> getDoctorsList() {
        return doctorsList;
    }

    public void setDoctorsList(ArrayList<Doctor> doctorsList) {
        this.doctorsList = doctorsList;
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
    
    
}
