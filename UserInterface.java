import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface {
	public static void main(String [] args) {
		Scanner uI = new Scanner(System.in);
		System.out.println("Welcome to the compound interest calculator.");
		System.out.println("First off, can you tell me your principle");
		boolean inputBad = true;
		double principle =0;
		while (inputBad) {
			try {
				principle = uI.nextDouble();
				inputBad = false;
			}
			catch(InputMismatchException e) {
				System.out.println("Invalid Input!");
				
			}
		}
		inputBad = true;
		double interestRate=0;
		while (inputBad) {
			System.out.println("What is your expected rate of return?");
			try {
				interestRate = uI.nextDouble();
				inputBad = false;
			}
			catch(InputMismatchException e) {
				System.out.println("Invalid Input!");
				
			}
		}
		inputBad = true;
		double interestVariability=0;
		while (inputBad) {
			System.out.println("What is the expected variability in your rate of return?");
			try {
				interestVariability = uI.nextDouble();
				inputBad = false;
			}
			catch(InputMismatchException e) {
				System.out.println("Invalid Input!");
				
			}
		}
		System.out.println("How long is your term?");
		inputBad = true;
		int time=0;
		while (inputBad) {
			try {
				time = uI.nextInt();
				inputBad = false;
			}
			catch(InputMismatchException e) {
				System.out.println("Invalid Input!");
				
			}
		}
		Calculator.calculate(principle, interestRate, interestVariability, time);
		uI.close();
	}
}
