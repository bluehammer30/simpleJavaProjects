
//Isaac Rowaiye
import java.util.*;

public class Isaacchap6 {

	public static int getNthPrime(int prime) {
		// create an array which will hold all the prime numbers
		int[] getNthPrime = new int[prime];
		int p = 0;
		int number = 0;
		
		while (p < prime) {
			if (isPrime(number) == true) {
				getNthPrime[p] = number;
				p++;
			}
			number++;
		}
		

		// iterating through the array assigning prime numbers to each index
//		for (int i = 0; i < prime; i++) {
//			getNthPrime[i] = p;
//
//			// how do I get the number n to plug into my boolean function??
//		}

		return getNthPrime[prime - 1];
	}

	public static boolean isPrime(int n) {

		boolean isPrime = true;
		int remainder = 0;
		
		if (n == 0 || n == 1) {
			isPrime = false;
		}

		// checking to see if the number n is prime
		for (int i = 2; i < n; i++) {
			// store the remainder of n and i into remainder
			remainder = n % i;
			// if n is divisible by any of i it is not prime.
			if (remainder == 0 || n == 2) {
				isPrime = false;
			}

		}
		return isPrime;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("What prime number (n) do you want");
		Scanner scanner = new Scanner(System.in);
		int prime = scanner.nextInt();

		int nthPrime = getNthPrime(prime);
		
		
		System.out.println("The " +prime +"th" +" prime is " +nthPrime);

		scanner.close();
	}
}


// for every time n is true in isPrime save it to the array getNthPrime.
//Then return the particular index they were asking for. 
