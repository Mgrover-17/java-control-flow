import java.util.Scanner; // Import Scanner class for user input

class PowerFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.print("Enter the number: ");
        int number = sc.nextInt(); 

        System.out.print("Enter the power: ");
        int power = sc.nextInt(); 

        // Check if power is a positive integer
        if (power >= 0) {
            int result = 1; // Initialize result variable to 1

            // Loop to calculate power (number^power)
            for (int i = 1; i <= power; i++) {
                result *= number; // Multiply result by number in each iteration
            }
            System.out.println(number + " raised to the power " + power + " is: " + result);
        } else {
            System.out.println("Please enter a non-negative power.");
        }
    }
}
