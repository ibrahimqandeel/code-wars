package code.war.util;

public class PrimeNumbersUtil {

	public static boolean isNumberPrime(double primeNumber) {
		if (primeNumber <= 1) {
			return false;
		}
		if (primeNumber == 2) {
			return true;
		}
		for (int i = 2; i <= Math.sqrt(primeNumber); i++) {
			if (primeNumber % i == 0) {
				return false;
			}
		}

		return true;
	}

	public static double getNextPrime(double primeNum) {
		if (primeNum <= 1) {
			return 2;
		}
		do {
			primeNum++;
		} while (!isNumberPrime(primeNum));
		return primeNum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getNextPrime(1));
	}
}
