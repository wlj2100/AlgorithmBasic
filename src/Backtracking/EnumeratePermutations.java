package Backtracking;

public class EnumeratePermutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		enumeratePermutations(5);
	}
	public static void enumeratePermutations(int n) {
		int[] solution = new int[n];
		int[] used = new int[n];
		backtrack(0, solution, used);
	}
	private static void backtrack(int n, int[] solution, int[] used) {
		if (n == solution.length) {
			for (int i : solution) {
				System.out.print(i + ", ");
			}
			System.out.println();
			return;
		}
		
		for (int i = 0; i < solution.length; i++) {
			if (used[i] == 0) {
				solution[n] = i;
				used[i] = 1;
				backtrack(n+1, solution, used);
				used[i] = 0;
			}
		}
	}
}
