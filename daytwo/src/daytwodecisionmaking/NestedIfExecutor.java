//Program to demonstrate on Bunjee jumping using nested if

package daytwodecisionmaking;

import java.util.Scanner;

public class NestedIfExecutor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int age=s.nextInt();
		int weight=s.nextInt();
		if(age>=12)
		{
			if(weight>=40)
			{
				System.out.println("Eligible for Bunjee Jumping");
				if(weight>110)
				{
					System.out.println("Extra ropes will be added");
				}
			}
			else
			{
				System.out.println("Not eligible");
			}
		}
		else 
		{
			System.out.println("Not eligible");
		}

	}

}
