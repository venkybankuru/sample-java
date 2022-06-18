package venky;

public class PrimeNumberNew {

	public static void main(String[] args) {
		int x=7;
		int count=0;
		
		if(x>1)
		{
			for(int i=1;i<=x;i++)
			{
				if(x%i==0)
				{
					count++;
				}
			}if(count==2)
				{
					System.out.println("number is prime");
				}else
				{
					System.out.println("number is not prime");
				}
			}
			
		
		else {
			System.out.println("not for prime");
		}
	}

}
