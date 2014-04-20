/**
 * Project Euler Problem 10 
 * 
 * @author anupkhadka
 */

package projecteuler;

public class P10 {
	/**Check to see if the int value is a prime number or not
	 * @param int value to test
	 * @return true if prime, false otherwise
	 */
	public static boolean isPrime(int num) {
		if(num == 2) {
			return true;
		} else if(num <= 1 || num % 2 == 0) {
			//any number <= 1 is not prime
			//even numbers are not prime
			return false;
		}		
	
		for(int i = 3; i * i <= num; i+=2) {
			if(num % i == 0) {
				return false;
			}		
		}
		return true;
	}

	/**
     * @param args
	 */	
	public static void main(String args[]) {
		long sum = 2;
		long start, end;
	
		start = System.currentTimeMillis();
	
		for(int i = 3; i < 2000000; i++) {
			if(isPrime(i))	sum += i;
		} 
	
		end = System.currentTimeMillis();
		System.out.println("Answer    : "+ sum);	
		System.out.println("Time (ms) : "+ (end-start));	
	}
}
