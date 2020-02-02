package code.war.sort;

import code.war.util.CodeWarUtil;

/*
 * Heap Sort Sort Algorithm
 * 
 * Best case ---> O(n log(n))
 * Average case ---> O(n log(n))
 * Worst case ---> O(n log(n))
 * Space complexity ---> O(1) ---> In place 
 */
public class HeapSort {

	public static int[] sort(int[] array) {
		return array;
	}

	public static int[] buildMaxArray(int[] array) {
		int arraySize = array.length;
		int temp;
		int greaterchildIndex;
		for (int i = (arraySize / 2) - 1; i >= 0; i--) {
			if (leftChildIndex(i) < array.length && rightChildIndex(i) < array.length) {
				greaterchildIndex = greaterChildIndex(leftChildIndex(i), rightChildIndex(i), array);
				if (array[i] < array[greaterchildIndex]) {
					temp = array[i];
					array[i] = array[greaterchildIndex];
					array[greaterchildIndex] = temp;
				}
			}
		}

		return array;
	}

	private static int parentIndex(int childIndex) {
		return (childIndex / 2) - 1;
	}

	private static int leftChildIndex(int parent) {
		return 2 * parent + 1;
	}

	private static int rightChildIndex(int parent) {
		return 2 * parent + 2;
	}

	private static int greaterChildIndex(int leftChildIndex, int rightChildIndex, int[] array) {
		if (array[rightChildIndex] >= array[leftChildIndex]) {
			return rightChildIndex;
		}
		return leftChildIndex;
	}

	public static void prineChildren(int[] array) {
		int leftChild;
		int rightChild;
		String print = "";
		for (int i = array.length / 2 - 1; i >= 0; i--) {
			leftChild = 2 * i + 1;
			rightChild = 2 * i + 2;
			if (leftChild < array.length) {
				print = "Parent ---> " + array[i] + " Left Child ---> " + array[leftChild];
			}
			if (rightChild < array.length) {
				print += " And Right Child ---> " + array[rightChild];
			}

			System.out.println(print);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[] { 4, 11, 2, 100, 8, 9, 7, 20, 5 };
//		prineChildren(array);
		CodeWarUtil.printArray(buildMaxArray(array));
	}

}
