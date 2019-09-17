import java.util.Scanner;
public class Problem_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		//define string
		String str1 = "";
		
		//Ask user to put a word
		System.out.println("Enter any Word");
		
		//input
		str1 = keyboard.nextLine();
		
		
		//move left twice and move right twice and original
		System.out.println(" " + str1 + " " + " ");
		System.out.println(" " + " "+ " " + str1);
		System.out.println(str1);
	}

}
