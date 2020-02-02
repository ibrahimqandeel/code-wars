package code.war.test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

import code.war.sort.HeapSort;

class HeapSortTest {

	@Test
	void sortTest1() {
		assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, HeapSort.sort(new int[] { 5, 4, 3, 2, 1 }));
	}

	@Test
	void sortTest2() {
		assertArrayEquals(new int[] { 1, 2, 4, 6, 8, 10, 33, 55, 80, 81 },
				HeapSort.sort(new int[] { 55, 10, 8, 6, 80, 2, 81, 1, 4, 33 }));
	}

	@Test
	void sortTest3() {
		assertArrayEquals(new int[] { 1, 2, 3 }, HeapSort.sort(new int[] { 1, 2, 3 }));
	}

	@Test
	void sortTest4() {
		assertArrayEquals(new int[] {}, HeapSort.sort(new int[] {}));
	}

	@Test
	void sortTest5() {
		assertArrayEquals(new int[] { 5 }, HeapSort.sort(new int[] { 5 }));
	}

	@Test
	void sortTest6() {
		assertArrayEquals(new int[] { 1, 2 }, HeapSort.sort(new int[] { 2, 1 }));
	}

	@Test
	void sortTest7() {
		assertArrayEquals(new int[] { 2, 3, 5, 8, 10, 16, 20, 101 },
				HeapSort.sort(new int[] { 8, 2, 10, 5, 3, 101, 20, 16 }));
	}

	@Test
	void sortTest8() {
		assertArrayEquals(new int[] { 10, 20, 30, 40 }, HeapSort.sort(new int[] { 10, 20, 30, 40 }));
	}

	@Test
	void sortTest9() {
		assertArrayEquals(new int[] { -8, -1, 0, 2, 54 }, HeapSort.sort(new int[] { 0, -1, 2, 54, -8 }));
	}

	@Test
	void sortTest10() {
		assertArrayEquals(new int[] { 10, 10, 10, 10 }, HeapSort.sort(new int[] { 10, 10, 10, 10 }));
	}

}
