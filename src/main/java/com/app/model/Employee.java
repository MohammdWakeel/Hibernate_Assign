package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Employee {
	@Id
	private int emp_id;
	private String empName;
	private String empDept;
	
		public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int emp_id, String empName, String empDept) {
		super();
		this.emp_id = emp_id;
		this.empName = empName;
		this.empDept = empDept;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", empName=" + empName + ", empDept=" + empDept + "]";
	}
	
	

}
