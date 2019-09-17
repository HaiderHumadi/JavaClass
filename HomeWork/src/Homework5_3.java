import java.util.Scanner;

public class Homework5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		int numdMonths = 31;
		int febd = 28;
		
		//What is the month you choose Has to be 1-12;
		
		System.out.println("Please enter a number 1 through 12");
		int month = keyboard.nextInt();
		
		if (month <= 12 && month != 2)
		{
			System.out.println("The number of days is " + numdMonths);
			
		}
		
		if (month == 2) {
			
			System.out.println("The number of months is " + febd);
			
		}
		
	}

}
