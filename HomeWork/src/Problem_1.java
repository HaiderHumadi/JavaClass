import java.util.Scanner;

public class Problem_1 {

public static void main(String[] args){

Scanner keyboard = new Scanner(System.in);

System.out.println("This program will read a users 4-bit binary number");

System.out.println("Put your 4 bit binary number -");

//gets the Users Input
String binary = keyboard.nextLine();



//defines the bit to a string
String bit1 = binary.substring(0, 1);
String bit2 = binary.substring(1, 2);
String bit3 = binary.substring(2, 3);
String bit4 = binary.substring(3, 4);


//defines the string to an int.
int BitOne = Integer.parseInt(bit1);
int BitTwo = Integer.parseInt(bit2);
int BitThree = Integer.parseInt(bit3);
int BitFour = Integer.parseInt(bit4);


//does the equation
System.out.println((BitOne * 8 ) + (BitTwo * 4 ) + (BitThree * 2) + (BitFour * 1));
}
}