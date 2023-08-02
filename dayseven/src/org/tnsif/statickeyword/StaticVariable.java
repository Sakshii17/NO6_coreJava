package org.tnsif.statickeyword;
class Employee
{
	private int empId;
	private String name;
	//static variable
	private static String companyName="TNSIF";
	
	//getter and setter method
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static String getCompanyName() {
		return companyName;
	}
	public static void setCompanyName(String companyName) {
		Employee.companyName = companyName;
	}
	
	void display()
	{
		System.out.println("empId:"+this.getEmpId()+" "+"emp name:"+this.getName()+" "+
				"companyName:"+this.getCompanyName());
	}
	
}
//driver class
public class StaticVariable {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.setEmpId(1);
		e.setName("Sakshi");
		e.display();
		
		Employee e1=new Employee();
		e1.setEmpId(5);
		e1.setName("Aditya");
		e1.display();

	}

}
