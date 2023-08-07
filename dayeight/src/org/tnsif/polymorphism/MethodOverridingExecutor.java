//program to demonstrate method overriding
package org.tnsif.polymorphism;
class CM
{
	static void Corruption(String str1,float ammount1)
	{
		System.out.println(str1+" "+"corrupted the ammount of"+" "+ammount1);
	}
}
class MLA extends CM
{
	static void Corruption(String str2,float ammount2)
	{
		CM.Corruption("Raj Thakare", 4561651.23f);
		System.out.println(str2+"corrupted the ammount of"+ammount2);
	}
}
public class MethodOverridingExecutor {
	

	public static void main(String[] args) {
		MLA.Corruption("Devendra Fadanvis", 564132.00f);

	}

}
