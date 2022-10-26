/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author nikhilbindal
 */
public class EmployeeList {
    private ArrayList<Employee> employees;

    public EmployeeList() {
        this.employees = new ArrayList<Employee>();
    }
    
    public Employee addNewEmployees() {
        Employee newEmployee = new Employee();
        employees.add(newEmployee);
        return newEmployee;
    }
    
    public void deleteEmployee(Employee employee) {
        employees.remove(employee);
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }
    
    public int getTotalEmployeesCount() {
        return this.employees.size();
    }
    
    public int getActiveEmployeesCount() {
        int activeEmployees = 0;
        for(Employee emp : this.employees) {
            if(emp.isStatus()) {
                activeEmployees += 1;
            }
        }
        return activeEmployees;
    }
    
    public int getInActiveEmployeesCount() {
        return getTotalEmployeesCount() - getActiveEmployeesCount();
    }
}
