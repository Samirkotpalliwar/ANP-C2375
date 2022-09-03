package  question1.org.service;

public class ArrayService {
	
	public double calculateAverage(int a[]) {
		int sum=0;
		
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		double average=sum/a.length;
		
		return average;
	}
	
	

}
