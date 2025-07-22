package com.Javalearn.demo.service;

import java.util.List;

import com.Javalearn.demo.model.Employee;

public interface EmployeeService {
 Employee SaveEmployee(Employee employee);
List<Employee> getEmployee();
Employee putEmployee(Employee employee,long id);
 void deleteEmployee(long id);

}
