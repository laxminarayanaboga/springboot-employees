package com.laxmi.employees.dao;

import com.laxmi.employees.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    Employee save(Employee employee);

    Employee findById(int id);

    void deleteById(int id);

    List<Employee> findAll();
}
