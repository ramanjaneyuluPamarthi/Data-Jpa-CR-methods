package com.nit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nit.entity.Employee;

@Repository                            //It is optional in this situation
public interface EmployeeRepository extends JpaRepository<Employee, Serializable>
{
	

}
