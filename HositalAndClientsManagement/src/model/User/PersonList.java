/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.User;

import java.util.ArrayList;

/**
 *
 * @author nikhilbindal
 */
public class PersonList {
    private ArrayList<Person> personList;

    public PersonList() {
        this.personList = new ArrayList<Person>();
    }
    
    public void addPerson(Person person) {
        personList.add(person);
//        return person;
    }
    
    public ArrayList<Person> getPersonList() {
        return this.personList;
    }
}
