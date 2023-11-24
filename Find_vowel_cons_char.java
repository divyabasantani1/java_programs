package modules;

import java.util.Scanner;

public class Find_vowel_cons_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.print("Enter  String: ");
		String str = input.nextLine();

		int vowels = 0, consonant = 0, specialChar = 0, digit = 0;

		// str.length() function to count number of
		// character in given string.
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

				// To handle upper case letters
				ch = Character.toLowerCase(ch);

				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
					vowels++;
				else
					consonant++;
			} else if (ch >= '0' && ch <= '9')
				digit++;
			else
				specialChar++;
		}

		System.out.println("Vowels: " + vowels);
		System.out.println("Consonant: " + consonant);
		System.out.println("Digit: " + digit);
		System.out.println("Special Character: " + specialChar);
	}

}
