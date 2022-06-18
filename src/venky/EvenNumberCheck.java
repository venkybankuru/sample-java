package venky;

import java.util.Scanner;

public class EvenNumberCheck {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num;
		num= sc.nextInt();
		
	//	int num=2;
		
		
		if(num%2==0)
		{
			System.out.println("even number");
		}
		else 
		{
			System.out.println("odd number");
		}

	}

}
