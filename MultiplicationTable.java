import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number (from 6 to 9): ");
        int number = sc.nextInt();
        
        if (number >= 6 && number <= 9) {
            System.out.println("Multiplication table of " + number + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " * " + i + " = " + (number * i));
            }
        } else {
            System.out.println("Please enter a number between 6 and 9.");
        }
    }
}
