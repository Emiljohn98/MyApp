package com.ofss;

public class Employee {
	private String empName;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String empName) {
		super();
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + "]";
	}
	
	
}
