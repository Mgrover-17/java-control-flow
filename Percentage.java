import java.util.Scanner; // Import Scanner class for user input

class Percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        // Taking input for marks
        System.out.print("Enter Physics marks: ");
        int physicsMarks = sc.nextInt();
        
        System.out.print("Enter Chemistry marks: ");
        int chemistryMarks = sc.nextInt();
        
        System.out.print("Enter Maths marks: ");
        int mathsMarks = sc.nextInt();
        
        int totalMarks = physicsMarks + chemistryMarks + mathsMarks; // Total marks scored
        double percentage = (totalMarks * 100) / 300; 
        
        // Checking the level based on percentage
        if(percentage>=80){
			System.out.print("Level 4, above agency-normalized standards");
		}
		else if(percentage>=70 && percentage<80){
			System.out.print("Level 3, at agency-normalized standards");
		}
		else if(percentage>=60 && percentage<70){
			System.out.print("Level 2, below, but approaching agency-normalized standards");
		}
		else if(percentage>=50 && percentage<60){
			System.out.print("Level 1, well below agency-normalized standards");
		}
		else if(percentage>=40 && percentage<50){
			System.out.print("Level 1, too below agency-normalized standards");
		} else {
            System.out.println("Remedial standards");
        }
    }
}
