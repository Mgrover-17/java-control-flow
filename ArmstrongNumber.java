import java.util.*;
import java.lang.*;

class ArmstrongNumber{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		int sum=0;
		int originalNumber=number;
		while(originalNumber>0){
			int rem=originalNumber%10;
			sum+=rem*rem*rem;
			originalNumber/=10;
		}
		if(number==sum){
			System.out.println("Entered number " + number + " is an Armstrong Number.");
		}
		else{
			System.out.println("Entered number " + number + " is not an Armstrong Number.");
		}
	}
}