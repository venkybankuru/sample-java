package venky;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num ;
		num = sc.nextInt();
int rem, sum=0, temp;
//int num =1011;
temp = num;
while(num>0)
{
	rem = num%10;
	sum = (sum*10)+rem;
	num = num/10;
	
}if(temp==sum)
{
	System.out.println("given number is palindrome");
}else 
{
	System.out.println("given number is not palindrome");
}

	}

}
