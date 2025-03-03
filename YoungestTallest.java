import java.util.Scanner; // Import Scanner for user input

class YoungestTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        // Taking user input for ages
        System.out.print("Enter age of Amar: ");
        int ageAmar = sc.nextInt();
        System.out.print("Enter age of Akbar: ");
        int ageAkbar = sc.nextInt();
        System.out.print("Enter age of Anthony: ");
        int ageAnthony = sc.nextInt();

        // Taking user input for heights
        System.out.print("Enter height of Amar: ");
        int heightAmar = sc.nextInt();
        System.out.print("Enter height of Akbar: ");
        int heightAkbar = sc.nextInt();
        System.out.print("Enter height of Anthony: ");
        int heightAnthony = sc.nextInt();

        // Finding the youngest friend by comparing ages
        if (ageAmar <= ageAkbar && ageAmar <= ageAnthony) {
            System.out.println("Youngest among the three is: Amar");
        } 
        else if (ageAkbar <= ageAnthony && ageAkbar <= ageAmar) {
            System.out.println("Youngest among the three is: Akbar");
        } 
        else {
            System.out.println("Youngest among the three is: Anthony");
        }

        // Finding the tallest friend by comparing heights
        if (heightAmar > heightAkbar && heightAmar > heightAnthony) {
            System.out.println("Tallest among the three is: Amar");
        } 
        else if (heightAkbar > heightAnthony && heightAkbar > heightAmar) {
            System.out.println("Tallest among the three is: Akbar");
        } 
        else {
            System.out.println("Tallest among the three is: Anthony");
        }
    }
}
