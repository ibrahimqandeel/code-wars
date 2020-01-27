package code.war.kata;

import code.war.util.PrimeNumbersUtil;

public class PrimeDecomp {

	public static String factors(double n) {
		if (n <= 2) {
			return n + "";
		}
		int primeNumber = 2;
		double result = 0;
		int primeCounter = 0;
		do {
			result = n / primeNumber;
			while (result % 1 != 0) {
				primeNumber = (int) PrimeNumbersUtil.getNextPrime(primeNumber);
				result = n / primeNumber;
				primeCounter = 0;
			}
			n = result;
			primeCounter++;
			System.out.println(primeNumber + "----> " + primeCounter);
		} while (result != 1);

		return "";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factors(86240));
	}

}
