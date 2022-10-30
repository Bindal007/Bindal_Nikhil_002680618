/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.City;

import java.util.ArrayList;

/**
 *
 * @author nikhilbindal
 */
public class HouseList {
    private ArrayList<House> houseList;

    public HouseList() {
        this.houseList = new ArrayList<House>();
    }

    public ArrayList<House> getHouseList() {
        return houseList;
    }

    public void setHouseList(ArrayList<House> houseList) {
        this.houseList = houseList;
    }
    
    
}
