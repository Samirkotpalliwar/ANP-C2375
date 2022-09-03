package question3.org2.service;

public class Main {
	
	public static void countObject(Degree []obj) {
		int count1=0;
		int count2=0;
		int count3=0;
		for(Object ele: obj) {
			if(ele.getClass().getName().equals("question3.org2.service.Degree")){
				count1++;
			}else if(ele.getClass().getName().equals("question3.org2.service.Undergraduate")) {
				count2++;
			}else {
				count3++;
			}
		}
		System.out.println("degree="+count1);
		System.out.println("Undergraduate="+count2);
		System.out.println("Postgraduate="+count3);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Degree obj=new Degree();
		Postgraduate obj1=new Postgraduate();
		Postgraduate obj4=new Postgraduate();
		Undergraduate obj2=new Undergraduate();
		
		Degree[]objArray= {obj,obj1,obj2,obj4};
		
		countObject(objArray);

	}

}
