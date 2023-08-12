package org.tnsif.singledimensionalarray;

public class ArrayOfObjectsDemo {

	public static void main(String[] args)
	{
		Employee arr[]=new Employee[3];
		arr[0]=new Employee(101, "Sakshi", 45613.45);
		arr[1]=new Employee(102, "Pranjal", 45648.45);
		arr[2]=new Employee(103, "Prachi", 45689.45);
		
		
		for(int i=0;i<3;i++)
		{
			System.out.println(arr[i].getEmpId()+" "+arr[i].getEmpName()+" "+arr[i].getSalary());
		}
		
		
		
		
	}
}
