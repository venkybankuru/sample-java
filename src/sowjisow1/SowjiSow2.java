package sowjisow1;

import java.util.Scanner;

public class SowjiSow2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num;
		num= sc.nextInt();
		int count=0;
		
		if(num>0) {
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
					count++;
			}
					if(count==2)
					{
						System.out.println("prime number");
					}else
					{
					System.out.println(" not a prime number");
				}
			}
		else
		{
			
			System.out.println("number not for check");
		

	}
}
}
