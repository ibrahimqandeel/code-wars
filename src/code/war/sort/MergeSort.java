package code.war.sort;

public class MergeSort {

	public static void mergeSort(int[] dataArray) {
		int arrayLength = dataArray.length;
		if (arrayLength < 2) {
			return;
		}
		int middle = arrayLength / 2;
		int[] left = new int[middle];
		int[] right = new int[arrayLength - middle];
		for (int i = 0; i < left.length; i++) {
			left[i] = dataArray[i];
		}
		for (int i = 0; i < right.length; i++) {
			right[i] = dataArray[middle + i];
		}

		mergeSort(left);
		mergeSort(right);

		merge(dataArray, left, right);
	}

	public static void merge(int[] dataArray, int[] left, int[] right) {
		int d = 0;
		int l = 0;
		int r = 0;
		while (l < left.length && r < right.length) {
			if (left[l] <= right[r]) {
				dataArray[d++] = left[l++];
			} else {
				dataArray[d++] = right[r++];
			}
		}
		while (l < left.length) {
			dataArray[d++] = left[l++];
		}
		while (r < right.length) {
			dataArray[d++] = right[r++];
		}

	}

	public static void main(String args[]) {
	}
}
