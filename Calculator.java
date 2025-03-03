import java.util.Scanner;

public class Calculator{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		String op;
		
		System.out.print("Enter the Frist number: ");
		double firstNumber  = sc.nextDouble();
		
		System.out.print("Enter the Second number: ");
		double secNumber  = sc.nextDouble();
		
		
		System.out.print("Enter the number of operations: ");
		int number = sc.nextInt();
		
		for(int i=1;i<=number;i++){
			System.out.print("Enter the operator: ");
			op = sc.next();
			
			switch (op){
				case "+":
					System.out.println(firstNumber+secNumber);
					break;
				case "-":
					System.out.println(firstNumber-secNumber);
					break;
				case "*":
					System.out.println(firstNumber*secNumber);
					break;
				case "/":
					System.out.println(firstNumber/secNumber);
					break;
				default:
                System.out.println("Invalid Operator");
			}
		}	
	}
}