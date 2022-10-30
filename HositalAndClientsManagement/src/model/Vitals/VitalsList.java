/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Vitals;

import java.util.ArrayList;

/**
 *
 * @author nikhilbindal
 */
public class VitalsList {
    private ArrayList<Vitals> history;
    
    public VitalsList() {
        this.history = new ArrayList<Vitals>();  
    }

    public ArrayList<Vitals> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Vitals> history) {
        this.history = history;
    }
    
    public Vitals addNewVitals() {
        Vitals newVitals = new Vitals();
        history.add(newVitals);
        return newVitals;
    }
    
    public void deleteVitals(Vitals vs) {
        history.remove(vs);
    }
}
