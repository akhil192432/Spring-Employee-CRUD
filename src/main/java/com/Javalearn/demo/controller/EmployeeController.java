package com.Javalearn.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Javalearn.demo.model.Employee;
import com.Javalearn.demo.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
		private EmployeeService employeeService;

		public EmployeeController(EmployeeService employeeService) {
			super();
			this.employeeService = employeeService;
		}
		@PostMapping("/employee")
		public ResponseEntity<Employee> save(@RequestBody Employee employee){
			Employee saved=employeeService.SaveEmployee(employee);
			return  new ResponseEntity<Employee>(saved,HttpStatus.CREATED);
		}
		@GetMapping("/get")
		public List<Employee> getEmp() {
			return employeeService.getEmployee();
		}
		@PutMapping("{id}")
		public ResponseEntity<Employee> update( @RequestBody Employee employee,@PathVariable("id") long id){
		return  new ResponseEntity<Employee>(employeeService.putEmployee(employee,id),HttpStatus.OK);
		}
		}
