import java.util.Scanner; // Import Scanner class for user input

class GreatestFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
		
        System.out.print("Enter number: ");
        int number = sc.nextInt();

        int greatestFactor = 1; // Initialize variable to store the greatest factor

        // Loop from number-1 to 1 to find the greatest factor
        for (int i = number - 1; i >= 1; i--) {
            // Check if 'i' is a factor of 'number'
            if (number % i == 0) {
                greatestFactor = i; // Store the first (largest) factor found
                break; // Exit loop after finding the first factor
            }
        }

        // Print the greatest factor found
        System.out.println("Greatest factor: " + greatestFactor);
    }
}
