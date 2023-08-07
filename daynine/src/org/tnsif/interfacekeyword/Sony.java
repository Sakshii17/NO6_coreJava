package org.tnsif.interfacekeyword;
//program to demonstrate on interface
public interface Sony {
	/*by default all the variables inside an interface is public static final*/
	
	int noOfChannels=8; //initialize the variable otherwise you will get an error
	//by default all the method inside an interface if an abstract method 
	
	void display();
	
	/*java 8 provides a static and default method inside an interface*/
	//static method
	static void accept()
	{
		System.out.println("static method");
	}
	
	//default method
	default void show()
	{
		System.out.println("default method");
	}
}
 