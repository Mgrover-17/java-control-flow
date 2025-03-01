import java.util.Scanner;

class Largest{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		
		System.out.println(largestOfThree(num1,num2,num3));
	}
	public static boolean largestOfThree(int n1,int n2,int n3){
		if(n1>n2 && n1>n3){
			return true;
		}
		return false;
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



			