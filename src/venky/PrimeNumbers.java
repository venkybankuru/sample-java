package venky;

import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		num = sc.nextInt();
	//int num = 30;
	boolean isprime=true;
	
	for(int i=2;i<num;i++)
	{
		if(num%i==0)
		{
			isprime=false;
			break;
		}
	}
	if(isprime)
	{
		System.out.println("prime number");
	}else
	{
		System.out.println("not prime number");
	}
}
}
