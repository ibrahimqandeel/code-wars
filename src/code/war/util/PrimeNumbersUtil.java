package code.war.util;

public class PrimeNumbersUtil {

	public static boolean isNumberPrime(double primeNumber) {
		if (primeNumber <= 1) {
			return false;
		}
		double primeNumsqrt = Math.ceil(Math.sqrt(primeNumber));
		for (int i = 2; i <= primeNumsqrt; i++) {
			if (primeNumber != i && (primeNumber / i) % 1 == 0) {
				return false;
			}
		}

		return true;
	}

	public static double getNextPrime(double primeNum) {
		do {
			primeNum++;
		} while (!isNumberPrime(primeNum));
		return primeNum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
