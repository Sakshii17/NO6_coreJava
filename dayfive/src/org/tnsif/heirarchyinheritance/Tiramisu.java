package org.tnsif.heirarchyinheritance;
//child class 1
public class Tiramisu extends Android {
	
	//private data members
	private int version;
	
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
	//paramterized contructor
	
	public Tiramisu(String brand, String slotType,int Version) {
		super(brand, slotType);
		this.version=version;
	}
	


	@Override
	public String toString() {
		return "Tiramisu [version=" + version + ", toString()=" + super.toString() + "]";
	}
}
