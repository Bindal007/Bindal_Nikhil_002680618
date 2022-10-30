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
public class PersonList {
    private ArrayList<Person> personList;

    public PersonList() {
        this.personList = new ArrayList<Person>();
    }
    
    public Person addPerson() {
        Person person = new Person();
        personList.add(person);
        return person;
    }
    
    public ArrayList<Person> getPersonList() {
        return personList;
    }
    
    public void deletePerson(Person person) {
        personList.remove(person);
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
    
    public int getTotalPersonsCount() {
        return this.personList.size();
    }
}
