package assignment03Spring2018;

import java.math.BigInteger;

public class BigIntPrime {
	public boolean isPrime(BigInteger number)
	{
		boolean result = true;// Assume number is prime until we prove otherwise 
		if (number.equals(BigInteger.ONE)) {return false;}		// One is not prime AND not non-prime. How should we handle this? 
		BigInteger divisor = new BigInteger("2"); 
		BigInteger limit = number.divide(new BigInteger("2"));
		limit = limit.add(BigInteger.ONE); 
		// Loop until the divisor is >= half of the original number 
		while (true) { 
			if (limit.equals(divisor)) {break;}		// We're done
		 
			if (number.mod(divisor).equals(BigInteger.ZERO)) {	// Does divisor divide evenly into our number? If so, we're not prime. Time to quit. 
				result = false;
				break;
			}
			divisor = divisor.add(BigInteger.ONE); 
		} 
		return result;
	}

}
