package com.howtodoinjava.example.employee.controller;

import com.howtodoinjava.example.employee.beans.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeServiceController {

    // TODO create some employee

    @RequestMapping(value = "/findEmployeeDetails/{employeeId}", method = RequestMethod.GET)
    public Employee getEmployeeDetails(@PathVariable int employeeId) {
        System.out.println("Getting Employee details for " + employeeId);


        // TODO create get method to find employee by id


        return null;
    }

}
