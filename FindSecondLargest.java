package week2.day1;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int temp;

		int num[] = { 3, 2, 11, 4, 6, 7 };

		int size = num.length;

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {

				if (num[i] == num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;

				}
			}

		}

		System.out.println("Second largest character: " + num[size-1]);
	}

}
