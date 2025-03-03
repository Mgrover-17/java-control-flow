import java.util.Scanner;

class OddEvenL2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
				if(i%2==0){
					System.out.println("The number "+i+" is an even number.");
				}
				else{
					System.out.println("The number "+i+" is an odd number.");
				}
			}
		}
	}
}

    