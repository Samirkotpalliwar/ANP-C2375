enum mobile {
SAMSUNG(20000),LENOVO(30000),IPHONE(60000);
	
	int price;
	int i;
	mobile (int price){
		this.price=price;
	}
    	int printPrice() {
		return price;
	}
	
	}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       mobile PhonePrice=mobile.IPHONE;
		
		System.out.println(PhonePrice.printPrice());
		
		mobile price[]=mobile.values();
		
		for(int i=0;i<price.length;i++) 
			System.out.println(price[i]+" "+price[i].printPrice()+" "+price[i].printPrice());
		
		for(mobile pri:mobile.values())
			System.out.println(pri+" "+pri.printPrice()+" "+pri.printPrice());
	}

}
