package com.springboot.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.jpa.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	// that's it ... no need to write any code LOL!
	
}
