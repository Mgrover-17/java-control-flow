import java.util.Scanner;

class CompareSum{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<=0){
			System.out.println("enter a natural number");
		}
		else{
			int formulaSum=n*(n+1)/2;
			int loopSum = 0, i = 1;
            while (i <= n) {
                loopSum += i;
                i++;
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

				