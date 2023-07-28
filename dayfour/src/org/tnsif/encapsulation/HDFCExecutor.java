package org.tnsif.encapsulation;

public class HDFCExecutor {

	public static void main(String[] args) {
		HDFC h=new HDFC();
		h.setAccType("Saving Account");
		h.setAccountNo(4561238951L);
		h.setAtamCardNo(8945123486L);
		h.setPinNo(4561);
		
		
		//System.out.println("Account No. is: "+h.getAccountNo());
		//below line will call to string () method
		System.out.println(h);

	}

}
