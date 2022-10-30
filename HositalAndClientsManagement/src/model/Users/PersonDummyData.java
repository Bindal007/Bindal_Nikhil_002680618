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
public class PersonDummyData {
    private ArrayList<Person> personList;
    public PersonDummyData() {
        this.personList = new ArrayList<Person>();
    }
    public void createPerson(String fn, String ln, long ssn, String uname, String pass) {
        Person person = new Person();
        person.setFname(fn);
        person.setLname(ln);
        person.setSsn(ssn);
        person.setUsername(uname);
        person.setPassword(pass);
        personList.add(person);
    }    
}
