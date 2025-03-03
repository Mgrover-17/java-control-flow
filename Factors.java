import java.util.Scanner; // Import Scanner class for user input

class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter number: ");
        int number = sc.nextInt(); 

        // Check if the number is positive
        if (number > 0) {
            System.out.println("Factors of " + number + " are: ");

            // Loop from 1 to the given number
            for (int i = 1; i <= number; i++) {
                // Check if 'i' is a factor of 'number'
                if (number % i == 0) {
                    System.out.println(i); // Print the factors
                }
            }
        } 
        else {
            // If the number is not positive, display an error message
            System.err.println("Enter a positive number.");
        }

        sc.close(); // Close the Scanner to prevent memory leaks
    }
}
