import java.util.Scanner;

class EmployeeBonusL2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter salary: ");
        int salary = sc.nextInt();
		System.out.print("Enter years of service: ");
        int yearsOfService = sc.nextInt();
        if (yearsOfService > 5) {
            double bonusAmount = salary * 0.05; 
            System.out.println("Bonus amount of employee is: " + bonusAmount);
        } else {
            System.out.println("No bonus as service is 5 years or less.");
        }
	}
}

    