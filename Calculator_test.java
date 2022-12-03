package calproject;

import java.util.Scanner;

public class Calculator_test {
	/**
	 * This class is used to perform Arithmetic operations
	 * 
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, b, div;
		int sum = 0, diff = 0, mul = 1;

		/** Accepting input from Scanner class to perform desired operation */
		Scanner s = new Scanner(System.in);
		int op;
		System.out.println("Which operation do you want to perform(0-3):");
		op = s.nextInt();

		/**
		 * Displaying the message on the console from the input given by user for the
		 * chosen operation(0-addition,1-subtraction,2-multiplication,3-division
		 */
		if (op == 0) {
			System.out.println("You choose to perform addition");
		} else if (op == 1) {
			System.out.println("You choose to perform subtraction");
		} else if (op == 2) {
			System.out.println("You choose to perform Multiplication");
		} else if (op == 3) {
			System.out.println("You choose to perform  Division");
		} else
			System.out.println("You choose wrong input, please enter between 0-3");

		/**
		 * Switch-Case statements are used to perform the necessary arithmetic
		 * operations based on the choice given by user
		 */

		switch (op) {

		case 0:
			int n;
			/**
			 * Taking "N" input values from Scanner class to find out on how many numbers
			 * addition is to be performed
			 */

			System.out.println("enter the value for n:");
			Scanner s1 = new Scanner(System.in);
			n = s1.nextInt();
			System.out.print("enter " + n + " values:");

			/**
			 * For loop is used to add all the values for the given value of n(where n is
			 * the size )
			 */
			for (int i = 0; i < n; i++) {
				int val = s1.nextInt();
				sum = sum + val;
			}
			System.out.println("The sum of " + n + "  :" + sum);
			s1.close();
			break;

		case 1:
			int n1;
			/**
			 * Taking "N1" (on how many numbers subtraction needs to be performed) from
			 * Scanner class
			 */

			System.out.println("enter the value for n1:");
			Scanner s2 = new Scanner(System.in);
			n1 = s2.nextInt();

			/**
			 * First number for the given "N" numbers to be subtracted is taken from the
			 * Scanner class
			 */
			System.out.println("enter the first number to subtract:");
			diff = s2.nextInt();
			System.out.print("enter " + n1 + " values:");

			/** Using for loop to iterate for the "N" numbers to perform subtraction */
			for (int i = 2; i <= n1; i++) {
				int val = s2.nextInt();
				diff = diff - val;
			}

			System.out.println("the diff  is :" + diff);
			s2.close();
			break;

		case 2:
			int n2;
			/**
			 * Taking "N2" (on how many numbers Multiplication needs to be performed) from
			 * Scanner class
			 */

			System.out.println("enter the value for n2:");
			Scanner s3 = new Scanner(System.in);
			n2 = s3.nextInt();
			System.out.print("enter " + n2 + " values:");

			/** Using for loop to iterate for the "N2" numbers to perform Multiplication **/

			for (int i = 0; i < n2; i++) {
				int val = s3.nextInt();
				mul = val * mul;
			}

			System.out.println("the multiplication is  :" + mul);
			s3.close();
			break;

		case 3:

			/** Taking a,b values from Scanner class */

			System.out.println("ente the values for a and b:");
			Scanner s4 = new Scanner(System.in);
			a = s4.nextInt();
			b = s4.nextInt();
			/** Checking the value for b and if value is "0" display a error message */
			if (b == 0) {
				System.out.println("Division is not performed");

			}
			/** Perform the division on two numbers */
			else {
				div = a / b;
				System.out.println("Division is :" + div);
			}
			break;
		}// switch

		s.close();
	}
}
