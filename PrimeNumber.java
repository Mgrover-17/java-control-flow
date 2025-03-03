import java.util.Scanner;

class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter number: ");
        int number = sc.nextInt();  
        boolean isPrime = true;  // Assume number is prime

        for (int i = 2; i < number; i++) { // Loop from 2 to number-1
            if (number % i == 0) {  // If number is divisible by i
                isPrime = false;  // It's not prime
                break;  // Exit loop early
            }
        }
        System.out.println("Entered number " + number + " is Prime: " + isPrime);
    }
}
