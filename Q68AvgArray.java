package Day9;
import java.util.Scanner;
public class Q68AvgArray {

	
		    public static void main(String[] args) 
		    {
		        int n,i = 0, sum = 0;
		        float average;
		        Scanner s = new Scanner(System.in);
		        System.out.print("Enter no. of elements you want in array:");
		        n = s.nextInt();
		        int a[] = new int[n];
		        System.out.println("Enter all the elements:");
		        
		       
		        for(i = 0; i < n ; i++)
		        {
		        	
		            a[i] = s.nextInt();
		            if(a[i]<=-1 ||a[i]>20)
		            {
		            	
		            	System.out.println("invalid input");
		            	
		            	 a[i] = s.nextInt();
		            }
		            sum = sum + a[i];
		            
		            
		        
		        }
		       
		       
		       
		        average = (float)sum / n;
		        System.out.println("Average:"+average);
		    }
		}

	
