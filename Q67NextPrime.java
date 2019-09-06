package Day9;

import java.util.Scanner;

public class Q67NextPrime {

	public static void main(String[] args) {
		
		
		Scanner s= new Scanner(System.in);
		System.out.println("enter a number:");
		int n = s.nextInt();
		if(n>32767)
		{
		System.out.println("number is too large");
		}
		else if(n<0)
		{
		System.out.println("number is too small");
		}


		else
		{

		for(int i=n+1;i<=100;i++)
		{
		int count = 0;
		for(int j=2;j<i;j++)
		{
		if(i%j==0)
		{
		count++;
		break;
		}
		}
		if(count==0)
		{
		System.out.println("next prime number is "+i);
		break;
		}




		}
		}
		}
}
