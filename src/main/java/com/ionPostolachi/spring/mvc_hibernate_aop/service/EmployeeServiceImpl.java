package com.ionPostolachi.spring.mvc_hibernate_aop.service;

import com.ionPostolachi.spring.mvc_hibernate_aop.dao.EmployeeDao;
import com.ionPostolachi.spring.mvc_hibernate_aop.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeDao employeeDao;

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        List<Employee> employees = employeeDao.getAllEmployees();
        return employees;
    }

    @Override
    @Transactional
    public void saveEmployee(Employee employee) {
        employeeDao.saveEmployee(employee);
    }

    @Override
    @Transactional
    public Employee getEmployee(int id) {
        return employeeDao.getEmployee(id);
    }

    @Override
    @Transactional
    public void deleteEmployee(int id) {
        employeeDao.deleteEmployee(id);
    }
}
