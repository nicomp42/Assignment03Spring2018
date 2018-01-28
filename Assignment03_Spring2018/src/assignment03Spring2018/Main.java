/***
 * Name: Greg Blodgett
 * Assignment number: Assignment03 
 * Course #, and section: Course 2045, Section 1
 * Due date: 1/30/2018
 * Description: This is a program that checks whether a BigInt is prime
 * Citations: BigPrime.net
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
		//Print out the results
		if(result1==true) {System.out.println("1 is prime");}
		else {System.out.println("1 is not prime");}
		//Test whether 2 is prime
		//Expected: true
		BigIntPrime test2 = new BigIntPrime();
		boolean result2 = test2.isPrime(BigInteger.valueOf(2));
		if(result2==true) {System.out.println("2 is prime");}
		else {System.out.println("2 is not prime");}
		//Test whether 7700000070077 is prime
		//Expected: False
		BigIntPrime test3 = new BigIntPrime();
		boolean result3 = test3.isPrime(BigInteger.valueOf(7700000070077L));
		if(result3==true) {System.out.println("7700000070077 is prime");}
		else {System.out.println("7700000070077 is not prime");}
		//Test whether 179426549 is prime
		//Expected: true
		BigIntPrime test4 = new BigIntPrime();
		boolean result4 = test4.isPrime(BigInteger.valueOf(179426549));
		if(result4==true) {System.out.println("179426549 is prime");}
		else {System.out.println("179426549 is not prime");}
		//Check whether 1000000000000000000 is prime
		//Expected: false
		BigIntPrime test5 = new BigIntPrime();
		boolean result5 = test5.isPrime(BigInteger.valueOf(1000000000000000000L));
		if(result5==true) {System.out.println("1000000000000000000 is prime");}
		else { System.out.println("1000000000000000000 is not prime");}
		//Check if all the test cases turn out as expected.				
		if(result1==false && result2==true && result3== false && result4==true && result5==false)
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
