import java.util.Scanner;

public class Problem_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		
		//Ask their favorite City
		System.out.println("What is your favorite City?");
		
		
		//converts their answer to a string and separates the first Letter
		String input = keyboard.nextLine();
		String s1 = input.substring(0, 1).toUpperCase();
		
		
		//counts the number of char and capitalizes the first letter
		int length = input.length();
		String nameCapitalized = s1 + input.substring(1);
		
		
		//output
		System.out.println(length);
		
		System.out.println( input.toUpperCase( ) );
		System.out.println( input.toLowerCase( ) );
		System.out.println(nameCapitalized);
		
	}

}
