import java.util.Scanner;
public class Homework5_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		int secret1 = 1;
		int secret2 = 2;
		int secret3 = 3;
		int secret4 = 4;
		int secret5 = 5;
		
		
		System.out.println("Please enter your first number");
		
		int Input1 = keyboard.nextInt();
		
	System.out.println("Please enter your second number");
		
		int Input2 = keyboard.nextInt();

	System.out.println("Please enter your third number");
		
		int Input3 = keyboard.nextInt();
		
	System.out.println("Please enter your fourth number");
		
		int Input4 = keyboard.nextInt();
		
	System.out.println("Please enter your fifth number");
		
		int Input5 = keyboard.nextInt();
		
		if (Input1 == 1) {
			System.out.println("Your first number is correct");
			int newtotal =  +Input1;
			int totalr = 1;


		}
		if (secret2 == Input2) {
			System.out.println("Your second number is correct");
			int newtotal = + Input2;
			int totalr = 1;
		}
		if (secret3 == Input3) {
			System.out.println("Your third number is correct");
			int newtotal = + Input3;
			int totalr = 1;
		}
		if (secret4 == Input4) {
			System.out.println("Your fourth number is correct");
			int newtotal = + Input4;
			int totalr = 1;
		}
		if (secret5 == Input5) {
			System.out.println("Your fifth number is correct");
			int newtotal = + Input5;
			System.out.println("The current amount is " + newtotal);
		}
		
		
		

		
		
		
	}

}
