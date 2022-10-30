/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.City;

/**
 *
 * @author nikhilbindal
 */
public class Community {
    private String name;
    private long zipcode;
    private int numberOfHouses;
    private City city;

    public Community(String name, long zipcode, int numberOfHouses) {
        this.name = name;
        this.zipcode = zipcode;
        this.numberOfHouses = numberOfHouses;
    }

    Community() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getZipcode() {
        return zipcode;
    }

    public void setZipcode(long zipcode) {
        this.zipcode = zipcode;
    }

    public int getNumberOfHouses() {
        return numberOfHouses;
    }

    public void setNumberOfHouses(int numberOfHouses) {
        this.numberOfHouses = numberOfHouses;
    }

    public Community(String name, long zipcode, int numberOfHouses, City city) {
        this.name = name;
        this.zipcode = zipcode;
        this.numberOfHouses = numberOfHouses;
        this.city = city;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
    
    
}
