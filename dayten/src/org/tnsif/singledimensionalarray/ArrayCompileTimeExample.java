package org.tnsif.singledimensionalarray;
// program to demonstrate on 1D array using compile time input
public class ArrayCompileTimeExample {

	public static void main(String[] args) {
		//array initailization compile time
		
		int arr[]= {66,56,45,31,6};
		System.out.println(arr[1]);
		System.out.println("Array elements are: ");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		

	}

}
