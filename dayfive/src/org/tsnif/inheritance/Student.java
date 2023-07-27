package org.tsnif.inheritance;
//child class
public class Student extends Citizen {
	//private data members
	
	private int rollno;
	private String collegeName;
	
	//getter and setters
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getCollegeName() {
		return collegeName;
	}
	
	public Student(String city, int pincode, String area, long adharNO,int rollno,String collegename) {
		super(city, pincode, area, adharNO);
		this.rollno=rollno;
		this.collegeName=collegename;
		}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", collegeName=" + collegeName + ", toString()=" + super.toString() + "]";
	}
	
}


