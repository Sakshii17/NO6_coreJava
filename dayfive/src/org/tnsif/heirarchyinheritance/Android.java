package org.tnsif.heirarchyinheritance;

public class Android {
	
	private String brand;
	private String slotType;
	
	//getter and setter
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getSotType() {
		return slotType;
	}
	public void setSotType(String sotType) {
		this.slotType = sotType;
	}
	
	@Override
	public String toString() {
		return "Android [brand=" + brand + ", slotType=" + slotType + "]";
	}
	//parameterized constructor
	public Android(String brand, String slotType) {
		super();
		this.brand = brand;
		this.slotType = slotType;
	}
	
	
	
	
	

}
