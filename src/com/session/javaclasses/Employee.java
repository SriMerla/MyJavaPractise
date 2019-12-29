package com.session.javaclasses;

public class Employee implements Cloneable{
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + ", department=" + department + "]";
	}

	private String employeeId;
	private String employeeName;
	private int employeeSalary;
	private Department department;
	
	public Employee(String employeeId, String employeeName, int employeeSalary, Department department) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.department = department;
	}
	
	
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public Department getDepartment() {
		return department;
	}
	
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Employee customizedCloning = (Employee) super.clone(); 
		customizedCloning.setDepartment((Department)customizedCloning.getDepartment().clone()); 
		return customizedCloning;
	}


	
	
	
	
	

}
