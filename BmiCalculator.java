import java.util.Scanner;

class BmiCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking user input for weight and height
        System.out.print("Enter the weight in kg: ");
        double weight = sc.nextDouble();
        
        System.out.print("Enter the height in cm: ");
        int height = sc.nextInt();
        
        double cmToM = height / 100.0;  // Convert cm to meters 
        
        // BMI calculation: weight (kg) / (height (m) * height (m))
        double bmi = weight / (cmToM * cmToM);
        
        // Display calculated BMI
        System.out.println("BMI calculated is: " + bmi);

        // Classify BMI into categories
        if (bmi <= 18.4) {
            System.out.print("Underweight");
        } else if (bmi >= 18.5 && bmi <= 24.9) {  // Normal range
            System.out.print("Normal");
        } else if (bmi >= 25.0 && bmi <= 39.9) {  // Overweight
            System.out.print("Overweight");
        } else if (bmi >= 40.0) {  // Obese
            System.out.print("Obese");
        }
    }
}
