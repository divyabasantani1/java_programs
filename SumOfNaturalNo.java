package modules;

import java.util.Scanner;

public class SumOfNaturalNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("enter no:");

		int num = sc.nextInt();

		int i, sum = 0;

		for (i = 1; i <= num; ++i) {

			sum = sum + i;
		}
		// prints the sum
		System.out.println("Sum of  Natural Numbers is = " + sum);
	}

}
