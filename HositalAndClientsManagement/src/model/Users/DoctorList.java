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
public class DoctorList {
    private ArrayList<Doctor> doctors;

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(ArrayList<Doctor> doctors) {
        this.doctors = doctors;
    }
    
    public Doctor addDoctor() {
        Doctor doctor = new Doctor();
        doctors.add(doctor);
        return doctor;
    }
    
    public void deleteDoctor(Doctor doctor) {
        doctors.remove(doctor);
    }
}
