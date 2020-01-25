package code.war.test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import code.war.kata.SortOddsInArray;
import code.war.sort.MergeSort;

class MergeSortTest {

	@Test
	public void mergeSortMethodTest1() {
		int[] unsortedArrayTest1 = new int[] { 5, 3, 2, 8, 1, 4 };
		MergeSort.mergeSort(unsortedArrayTest1);
		assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 8 }, unsortedArrayTest1);
	}

	@Test
	public void mergeSortMethodTest2() {
		int[] unsortedArrayTest2 = new int[] { 8, 4, 25, 1, 5, 2, 0, 5, 7, 5 };
		MergeSort.mergeSort(unsortedArrayTest2);
		assertArrayEquals(new int[] { 0, 1, 2, 4, 5, 5, 5, 7, 8, 25 }, unsortedArrayTest2);
	}

	@Test
	public void mergeMethodTest1() {
		int[] leftArray = new int[] { 1, 4, 8, 25 };
		int[] rightArray = new int[] { 0, 1, 2, 4, 5 };
		int[] mergedArray = new int[leftArray.length + rightArray.length];
		MergeSort.merge(mergedArray, leftArray, rightArray);
		assertArrayEquals(mergedArray, new int[] { 0, 1, 1, 2, 4, 4, 5, 8, 25 });
	}

	@Test
	public void mergeMethodTest2() {
		int[] leftArray = new int[] { 5 };
		int[] rightArray = new int[] { 0 };
		int[] mergedArray = new int[leftArray.length + rightArray.length];
		MergeSort.merge(mergedArray, leftArray, rightArray);
		assertArrayEquals(mergedArray, new int[] { 0, 5 });
	}
}
