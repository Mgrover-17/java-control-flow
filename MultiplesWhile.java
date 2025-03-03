import java.util.Scanner; // Import Scanner class for user input

class MultiplesWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.print("Enter a number: ");
        int number = sc.nextInt(); 

        // Check if the number is within the valid range (1 to 100)
        if (number > 0 && number <= 100) {
            System.out.println("Multiples of " + number + " up to 100:");
			int i=1;
			
            // Loop from 1 to 100
            while(i <= 100) {
                // Check if 'i' is a multiple of 'number'
                if (i % number == 0) {
                    System.out.println(i); // Print the multiples
                }
				i++;
            }
        } else {
            System.out.println("Please enter a number between 1 and 100.");
        }
    }
}
