package Day9;
import java.util.Scanner;
public class Q65DigitCount {

	
		
			
			
			public static void main(String[] args) {
				int Number, Count=0;
				Scanner sc = new Scanner(System.in);		
				System.out.println("Please Enter any Number: ");
				Number = sc.nextInt();
				if(Number<=0)
				{
					
					System.out.println("invalid input");
					return;
				}
				while(Number > 0) {
					Number = Number / 10;
					Count = Count + 1; 
				}
			
				System.out.println("Number of Digits in a Given Number:"+ Count);
			}
		}

