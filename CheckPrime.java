package modules;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int j, num, flag = 0;
		System.out.print("Enter the number :");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		for (j = 2; j < num; j++) {
			if (num % j == 0) {
				flag = 0;
				break;
			} else {
				flag = 1;
			}
		}
		if (flag == 1) {
			System.out.println("" + num + " is a prime number.");
		} else {
			System.out.println("" + num + " is not a prime number.");
		}
	}

}
