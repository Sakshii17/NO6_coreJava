/*Program to demonstrate on to check the person is eligible to donate the blood or not 
  if..else*/

package com.capgemini.statements;

import java.util.Scanner;

public class IfElseStatement {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int age=s.nextInt();
		int weight=s.nextInt();
		if(age>18 && weight>45) {
			System.out.println("Eligible to donate the blood");
		}
		else
		{
			System.out.println("Not Eligible to donate th blood");
		}

	}

}
