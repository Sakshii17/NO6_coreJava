package org.tnsif.singledimensionalarray;

import java.util.Arrays;
import java.util.Scanner;

/* program to demonstrate on array using run time input value and to find largest elements in as array*/
public class ArrayMax {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the total number of elements: ");
		int n=s.nextInt();
		//array declaration
		int [] arr=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();		

		}
		System.out.println("Array elements are: ");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		int max=arr[0];
		for(int i=0;i<n;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("Largest Element is: "+max);
		Arrays.sort(arr);
		System.out.println("Sorted elements are: ");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}

	}

}
