package com.laxmi.employees.rest;

import com.laxmi.employees.dao.EmployeeDAO;
import com.laxmi.employees.entity.Employee;
import com.laxmi.employees.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;

    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return employeeService.findAll();
    }

    @GetMapping("/employees/{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId) {
        Employee employee = employeeService.findById(employeeId);
        if (employee == null) {
            throw new RuntimeException("Employee id not found - " + employeeId);
        }
        return employee;
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee) {
        // Overrding the id in request body to 0. Id is configured as Auto Increment at db layer.
        employee.setId(0);
        Employee newEmployee = employeeService.save(employee);
        return newEmployee;
    }

}
