package org.tnsif.heirarchyinheritance;
//child class 2
public class SnowFlow extends Android{
	
	//private data members
		private int version;
		
		public int getVersion() {
			return version;
		}

		public void setVersion(int version) {
			this.version = version;
		}

	public SnowFlow(String brand, String sotType,int version) {
		super(brand, sotType);
		this.version=version;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "SnowFlow [version=" + version + ", toString()=" + super.toString() + "]";
	}
	

}
