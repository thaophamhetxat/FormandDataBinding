package Servicec;

import models.Employee;

import java.util.ArrayList;

public class EmployeeService {
    public ArrayList<Employee> list = new ArrayList<>();
    public EmployeeService(){
        list.add(new Employee("1","nhan","1234567"));
    }
    public void save (Employee employee){
        list.add(employee);
    }
}
