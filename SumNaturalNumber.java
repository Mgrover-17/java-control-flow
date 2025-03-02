import java.util.Scanner;

class SumNaturalNumber{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<=0){
			System.out.println("enter a natural number");
		}
		else{
			int formulaSum=n*(n+1)/2;
			int loopSum = 0;
            for (int i = 1; i <= n; i++) {
                loopSum += i;
            }
			System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using while loop: " + loopSum);
			if (formulaSum == loopSum) {
                System.out.println("Both computations are correct!");
            } else {
                System.out.println("There is a mismatch in computations.");
            }
		}
	}
}

				