
package org.tnsif.superkeyworddemo;
//program to demonstrate on super keyword with variable
class Building
{
	int floors=50;
	String name="Aditya";
}
class Flat extends Building
{
	String name="Sakshi Gangurde";
	/*If parent class and child class variable names are same and if you want to access 
	 * parent class variable inside child class used super.variable name
	 */
	
	void print()
	{
		System.out.println(super.name);
		System.out.println(name);
		//System.out.println(super.floors);
		//System.out.println(floors);
	}
}
public class SuperKeywordWithVariable {

	public static void main(String[] args) {
		Flat f=new Flat();
		System.out.println(f.name);
		System.out.println(f.floors);
		f.print();
	
		

	}

}
