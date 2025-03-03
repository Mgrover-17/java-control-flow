import java.util.Scanner;

class FizzBuzz{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		if(number>0){
			for(int i=1;i<=number;i++){  // Loop runs till number
				if(i%3==0 && i%5==0){
					System.out.println("FizzBuzz"); //Check for both
				}
				else if(i%3==0){
					System.out.println("Fizz");
				}
				else if(i%5==0){
					System.out.println("Buzz"); 
				}
				else{
					System.out.println(i); // Print number if no condition matches
				}
			}
		}
		else {
            System.out.println("Please enter a positive integer.");
        }
	}
}
