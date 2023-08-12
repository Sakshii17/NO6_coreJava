package org.tnsif.singledimensionalarray;
//program to demonstrate on arrays of objects
public class Employee {

	//private data members
	private int EmpId;
	private String EmpName;
	private double Salary;
	
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	
	public Employee(int empId, String empName, double salary) {
		super();
		EmpId = empId;
		EmpName = empName;
		Salary = salary;
	}
	
	
	
	
}
