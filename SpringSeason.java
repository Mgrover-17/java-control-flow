import java.util.Scanner;

class SpringSeason{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter month: ");
		String month=sc.next().toLowerCase();
		System.out.print("enter date: ");
		int date=sc.nextInt();
		if(month.equals("march") && (date>=20 && date<=31)){
			System.out.println("spring season");
		}
		else if(month.equals("april")&& (date>=1 && date<=30)){
			System.out.println("spring season");
		}
		else if(month.equals("may")&& (date>=1 && date<=31)){
			System.out.println("spring season");
		}
		else if(month.equals("june")&& (date>=1 && date<=20)){
			System.out.println("spring season");
		}
		else{
			System.out.println("not");
		}
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



			