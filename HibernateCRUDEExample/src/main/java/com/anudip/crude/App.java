package com.anudip.crude;

import java.util.Scanner;

import com.anudip.crude.daoimpl.CostomerDAOImpl;

/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {
    	CostomerDAOImpl cDaoImpl = new CostomerDAOImpl();
    	char a;
    	do {
    		Scanner sc=new Scanner(System.in);
    		System.out.println("------------Customer Managment----------");
    		System.out.println("Enter Your Choice");
    		System.out.println("1. Read Customer");
	        System.out.println("2. Add Customer");
	        System.out.println("3. Update Customer");
	        System.out.println("4. Delete Customer");
	        System.out.println("5. Exit ");
			System.out.println("Enter Your Choice : ");
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				cDaoImpl.getCustomer();
				break;

			case 2:
				cDaoImpl.addCustomer();
				break;

			case 3:
				cDaoImpl.updateCustomer();
				break;

			case 4:
				cDaoImpl.deleteCustomer();
				break;

			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Choice");
			}
			System.out.println("do you want to continue ? Y/N");
			a = sc.next().charAt(0);
			
		} while (a=='Y' || a=='y');
		System.out.println("Thank You !");
		
	}

    	}
    	

