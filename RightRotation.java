package modules;

import java.util.*;

public class RightRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter how many no you rotate");
		int r = sc.nextInt();

		int arr[] = { 1, 2, 3, 4, 5 };

		int size = arr.length;
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < r; i++) {

			int temp = arr[size - 1];
			int j;
			for (j = size - 1; j > 0; j--) {
				arr[j] = arr[j - 1];
			}
			arr[j] = temp;

		}
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
