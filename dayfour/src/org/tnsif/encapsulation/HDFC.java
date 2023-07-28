// Program to demonstrate on encapsulation
//Encapsulation achieves a data hiding using private access
package org.tnsif.encapsulation;

public class HDFC {
	//private data members 
	
	 private String accType;
	 private long accountNo;
	 private long atmCardNo;
	 private int pinNo;
	 
	 //getters and setters method 
	 //click on right click>source>getters and setters
	 
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public long getAtamCardNo() {
		return atmCardNo;
	}
	public void setAtamCardNo(long atmCardNo) {
		this.atmCardNo = atmCardNo;
	}
	public int getPinNo() {
		return pinNo;
	}
	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}
	
	@Override
	public String toString() {
		return "HDFC [accType=" + accType + ", accountNo=" + accountNo + ", atmCardNo=" + atmCardNo + ", pinNo="
				+ pinNo + "]";
	}
	
	
	 
}
