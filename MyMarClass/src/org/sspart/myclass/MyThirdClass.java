package org.sspart.myclass;

import org.sspart.myclass1.MyFourthClass;
import org.sspart.myclass.MySecondClass;

public class MyThirdClass extends MySecondClass {

	public static void main(String[] args) {
		MySecondClass mySecondClass=new MySecondClass();
		mySecondClass.printData();
		//MyFourthClass myFourthClass= new MyFourthClass();
		//myFourthClass.print();
		printData1();
	}
	public void printAnotherData() {
		printAnotherData();
		
	}
	private static void printData1() {
		System.out.println("Im in third class private method");

	}

}
