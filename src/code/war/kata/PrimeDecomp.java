package code.war.kata;

import java.util.concurrent.TimeUnit;

import code.war.util.PrimeNumbersUtil;

public class PrimeDecomp {

//	public static String factors(double n) {
//		if (n <= 2) {
//			return n + "";
//		}
//		int primeNumber = 2;
//		double result = 0;
//		int primeCounter = 0;
//		boolean primeChanged = false;
//		int prevPrime = primeNumber;
//		int prevCounter;
//		do {
//			result = n / primeNumber;
//			while (result % 1 != 0) {
//				primeNumber = (int) PrimeNumbersUtil.getNextPrime(primeNumber);
//				primeChanged = true;
//				result = n / primeNumber;
//				primeCounter = 0;
//			}
//			n = result;
//			prevCounter = ++primeCounter;
//
//			prevPrime = primeNumber;
//			if (primeChanged) {
//				System.out.println(prevPrime + "----> " + prevCounter);
//			}
//		} while (result != 1);
//
//		return "";
//	}

	public static String factors(int n) {
		String output = "";
		String res = "";
		double primeDivisor = 2;
		while (n > 1) {
			res = findFactor(n, primeDivisor);
			n = Double.valueOf(res.substring(0, res.indexOf(","))).intValue();
			primeDivisor = PrimeNumbersUtil.getNextPrime(primeDivisor);
			output += buildStringPattern(res);
			if (PrimeNumbersUtil.isNumberPrime(n)) {
				output += "(" + n + ")";
				break;
			}
		}
		return output;
	}

	public static String findFactor(double input, double primeNum) {
		String output = "";
		int counter = 0;
		double result = 1;
		boolean isInputPrime = PrimeNumbersUtil.isNumberPrime(input);
		if (isInputPrime) {
			primeNum = input;
			counter = 1;
		}
		while (result % 1 == 0 && !isInputPrime) {
			result = input / primeNum;
			if (result % 1 == 0) {
				counter++;
				input = result;
			}
		}
		output = (int) input + "," + (int) primeNum + "," + counter;
		return output;
	}

	public static String buildStringPattern(String input) {
		String output = "";
		if (input != "" && input.length() >= 5) {
			int firstCommaIndex = input.indexOf(",");
			int lastCommaIndex = input.lastIndexOf(",");
			String primeNum = input.substring(firstCommaIndex + 1, lastCommaIndex);
			String primeCounter = input.substring(lastCommaIndex + 1);

			Integer counter = new Integer(primeCounter);
			if (counter > 1) {
				output = "(" + primeNum + "**" + primeCounter + ")";
			} else if (counter == 1) {
				output = "(" + primeNum + ")";
			} else {
				output = "";
			}
		}

		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 933555431;
		int n1 = 342217392;
		int n3 = 7919;
		long startTime = System.nanoTime();

		System.out.println(factors(24419173));

		long endTime = System.nanoTime();
		double totalTime = endTime - startTime;
		System.out.println(totalTime / 1000000000);
	}

}
