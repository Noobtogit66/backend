package com.abhishek.demo.controller;

import com.abhishek.demo.model.Employee;
import com.abhishek.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.service.annotation.DeleteExchange;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {


    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/getEmployees")
    public ResponseEntity<List<Employee>> getEmployees() {

        List<Employee> employees = employeeService.getEmployees();
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(employees);
    }

    @GetMapping("/getEmployee/{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable String id) {

        Employee employee = employeeService.getEmployee(id);
        return ResponseEntity.status(HttpStatus.OK).body(employee);
    }


    @PostMapping("/deleteEmployee/{id}")
    public ResponseEntity<Employee> deleteEmployee(@PathVariable String id) {

        employeeService.deleteEmployee(id);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }

    @PostMapping("/addEmployee")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {

        employeeService.addEmployee(employee);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }


}
