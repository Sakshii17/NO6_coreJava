package org.tnsif.finalkeyword;

public class HP extends Laptop {
	final String processor="Intel I7";
	//final method
	// we cant override final method
	/*final void display()I
		{
			System.out.println(processor);
		}
		*/
	void display(String processor)
	{
		System.out.println(processor);
	}
}
