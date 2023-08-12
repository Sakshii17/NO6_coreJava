//program to demonstrate on jagged array
package org.tnsif.jaggedarray;
import java.util.Scanner;
public class JaggedArrayExample {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//declaration of jagged array 
		int arr[][]=new int[3][];
		
		arr[0]=new int [2];
		arr[1]=new int [1];
		arr[2]=new int [3];
		int j = 0;
		for(int i=0;i<3;i++)
		{
			for(int j1=0;j1<arr[i].length;j1++);
			{
				arr[i][j]=s.nextInt();
			}
		}
		
		for(int i=0;i<3;i++)
		{
			for(int j1=0;j1<arr[i].length;j1++);
			{
				System.out.println(arr[i][j]+" ");
			}
			System.out.println();
		}
				
	}

}
