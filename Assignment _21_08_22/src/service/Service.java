package service;

public class Service {
		 
	public	int calculateSum(int n) {
			int sum=0;
			for(int i=1;i<=n;i++) {
				if(i%3 == 0 && i%5 == 0) 
				
				sum=sum+i;
				}
				return sum;
				
			}
	
				
			
	public int calculateDifference(int n) {
		int sum1=0;
		int sum2=0;
		
		for(int i=1;i<=n;i++) {
             
			sum1=sum1+(i*i);
			sum2=(sum2+i);
		}
		sum2=sum2*sum2;

		
			return sum2-sum1;
	}
	
	public boolean checkNumber(int number) {
		int rem;
		int temp=number%10;
		number=number/10;
		while(number > 0) {
			rem=number%10;
			number=number/10;
			
			if(rem>temp) {
				return false;
			}
			temp=rem;
		}
		return true;
	
	}
	public boolean checkNum( int n) {
		
		if(n==0) {
			
			return false;
		}
		while (n !=1) {
			if(n % 2 !=0) {
				return false;
			}
			n=n/2;
		}
		return false;
		
	}
}
		
	


