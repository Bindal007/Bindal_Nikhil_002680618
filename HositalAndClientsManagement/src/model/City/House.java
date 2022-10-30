/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.City;

/**
 *
 * @author nikhilbindal
 */
public class House {
    private int houseNo;
    private int houseMembers;
    private Community community;
    private City city;

    public House(int houseNo, int houseMembers, Community community, City city) {
        this.houseNo = houseNo;
        this.houseMembers = houseMembers;
        this.community = community;
        this.city = city;
    }

    public int getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    public int getHouseMembers() {
        return houseMembers;
    }

    public void setHouseMembers(int houseMembers) {
        this.houseMembers = houseMembers;
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
    
    
}
