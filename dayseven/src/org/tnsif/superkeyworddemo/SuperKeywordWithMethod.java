package org.tnsif.superkeyworddemo;
class MET
{
	String ownerNmae="Chagan Bhujbal";
	void displayName()
	{
		System.out.println("Owner is: "+ownerNmae);
	}
}
//child class
class BKC extends MET
{
	String ownerName="Shefali Bhujbal";
	void displayName()
	{
		/* if parent class and child class method name are same and if you want to access 
		 * that method inside child class then use super.methodName
		 */
		super.displayName();
		System.out.println("Owner is: "+ownerName);
	}
}
//driver class
public class SuperKeywordWithMethod {

	public static void main(String[] args) {
		BKC b=new BKC();
		b.displayName();
		
	}

}
