import java.util.Scanner;

class Factorial{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int fact=1;
		int num=n;
		while(num>0){
			fact*=num;
			num--;
		}
		System.out.println("The factorial of number "+n+" is "+fact);
	}
}
