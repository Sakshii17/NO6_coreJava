package org.tnsif.instanceofdemo;

class RBI{
	protected String ifscCode;
}

class SBI extends RBI
{
	public SBI()
	{
		super.ifscCode="RBIS0NGPA01";
		String ifscCode="SBI0002156";
		System.out.println(ifscCode);
		/*if the parent class and child class variable name are same,
		 * in such case, use super.variablename to access that variable of parent
		 * class inside the child class*/
		System.out.println(super.ifscCode);
	}
	String ifscCode="SBI0002156";
}

public class InstanceOfDemo {

	public static void main(String[] args) {
		SBI s=new SBI();
		System.out.println(s instanceof SBI);
		System.out.println(s instanceof RBI);

	}

}
