 package com.Javalearn.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Javalearn.demo.execption.ResourcesNotFoundException;
import com.Javalearn.demo.model.Employee;
import com.Javalearn.demo.repositary.EmployeeRepositary;
import com.Javalearn.demo.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService{
private EmployeeRepositary employeeRepositary;

	


	public EmployeeServiceImpl(EmployeeRepositary employeeRepositary) {
	super();
	this.employeeRepositary = employeeRepositary;
}



@Override
	public Employee SaveEmployee(Employee employee) {
		// TODO Auto-generated method stu
		return employeeRepositary.save(employee);
	}



@Override
public List<Employee> getEmployee() {
	// TODO Auto-generated method stub
	return employeeRepositary.findAll();
}



@Override
public Employee putEmployee(Employee employee, long id) {
	// TODO Auto-generated method stub
	Employee em=employeeRepositary.findById(id).orElseThrow( () -> new ResourcesNotFoundException("Employee","Id",id));
	em.setFirstName(employee.getFirstName());
	em.setLast(employee.getLast());
	em.setEmail(employee.getEmail());
	employeeRepositary.save(em);
	return em;
	
}



@Override
public void deleteEmployee(long id) {
	// TODO Auto-generated method stub
	employeeRepositary.findById(id).orElseThrow( () -> new ResourcesNotFoundException("Employee","Id",id));
	employeeRepositary.deleteById(id);
}


}
