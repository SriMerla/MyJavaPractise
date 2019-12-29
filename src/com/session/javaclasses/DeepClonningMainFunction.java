package com.session.javaclasses;

public class DeepClonningMainFunction {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		System.out.println("**** From Main Method ****");
		
		Department dep1 = new Department(001, "Development");
		Employee emp1 = new Employee("101", "SriSatish", 70000, dep1 );
		
		System.out.println("Original Object : " + dep1);
		System.out.println("State of Original Object : " + emp1.toString());
		
		//Creating a clone to original object
		
		Employee clonedObjectEmp1 = (Employee)emp1.clone();
		System.out.println("Cloned Object : " + clonedObjectEmp1);
		System.out.println("State Cloned Object : " + clonedObjectEmp1.toString());
		 
		//change the value in cloned Object and check in the Original Object
		
		clonedObjectEmp1.getDepartment().setDepartmentName("Testing");
		System.out.println("State of Original Object : " + emp1.toString());
		System.out.println("State Cloned Object : " + clonedObjectEmp1.toString());
		 
		System.out.println("**** From End Method ****");

	}

}
