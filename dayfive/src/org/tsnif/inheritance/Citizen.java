//base class
package org.tsnif.inheritance;

public class Citizen {
	//
	
	private String city;
	private int Pincode;
	private String area;
	private long adharNO;
	
	//getter and setters
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return Pincode;
	}
	public void setPincode(int pincode) {
		Pincode = pincode;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public long getAdharNO() {
		return adharNO;
	}
	public void setAdharNO(long adharNO) {
		this.adharNO = adharNO;
	}
	
	@Override
	public String toString() {
		return "Citizen [city=" + city + ", Pincode=" + Pincode + ", area=" + area + ", adharNO=" + adharNO + "]";
	}
	
	public Citizen() {
		System.out.println("Citizen-Parent class");
	}
	
	//parameterized constructor
	public Citizen(String city, int pincode, String area, long adharNO) {
		super();
		this.city = city;
		Pincode = pincode;
		this.area = area;
		this.adharNO = adharNO;
	}
	
	
	
	
	
	
}
