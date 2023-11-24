package modules;

public class oddNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int no = 102;
		System.out.println("List of odd numbers from 1 to " + no + ":");

		for (int i = 0; i <= no; i++) {

			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
	}
}
