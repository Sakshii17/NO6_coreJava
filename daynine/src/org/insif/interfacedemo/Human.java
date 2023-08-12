package org.insif.interfacedemo;
//implemtable class or child class
public class Human  implements ColdDrink, Alcohol {

	@Override
	public void showDrink() {
		System.out.println(colddrink+" "+alcoholType+" "+brand);
		
	}
	

}
