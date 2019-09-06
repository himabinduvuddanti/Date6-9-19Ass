import java.util.Scanner;
public class NextPrimeforNnum {

	public static void main(String[] args) {
	
		
				
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		int a[]=new int[n];
		for(int b=0;b<n;b++)
		{
		   a[b]=s.nextInt();

		if(a[b]>32767)
		{
		System.out.println("number is too large");
		}
		else if(a[b]<0)
		{
		System.out.println("number is too small");
		}
		else
		{
		for(int i=a[b]+1;i<=100;i++)
		{
		int count=0;

		for( int j=2;j<i;j++)


		{
		if(i%j==0)

		{
		count++;
		break;
		}

		}	

		if(count==0)
		{

		System.out.println("the next prime is"+i);
		            break;
		}


		}
		}
		}
		
	}		
	
}	
	
				          
				            
				