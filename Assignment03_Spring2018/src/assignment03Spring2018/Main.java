/***
 * Name: Greg Blodgett
 * Assignment number: Assignment03 
 * Course #, and section: Course 2045, Section 1
 * Due date: 1/30/2018
 * Description: This is a program that checks whether a BigInt is prime
 * Citations: 
 * Anything else:
 */

package assignment03Spring2018;

import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {
		//Construct an object of type BigIntPrime
		//Test whether 1 is prime
		//Expected: false
		BigIntPrime test1 = new BigIntPrime();
		boolean result1 = test1.isPrime(BigInteger.valueOf(1));
		//Test whether 2 is prime
		//Expected: true
		BigIntPrime test2 = new BigIntPrime();
		boolean result2 = test2.isPrime(BigInteger.valueOf(2));
		//Test whether 7700000070077 is prime
		//Expected: False
		BigIntPrime test3 = new BigIntPrime();
		boolean result3 = test3.isPrime(BigInteger.valueOf(7700000070077L));
		//Test whether 179426549 is prime
		//Expected: true
		BigIntPrime test4 = new BigIntPrime();
		boolean result4 = test4.isPrime(BigInteger.valueOf(179426549));
		//Check if all the test cases turn out as expected.
		if(result1==false && result2==true && result3== false && result4==true)
		{
			//If it is print out a message saying so
			System.out.println("Your program works!!");
		}
		else
		{
			//If not say the program doesnt work
			System.out.println("Your program doesnt work...");
		}
	}

}
