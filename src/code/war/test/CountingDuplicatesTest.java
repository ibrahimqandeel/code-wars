package code.war.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import code.war.kata.CountingDuplicates;

class CountingDuplicatesTest {

	@Test
	public void abcdeReturnsZero() {
		assertEquals(0, CountingDuplicates.duplicateCount("abcde"));
		assertEquals(0, CountingDuplicates.cleverDuplicateCount("abcde"));
	}

	@Test
	public void abcdeaReturnsOne() {
		assertEquals(1, CountingDuplicates.duplicateCount("abcdea"));
		assertEquals(1, CountingDuplicates.cleverDuplicateCount("abcdea"));
	}

	@Test
	public void indivisibilityReturnsOne() {
		assertEquals(1, CountingDuplicates.duplicateCount("indivisibility"));
		assertEquals(1, CountingDuplicates.cleverDuplicateCount("indivisibility"));
	}

	@Test
	public void abac1ff1bReturnFour() {
		assertEquals(4, CountingDuplicates.duplicateCount("abac1ff1b"));
		assertEquals(4, CountingDuplicates.cleverDuplicateCount("abac1ff1b"));
	}

	@Test
	public void reallyLongStringContainingDuplicatesReturnsThree() {
		String testThousandA = new String(new char[1000]).replace('\0', 'a');
		String testHundredB = new String(new char[100]).replace('\0', 'b');
		String testTenC = new String(new char[10]).replace('\0', 'c');
		String test1CapitalA = new String(new char[1]).replace('\0', 'A');
		String test1d = new String(new char[1]).replace('\0', 'd');
		String test = test1d + test1CapitalA + testTenC + testHundredB + testThousandA;

		assertEquals(3, CountingDuplicates.duplicateCount(test));
		assertEquals(3, CountingDuplicates.cleverDuplicateCount(test));
	}
}
