//driver class
//program to demonstrate on default and parameterized
package com.capgemini.classandobject;

public class LibraryExecutor {

	public static void main(String[] args) {
		//object creation
		Library l=new Library();
		Library l1=new Library(5,"Aman","Automic Habits",250);
		System.out.println(l1);
	}

}
