package org.tnsif.interfacekeyword;

import org.insif.interfacedemo.Human;

//driver class
public class InterfaceExecutor {

	public static void main(String[] args) {
		//we cannot instantiate an interface
		//Sony s=new Sony();

		SonySub s1=new SonySub();
		s1.display();
		s1.show();
		Sony.accept(); //for displyaing static method we should use interface.object
		
		ISRO i=new ISRO();
		i.status();
		
		Human h=new Human();
		h.showDrink();
	}

}
