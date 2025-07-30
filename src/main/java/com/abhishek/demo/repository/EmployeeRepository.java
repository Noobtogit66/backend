package com.abhishek.demo.repository;

import com.abhishek.demo.model.Employee;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class EmployeeRepository {


    List<Employee> employees = new ArrayList<>();
    EmployeeRepository (){
        Employee employee = new Employee("1","Abhi","1@gmail.com");
        Employee employeeOne = new Employee("2","Sagnik","2@gmail.com");
        Employee employeeTwo = new Employee("3","Rahul","3@gmail.com");
        employees.add(employee);
        employees.add(employeeOne);
        employees.add(employeeTwo);

    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public Employee getEmployee(String id) {
        for (int i = 0;i < employees.size();i++) {
            if (employees.get(i).getId().equals(id)) {
                return employees.get(i);
            }
        }
        return new Employee("","","");
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void deleteEmployee(String id) {
        for (int i = 0;i < employees.size();i++) {
            if (employees.get(i).getId().equals(id)) {
                employees.remove(i);
            }
        }
    }



}
