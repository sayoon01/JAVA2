import java.util.*;
import java.lang.ArithmeticException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.print("Enter dividend : ");
				int dividend = sc.nextInt();
				System.out.print("Enter divisor : ");
				int divisor = sc.nextInt();
				
				System.out.println("Quotient is " + quotient(dividend, divisor));
				break;
			}
			catch (ArithmeticException e) {
				System.out.println("Cannot divide by 0.Try again.");
			}
			catch (InputMismatchException e) {
				System.out.println("You must enter integers. Try again.");
				sc.next();
			}
		}
		sc.close();
	}

	public static int quotient(int a, int b) throws ArithmeticException
	{
		return a/b;
	}
	}