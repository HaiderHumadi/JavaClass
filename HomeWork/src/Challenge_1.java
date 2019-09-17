import java.util.Scanner;
public class Challenge_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		String name = "";
		
		System.out.println("Enter your name.");
		name = keyboard.nextLine();
		
		System.out.println("Enter your age.");
		int age = keyboard.nextInt();
		
		
		System.out.println("Enter your desired income.");
		Double annualPay = keyboard.nextDouble();
		
		System.out.println("My name is " + name + ", my age is " + age + " and I hope to earn $" + annualPay + " Per Year.");
		
		

	}

}
