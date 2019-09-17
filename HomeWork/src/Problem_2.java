import java.util.Scanner;
public class Problem_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		
		int number; //User's Number and each digit
		int one;
		int two;
		int three;
		int four;
		int five;
		
		//Ask the user the number
		System.out.println("Put a 5 digit Number");
		
		number = keyboard.nextInt();
		
		//divides the number the user put to a single digit
		five = number % 10;
        four = (number % 100)/10;
        three = (number % 1000)/100;
        two = (number % 10000)/1000;
        one = number / 10000;
			
        //outputs the number
        System.out.println(one);
        System.out.println(" ");
        System.out.println(two);
        System.out.println(" ");
        System.out.println(three);
        System.out.println(" ");
        System.out.println(four);
        System.out.println(" ");
        System.out.println(five);

	}

}
