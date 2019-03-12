package org.sspart.myclass;

import org.sspart.myclass1.MyFourthClass;

import org.sspart.myclass.MyThirdClass;
//import org.sspart.myclass.*;

public class MyFirstClass extends MyFourthClass {

	public static void main(String[] args) {
		System.out.println("Welcome");
		MyFourthClass myFourthClass =new MyFourthClass();
		myFourthClass.print();
		MyThirdClass myThirdClass= new MyThirdClass();
		myThirdClass.printAnotherData();
		
	}

}
