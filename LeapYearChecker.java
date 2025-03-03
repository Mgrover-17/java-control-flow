import java.util.Scanner; // Import Scanner class for user input

class LeapYearChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a year: ");
        int year = sc.nextInt(); 

        // Check if the year is a leap year using multiple if-else statements
        if (year % 400 == 0) { 
            // If divisible by 400, it's a leap year
            System.out.println(year + " is a leap year.");
        } else if (year % 100 == 0) { 
            // If divisible by 100 but not 400, it's not a leap year
            System.out.println(year + " is not a leap year.");
        } else if (year % 4 == 0) { 
            // If divisible by 4 but not 100, it's a leap year
            System.out.println(year + " is a leap year.");
        } else { 
            // Otherwise, it's not a leap year
            System.out.println(year + " is not a leap year.");
        }
    }
}
