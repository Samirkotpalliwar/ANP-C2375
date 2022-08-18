package question2;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1;
		for(int i=1; i<8; i++)
		{
			for(int j=0; j<i; j++)
			{
				
				System.out.print(" "+num*j);
			}
			
			System.out.println();
			num++;
		}

	}

}

