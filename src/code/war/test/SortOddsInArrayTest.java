package code.war.test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import code.war.kata.SortOddsInArray;

class SortOddsInArrayTest {

	@Test
	public void exampleTest1() {
		assertArrayEquals(new int[] { 1, 3, 2, 8, 5, 4 }, SortOddsInArray.sortArray(new int[] { 5, 3, 2, 8, 1, 4 }));
	}

	@Test
	public void exampleTest2() {
		assertArrayEquals(new int[] { 1, 3, 5, 8, 0 }, SortOddsInArray.sortArray(new int[] { 5, 3, 1, 8, 0 }));
	}

	@Test
	public void exampleTest3() {
		assertArrayEquals(new int[] {}, SortOddsInArray.sortArray(new int[] {}));
	}

}
