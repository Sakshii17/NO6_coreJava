package org.tsnif.multilevelinheritance;
//parent class(A)
public class Manager {
	
	//private data members
	private String deptName;
	private String Name;
	private int empID;
	
	//getter and setters
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	
	@Override
	public String toString() {
		return "Manager [deptName=" + deptName + ", Name=" + Name + ", empID=" + empID + "]";
	}
	
	//parameterized constructor
	public Manager(String deptName, String name, int empID) {
		super();
		this.deptName = deptName;
		Name = name;
		this.empID = empID;
	}
	
	
	
	
}
