//Program to demonstrate on user-input value
package com.capgemini.introduction;

import java.util.Scanner;

public class UserInputDemo {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str1=s.nextLine();
		System.out.println("String is: "+str1);

	}

}
