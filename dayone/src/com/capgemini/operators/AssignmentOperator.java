//Program to demonstrate on Assignment Operators
package com.capgemini.operators;

import java.util.Scanner;

public class AssignmentOperator {

	public static void main(String[] args) {
		/*int x=12,y=7;
		x-=y; //x=x-y
		System.out.println(x);
		*/
		
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		System.out.println(x-=y);
		}

}
