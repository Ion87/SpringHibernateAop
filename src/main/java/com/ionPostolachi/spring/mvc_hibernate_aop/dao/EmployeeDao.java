package com.ionPostolachi.spring.mvc_hibernate_aop.dao;

import com.ionPostolachi.spring.mvc_hibernate_aop.entity.Employee;

import java.util.List;

public interface EmployeeDao {
    List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    Employee getEmployee(int id);

    void deleteEmployee(int id);
}
