import java.util.Scanner;

class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        
        int sum = 0;
        int n = number; // Copy of original number
        
        // Calculate sum of digits
        while (n > 0) {
            int digit = n % 10; // Extract last digit
            sum += digit; // Add digit to sum
            n/= 10; // Remove last digit
        }

        // Check if number is divisible by sum of its digits
        if (number % sum == 0) {
            System.out.println("Entered Number " + number + " is a Harshad Number.");
        } else {
            System.out.println("Entered Number " + number + " is NOT a Harshad Number.");
        }
    }
}
