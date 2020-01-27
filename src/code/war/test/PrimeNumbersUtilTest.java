package code.war.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import code.war.util.PrimeNumbersUtil;

class PrimeNumbersUtilTest {

	@Test
	void isNumberPrimeMethodTestPrime() {
		assertEquals(true, PrimeNumbersUtil.isNumberPrime(2));
		assertEquals(true, PrimeNumbersUtil.isNumberPrime(3));
		assertEquals(true, PrimeNumbersUtil.isNumberPrime(5));
		assertEquals(true, PrimeNumbersUtil.isNumberPrime(7));
		assertEquals(true, PrimeNumbersUtil.isNumberPrime(11));
		assertEquals(true, PrimeNumbersUtil.isNumberPrime(19));
	}

	@Test
	void isNumberPrimeMethodTestNotPrime() {
		assertEquals(false, PrimeNumbersUtil.isNumberPrime(0));
		assertEquals(false, PrimeNumbersUtil.isNumberPrime(1));
		assertEquals(false, PrimeNumbersUtil.isNumberPrime(4));
		assertEquals(false, PrimeNumbersUtil.isNumberPrime(20));
		assertEquals(false, PrimeNumbersUtil.isNumberPrime(21));
		assertEquals(false, PrimeNumbersUtil.isNumberPrime(100));
	}

	@Test
	void getNextPrimeMethodTest() {
		assertEquals(2, PrimeNumbersUtil.getNextPrime(0));
		assertEquals(2, PrimeNumbersUtil.getNextPrime(1));
		assertEquals(3, PrimeNumbersUtil.getNextPrime(2));
		assertEquals(7, PrimeNumbersUtil.getNextPrime(5));
		assertEquals(11, PrimeNumbersUtil.getNextPrime(7));
		assertEquals(19, PrimeNumbersUtil.getNextPrime(17));
	}

}
