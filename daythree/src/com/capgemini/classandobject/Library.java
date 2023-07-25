//driver class
//program to demonstrate on default and parameterized

package com.capgemini.classandobject;
//class declaration
public class Library {
	
	public long noOfBooks;
	public String authorName;
	public String bookName;
	public double price;
	//default constructor using source 
	public Library() {
		System.out.println("Default Constructor");
	}
	
	//Parameterized Constructor
	public Library(long noOfBooks, String authorName, String bookName, double price) {
		super();
		this.noOfBooks = noOfBooks;
		this.authorName = authorName;
		this.bookName = bookName;
		this.price = price;
		System.out.println("Parameterized Constructor");
	}

	@Override
	public String toString() {
		return "Library [noOfBooks=" + noOfBooks + ", authorName=" + authorName + ", bookName=" + bookName + ", price="
				+ price + "]";
	}
	
	
	

}
