package Backtracking;

public class EnumerateCombinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		enumerateCombination(5);
	}
	public static void enumerateCombination(int n) {
		if (n < 1) return;
		boolean[] solution = new boolean[n];
		backtrack(0, solution);
	}
	private static void backtrack(int n, boolean[] solution) {
		if (n == solution.length) {
			for (int i = 0; i < n; i++) {
				if (solution[i]) {
					System.out.print(i);
				}
			}
			System.out.println();
			return;
		}
		solution[n] = false;
		backtrack(n+1, solution);
		solution[n] = true;
		backtrack(n+1, solution);
	}
}
