package org.sspart.myclass;
import org.sspart.myclass1.MyFourthClass;

public class MySecondClass extends MyFourthClass{
	public static void main(String[] args) {
	//MyFourthClass myFourthClass=new MyFourthClass();
//printData();
	}

	public void printData()
	{
		System.out.println("Im in second class");
		showData();
	}
	private static void showData()
	{
		System.out.println("In SecondClass private method");
	}

	}


