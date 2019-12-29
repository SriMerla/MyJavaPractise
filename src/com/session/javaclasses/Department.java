package com.session.javaclasses;

public class Department implements Cloneable{
	
	
	@Override
	public String toString() {
		return "Department [departmentNum=" + departmentNum + ", departmentName=" + departmentName + "]";
	}
	private int departmentNum;
	private String departmentName;
	
	public Department(int departmentNum, String departmentName) {
		super();
		this.departmentNum = departmentNum;
		this.departmentName = departmentName;
	}
	
	public int getDepartmentNum() {
		return departmentNum;
	}
	public void setDepartmentNum(int departmentNum) {
		this.departmentNum = departmentNum;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	
	

}
