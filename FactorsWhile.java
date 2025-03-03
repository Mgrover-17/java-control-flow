import java.util.Scanner; // Import Scanner class for user input

class FactorsWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.print("Enter number: ");
        int number = sc.nextInt(); 

        // Check if the number is positive
        if (number > 0) {
            System.out.println("Factors of " + number + " are: ");
            int i = 1; // Initialize counter variable

            // While loop from 1 to the given number
            while (i <= number) {
                // Check if 'i' is a factor of 'number'
                if (number % i == 0) {
                    System.out.println(i); // Print the factor
                }
                i++; // Increment counter
            }
        } else {
            // If the number is not positive, display an error message
            System.err.println("Enter a positive number.");
        }
    }
}
