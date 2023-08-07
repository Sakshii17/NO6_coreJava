package org.insif.abstractkeyword;
//driver class
//program to demonstrate abstract keyword
public class AbstractClassExecutor {

	public static void main(String[] args) {
		//we can't create the object for abstract class
		//Sandwich s=new Sandwich();
		
		CornSandwich s=new CornSandwich();
		s.prepare();
		s.showRecipe();
	}

}
