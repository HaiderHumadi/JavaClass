import java.util.Scanner;

public class Homework5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		
		
		//Declaring the percent to an income
		double onepercent = 50000;
		double twopercent = 75000;
		double threepercent = 100000;
		double fourpercent = 250000;
		double fivepercent = 500000;
		double inf = Double.POSITIVE_INFINITY;
	
		//Ask the user about the income
		System.out.println("What is your income?");
	double income = keyboard.nextDouble();
	
	
	
	
	//Checks which income the user has put
	if (income < onepercent) {
		
		System.out.println("You are in the one percent income class");
		income = income * 0.06;
		System.out.println("Your income tax is " + income);
	}
		
		if (income > onepercent && 75000 >= income) {
			System.out.println("You are in the 2 percent income class");
			
			income = income * 0.06;
			System.out.println("Your income tax is " + income);
		}
			if (income > twopercent && 100000 >= income) {
				
				System.out.println("You are in the 3 percent income class");
				
				income = income * 0.06;
				System.out.println("Your income tax is " + income);
			}
				
				if (income > threepercent && 250000 >= income) {
					
					System.out.println("You are in the 4 percent income class");
					
					income = income * 0.06;
					System.out.println("Your income tax is " + income);
				}
				
					if (income > fourpercent && 500000 >= income ) {
						
						System.out.println("You are in the 5 percent income class");
						
						income = income * 0.06;
						System.out.println("Your income tax is " + income);
					}
						
						if (income > fivepercent && inf >= income) {
							
							System.out.println("You are in the 6 percent income class");
							
							income = income * 0.06;
							System.out.println("Your income tax is " + income);
						}
							
						
					
				
			
			
			
		
		

	}

}
