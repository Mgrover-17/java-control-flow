import java.util.Scanner;

class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        
        int count = 0;
        int n = number; //for modifying n inside the loop without losing the original input value.
        
        while (n > 0) {  // Loop runs while `n` is greater than 0
            n /= 10;     // Remove last digit of `n`
            count++;     // Increment digit count
        }

        System.out.println("Entered number " + number + " has " + count + " digits");
    }
}
