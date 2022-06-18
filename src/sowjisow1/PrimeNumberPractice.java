package sowjisow1;

import java.util.Scanner;

public class PrimeNumberPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any numberr");
		int num =sc.nextInt();
		/*int count = 0;
		if(num>1)
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
				{
					count++;
				}
				
			}
			if(count==2)
			{
				System.out.println("this is prime number");
			}else
			{
				System.out.println("not a prime number");
			}
			
		}else 
		{
			System.out.println("this is not for check prime number");
		}*/
		
		if(num%2==0)
		{
			System.out.println("even number");
		}else
		{
			System.out.println("not a even number");
		}
		

	}

}
