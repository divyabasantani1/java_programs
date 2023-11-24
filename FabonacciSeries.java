package modules;

public class FabonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 12, firstTerm = 0, secondTerm = 1;
		System.out.print("fabonacci series till" + n + "term:");

		for (int i = 1; i <= n; ++i) {
			System.out.print(firstTerm + " ");

			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;

		}

	}

}
