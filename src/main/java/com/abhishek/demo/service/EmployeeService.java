package com.abhishek.demo.service;


import com.abhishek.demo.model.Employee;
import com.abhishek.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {


    @Autowired
    EmployeeRepository employeeRepository;



    public List<Employee> getEmployees(){
        return employeeRepository.getEmployees();
    }


    public Employee getEmployee(String id) {
        return  employeeRepository.getEmployee(id);
    }


    public void addEmployee(Employee employee) {
        employeeRepository.addEmployee(employee);
    }

    public void deleteEmployee(String id){
        employeeRepository.deleteEmployee(id);
    }



}
