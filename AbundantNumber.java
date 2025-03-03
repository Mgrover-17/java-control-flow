import java.util.*;

class AbundantNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		
		boolean isAbundant = false;
				
		int sum = 0;
		for(int i=number-1;i>=1;i--){
			if(number%i==0){
				System.out.println(i);
				sum+=i;
			}
		}
		
		if(number%sum==0){
			isAbundant = true;
		}
			
		System.out.print("Given Number " + number + " is Abundant Number : "+isAbundant);
	}

}