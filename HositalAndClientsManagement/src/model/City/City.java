/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.City;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author nikhilbindal
 */
public class City {
    private String cityName;
    private ArrayList<String> cityList;

    public City(String cityName, ArrayList<String> cityList) {
        this.cityName = cityName;
        this.cityList = new ArrayList<String>();
    }

    public City() {
        this.cityList = new ArrayList<String>();
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public ArrayList<String> getCityList() {
        return cityList;
    }

    public void setCityList(ArrayList<String> cityList) {
        this.cityList = cityList;
    }
    
    public void addCityName(String cityName) {
        if(this.cityList.contains(cityName)) {
            JOptionPane.showMessageDialog(null, "This City already exists");
            return;
        }
        this.cityList.add(cityName);
    }
    
}
