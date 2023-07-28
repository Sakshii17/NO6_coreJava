/* There are N people standing in a circle waiting to be executed. 
 * The counting out begins at some point in the circle and procced around a circle
 * in a fixed direction.
 * In each steps a certain number of people are skipped and the next person is executed.
 * the elimination procceds around a circle in the (which is becoming smaller and smaller
 * as executed people are removed),until only the last person remains, who is given freedom.
 * given the total no. of person N and a no. K which indicates that K-1 person are skipped and
 * Kth person is killed in a circle The tasks is to choose the person in the initial circle that 
 * survives. N=5 and K=2
 */
package org.tnsif.dayfourchallenge;
import java.util.Scanner;

public class CircleSurviveChallenge {
	
	static int survive(int n, int k)
	{
		if(n==1)
			return 1;
		else
			return(survive(n-1,k)+k-1)%n+1;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a value for n and k: ");
		int n=s.nextInt();
		int k=s.nextInt();
		System.out.println(survive(n,k));

	}

}
