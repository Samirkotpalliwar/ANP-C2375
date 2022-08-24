package view;

import service.Service;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Service obj1=new Service();
		
		System.out.println(obj1.calculateSum(15));
		System.out.println(obj1.calculateDifference(3));
		System.out.println(""+obj1.checkNumber(134468));
		System.out.println(obj1.checkNum(8));

	}

}
