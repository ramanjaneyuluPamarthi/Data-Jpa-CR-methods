package com.nit.entity;

import org.hibernate.annotations.Collate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "EMP_TBL")
public class Employee {
	
	
	
	public Employee() {

	}
	
	
	
	public Employee(int empId, String empName, long empMobile, double empSal) {
		this.empId = empId;
		this.empName = empName;
		this.empMobile = empMobile;
		this.empSal = empSal;
	}



	@Id
	@Column(name = "EMP_ID")
	private int empId;
	
	@Column(name = "EMP_NAME")
	private String empName;
	
	@Column(name = "EMP_MOBILE")
	private long empMobile;
	
	@Column(name = "EMP_SAL")
	private double empSal;
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public long getEmpMobile() {
		return empMobile;
	}
	public void setEmpMobile(long empMobile) {
		this.empMobile = empMobile;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empMobile=" + empMobile + ", empSal=" + empSal
				+ "]";
	}
	
	

}
