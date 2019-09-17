import java.util.Scanner;
public class Problem_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		
		
		//Ask User each age
		System.out.println("Enter first age");
		
		int age1 = keyboard.nextInt();
		
		System.out.println("Enter second age");
		
		int age2 = keyboard.nextInt();
		
		System.out.println("Enter third age");
		
		int age3 = keyboard.nextInt();
		
		
		
		//Sees which age is Younger
	if (age1 <= age2 && age1 <= age3) {
		
		System.out.println("Age 1 is Younger");
	}
	
if (age2 <= age3 && age2 <= age1) {
		
		System.out.println("Age 2 is Younger");
	}

if (age3 <= age1 && age3 <= age2) {
	
	System.out.println( "Age 3 is Younger");
}


//Sees which age is Older
if (age1 >= age2 && age1 >= age3) {
	
	System.out.println("Age 1 is Older");
}

if (age2 >= age3 && age2 >= age1) {
	
	System.out.println("Age 2 is Older");
}

if (age3 >= age1 && age3 >= age2) {

System.out.println( "Age 3 is Older");
}


	}

}
