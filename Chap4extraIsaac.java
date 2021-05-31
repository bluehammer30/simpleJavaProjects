import java.util.*;
import java.lang.*;

public class Chap4extraIsaac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creating scanner to allow for user input
		Scanner scanner = new Scanner(System.in); 
		
		// asking user for input and storing the values in variables bill and tender
		System.out.print("Enter the amount of the bill: ");
		double bill = scanner.nextDouble();
		System.out.print("Enter the amount tendered: ");
		double tender = scanner.nextDouble();
		
		double change = tender - bill;
		
		//printing the bill, tender, and change
		System.out.println("Customer's bill: $" +String.format("%.2f", bill));
		System.out.println("Customer tender: $" +String.format("%.2f", tender));
		System.out.println("Customer's change: $" +String.format("%.2f", change));
		
		System.out.println("Please give the customer back: \n");
		
		//evaluating the amount of dollars to give in change
		int dollars = (int) Math.floor(change);
		
		/*int  hChange = (int) (change / 2);
		int dollars = hChange * 2;
		if (change < 1) {
			dollars = 0;
		}
		*/
//		else if (change - 0.5 > dollars) {
//			dollars += 1;
//		}
		System.out.println("Dollars: " + dollars);
		
		double coins = change - dollars;
		int quarter = 0;
		int dime = 0;
		int nickel = 0;
		int penny = 0;
		int cents = (int) Math.ceil(coins * 100) + 1 ;
		
		//evaluating the amount of coins to give in change
		//if remaining cents are greater than or equal to 25 give a quarter
		for (int i = 0; i < 3; i++) {
			if (cents >= 25 ) {
				quarter++;
				cents -= 25;
			} 
		}
		//if remaining cents are greater than or equal to 10 give a dime
		for (int i = 0; i < 2; i++) {
			if (cents >= 10) {
				dime++;
				cents -= 10;
			}
		}
		// if remaining cents are greater than or equal to 5 give a nickel
		for (int i = 0; i < 1; i++) {
			if (cents > 5) {
				nickel++;
				cents -= 5;
			}
		}
		// if remaining cents are greater than or equal to 1 give a penny
		for (int i = 0; i < 5; i++) {
			if (cents > 1) {
				penny++;
				cents -= 1;
			}
		}
		//print out the change you will give the customer
		System.out.println("Quarters: " +quarter);
			System.out.println("Dimes: " +dime);
			System.out.println("Nickels: " +nickel);
			System.out.println("Pennies: " +penny);
		}
	}


