package code.war.test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import code.war.sort.MergeSort;
import code.war.sort.QuickSort;

class QuickSortTest {

	@Test
	public void quickSortMethodTest1() {
		int[] unsortedArray = new int[] { 5, 3, 2, 8, 1, 4 };
		QuickSort.sort(unsortedArray, 0, unsortedArray.length - 1);
		assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 8 }, unsortedArray);
	}

	@Test
	public void quickSortMethodTest2() {
		int[] unsortedArray = new int[] { 8, 4, 25, 1, 5, 2, 0, 5, 7, 5 };
		QuickSort.sort(unsortedArray, 0, unsortedArray.length - 1);
		assertArrayEquals(new int[] { 0, 1, 2, 4, 5, 5, 5, 7, 8, 25 }, unsortedArray);
	}

	@Test
	public void quickSortMethodTest3() {
		int[] unsortedArray = new int[] { 10, 10, -1 };
		QuickSort.sort(unsortedArray, 0, unsortedArray.length - 1);
		assertArrayEquals(new int[] { -1, 10, 10 }, unsortedArray);
	}
}
