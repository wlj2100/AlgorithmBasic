package Backtracking;

import java.util.Arrays;

public class EightQueen {
	static int[] solution;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void nQueen(int n) {
		solution = new int[n];
		Arrays.fill(solution, -1);
		backtrack(0);
	}
	private static boolean backtrack(int n) {
		if (n == solution.length) {
			return true;
		}
		for (int i = 0; i< solution.length; i++) {
			if (isValid(n, i, solution)) {
				solution[n] = i;
				if (backtrack(n+1)) return true;
			}
		}
		return false;
	}
	private static boolean isValid(int n, int newValue, int[] solution) {
		if (n != 0) {
			// check column
			// check diagonal
		}
		return true;
	}
	
}
