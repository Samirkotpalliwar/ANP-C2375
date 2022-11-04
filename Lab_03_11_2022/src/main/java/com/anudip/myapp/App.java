package com.anudip.myapp;

import java.util.Scanner;

import com.anudip.myapp.daoimpl.ActorDAOImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ActorDAOImpl aImpl=new ActorDAOImpl();
        int n ;
        System.out.println("********** Actor Management App ********** ");
        do {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("1. Display Actor");
	        System.out.println("2. Add Actor");
	        System.out.println("3. Update Actor");
	        System.out.println("4. Delete Actor");
	        System.out.println("5. Exit ");
			System.out.println("Enter Your Choice : ");
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				aImpl.getActor();
				break;

			case 2:
				aImpl.addActor();
				break;

			case 3:
				aImpl.updateActor();
				break;

			case 4:
				aImpl.deleteActor();
				break;

			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Choice");
			}
			System.out.print("Do you want to continue then press 1 otherwise press any number :");
			n = sc.nextInt();
			
		} while (n == 1);
		System.out.println();
		System.out.println("				****** Thank You! ****** ");
		System.out.println("			****** For yousing my Application ******");
    	
    	
    }
}
