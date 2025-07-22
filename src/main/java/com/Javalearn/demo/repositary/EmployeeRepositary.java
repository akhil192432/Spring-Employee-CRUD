package com.Javalearn.demo.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Javalearn.demo.model.Employee;
//@repositary  (we dont need add repositaty annotation  springjpa automatically provide them all
public interface EmployeeRepositary extends JpaRepository<Employee,Long> {

}
