import java.util.Scanner;
public class Homework5_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);

		//Ask user input
		System.out.println("Please enter a year");
		int inpute = keyboard.nextInt();
		
		//Calculation for the leap year using boolen exprestion
		if ((inpute % 4 == 0 && inpute % 100 > 0) || (inpute % 400 == 0)) {
			System.out.println(inpute + " THIS IS A LEAP YEAR!");
		}
		else{
			System.out.println(inpute + " THIS IS A NOT A LEAPYEAR!");
		}
	}

}
