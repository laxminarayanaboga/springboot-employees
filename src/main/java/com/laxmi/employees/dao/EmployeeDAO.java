package com.laxmi.employees.dao;

import com.laxmi.employees.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    void save(Employee employee);

    List<Employee> findAll();
}
