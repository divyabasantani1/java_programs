package modules;

public class DisplayTable {

	static void table(int no) {

		for (int i = 1; i <= 10; i++) {
			System.out.println(+no + " * " + i + " = " + no * i);
			{
				System.out.println();

			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// multiplication table.

		System.out.println("Table of 6=");
		table(6);
		System.out.println("Table of 7");
		table(7);

	}

}
