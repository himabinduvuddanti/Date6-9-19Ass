package Day9;

import java.util.Scanner;

public class Q66MaxScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr,count=0;
		Scanner s = new Scanner(System.in);
		System.out.println("enter no of subjects");
		arr = s.nextInt();
		if(arr<=0)
		{
		System.out.println("invalid size");
		}else
		{
		System.out.println("enter array elements:");
		
		int a[]=new int[arr];
		
		for(int i=0;i<arr;i++)
		{
		a[i]= s.nextInt();
		if(a[i]<=0)
		{
			System.out.println("invalid score");
			
		}
		}
		System.out.println("enter sercond array elements:");
		int b[]=new int[arr];
		for(int i=0;i<arr;i++)
		{
		b[i]= s.nextInt();
		if(b[i]<=0)
		{
			System.out.println("invalid score");
			
		}
		
		}
		
		for(int i=0;i<arr; i++)
		{
			
			if(a[i]>b[i])
			{
				count++;
			}
			
		}
		System.out.println(count);
		}
	

	}

}
