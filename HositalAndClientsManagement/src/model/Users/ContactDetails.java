/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Users;

import model.City.Address;

/**
 *
 * @author nikhilbindal
 */
public class ContactDetails {

    private long phoneNumber;
    private Address address;
    

    public ContactDetails(long phoneNumber, Address address) {
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
    
    

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
