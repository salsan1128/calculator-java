import java.util.*;

public class Calculator {
	public static void main(string[] args) {
    	int num1, num2;
		char operation;
		double answer;
		
		Scanner scan = new Scanner(System.in);
		
    	System.out.println("Welcome to my simple calculator!");
		System.out.print("Please enter the first number: ");
		num1 = scan.nextInt();
		
		System.out.println("/n Please enter the operation: ");
		operation = scan.next().charAt(0);
		
		System.out.print("/n Please enter the second number: ");
		num2 = scan.nextInt();
		
		System.out.println("/n Thank you! Calculating...");
		switch(operation) {
			case '+': answer = num1 + num2;
				break;
			case '-': answer = num1 - num2;
				break;
			case '*': answer = num1 * num2;
				break;
			case '/': answer = num1 / num2;
				break;
		}
		System.out.println("Calculation complete! Answer is: " + answer);
   }
}
