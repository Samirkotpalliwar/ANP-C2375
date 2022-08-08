package org.anudip.model.mainview;
import org.anudip.model.*;
public class Mainview {

	public static void main(String[] args) {
		// TODO Auto-generated method student
		Costumer obj=new Costumer();
		Costumer obj1=new Costumer(4,"Aniket");
		
		Mainview obj3=new Mainview();
		
		System.out.println("costumer id="+obj.getCostumerId());
		
		
		int a=obj3.getCostumerIdFromCostumer(obj1);
		
        System.out.println("costumerId="+a);
        
       String CostumerName=obj3.getCostumerNameFromCostumer(obj1);
       System.out.println("costumerName="+CostumerName);
       
	}
	
	int   getCostumerIdFromCostumer(Costumer costumer1) {
		return costumer1.getCostumerId();
	}
	
	String getCostumerNameFromCostumer(Costumer costumer2) {
		return costumer2.getCostumerName();
	}

}
