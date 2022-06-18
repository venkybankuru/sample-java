package venky;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("enter any number");
		num=sc.nextInt();
		//int num= 4;
		switch(num) {
		
		//int j= 3;
		//switch(j) {
		case 0:
			System.out.println("value is 0");
			break;
		case 1:
			System.out.println("value is 1");
			break;
		case 2:
			System.out.println("value is 2");
			break;
		case 4:
			System.out.println("value is 4");
			default:
				System.out.println("no value");
		}

	}

}
