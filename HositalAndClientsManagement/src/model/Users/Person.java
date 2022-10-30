/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Users;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author nikhilbindal
 */
public class Person {
    private String fname;
    private String lname;
    private int age;
    private String gender;
//    private JDateChooser dateOfBirth;
    private String dob;
    private long ssn;
    private boolean isDoctor;
    private boolean isPatient;
    private String username;
    private String password;
    private ContactDetails contactDetails;
    
    public String getFname() {
        return fname;
}

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

//    public JDateChooser getDateOfBirth() {
//        return dateOfBirth;
//    }
//
//    public void setDateOfBirth(JDateChooser dateOfBirth) {
//        this.dateOfBirth = dateOfBirth;
//    }

    public long getSsn() {
        return ssn;
    }

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }
    
//    public String dateOfBirthString(JDateChooser date) {
//        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
//        String formattedDate = sdf.format(date.getDate());
//        return formattedDate;
//    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public boolean isIsDoctor() {
        return isDoctor;
    }

    public void setIsDoctor(boolean isDoctor) {
        this.isDoctor = isDoctor;
    }

    public boolean isIsPatient() {
        return isPatient;
    }

    public void setIsPatient(boolean isPatient) {
        this.isPatient = isPatient;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
    }
    
}
