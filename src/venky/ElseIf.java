package venky;

import java.util.Scanner;

public class ElseIf {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num;
		System.out.println("enter A value");
		num = sc.nextInt();
		int id;
		System.out.println("enter B value");
		 
		id = sc.nextInt();
		if(num<id)
		{
			System.out.println("A less than B");
		}else if(num>id) {
			System.out.println("B greater than A");
		}else
		{
		System.out.println("given statement is incorrect");	
		}

	}

}
