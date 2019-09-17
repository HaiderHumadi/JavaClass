import java.util.Scanner;

public class Homework5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		// This varable doesn't have a value yet.
		double finale;
		
		//Ask the name of the user
		System.out.println("What is your name?");
		
		String name = keyboard.nextLine();
		
		//Ask the hourly of the user
		System.out.println("What is your hourly?");
		double hourly = keyboard.nextDouble();
		
		
		//Ask the hours work from the user
		System.out.println("How many hours did you work?");
		double hoursWork = keyboard.nextDouble();
		
		//if the hours are less than or equal to 40 hours you don't get overtime
		if (hoursWork <= 40) {
			
			finale = hoursWork * hourly;
			
			System.out.println("Hello " + name +" Your hourly without overtime is " + finale);
			
		}
		
		//if the hours are greater than 40 you get overtime which is time and half
		if (hoursWork > 40) {
			
finale = (hoursWork * 1.5) * hourly;
			
			System.out.println("Hello " + name + " Your hourly without overtime is " + finale);
			
		}
		
		
		
	}

}
