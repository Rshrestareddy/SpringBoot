package com.example.springbootbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springbootbackend.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Long>{
	
	

}
