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
		BigIntPrime test = new BigIntPrime();
		//Create an array of prime numbers
		BigInteger[] primeNums = new BigInteger[3];
		primeNums[0] = BigInteger.valueOf(2);
		primeNums[1] = BigInteger.valueOf(179426549);
		primeNums[2] = BigInteger.valueOf(-17); //Add in a negative number
		boolean error = false;
		//Write a loop that tests whether each element in the array is prime
		for(int i = 0; i < primeNums.length; i ++)
		{
			boolean result = test.isPrime(primeNums[i]);
			//If it isnt stop the loop
			if(result = false)
			{
				error = true;
				break;
			}
		}
		//If one of the numbers that is prime reads that it is not prime, print out a statement saying that something's wrong
		if(error == true)
		{
			System.out.println("Something is wrong with your program!");
		}
		BigInteger[] NonPrimeNums = new BigInteger[3];
		NonPrimeNums[0] = BigInteger.valueOf(1);
		NonPrimeNums[1] = BigInteger.valueOf(7700000070077L);
		NonPrimeNums[2] = BigInteger.valueOf(1000000000000000000L); 
		boolean errorNonPrime = false;
		//Write a loop that tests whether each element in the array is prime
		for(int i = 0; i < NonPrimeNums.length; i ++)
		{
			boolean resultNonPrimes = test.isPrime(NonPrimeNums[i]);
			//If it isnt stop the loop
			if(resultNonPrimes == true)
			{
				errorNonPrime = true;
				break;
			}
		}
		//If one of the numbers that is not prime reads that it is prime, print out a statement saying that something's wrong
		if(errorNonPrime == true)
		{
			System.out.println("There is something wrong with your program!");
		}
		if(error == false && errorNonPrime == false)
		{
			System.out.println("Your program works!!");
		}
		
	}

}
