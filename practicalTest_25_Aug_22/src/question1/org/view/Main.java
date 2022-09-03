package question1.org.view;

import java.util.Scanner;

import question1.org.service.ArrayService;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		ArrayService service=new ArrayService();
		Scanner sc=new Scanner(System.in);
		int []a=new int[5];
		System.out.println("Enter  5 element in array");
		for(int i=0;i<5;i++) {
			a[i]=sc.nextInt();
		}
	 System.out.println("Average= "+service.calculateAverage(a));

	}

}
