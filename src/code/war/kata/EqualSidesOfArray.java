package code.war.kata;

public class EqualSidesOfArray {

	public static int findEvenIndex(int[] arr) {
		int index = -1;
		int rightSum = 0;
		int leftSum = 0;
		if (arr.length < 2) {
			index = 0;
		}
		for (int i = 1; i < arr.length; i++) {
			rightSum += arr[i];
		}

		for (int i = 1; i < arr.length; i++) {
			if (leftSum == rightSum) {
				index = i - 1;
				break;
			}
			rightSum -= arr[i];
			leftSum += arr[i - 1];
		}

		return index;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 1, 10, -100 };
		System.out.println(findEvenIndex(arr));

	}

}
