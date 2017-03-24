package Backtracking;

import java.util.Arrays;

public class NQueen {
	static int[] solution;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nQueen(9);
	}
	public static void nQueen(int n) {
		solution = new int[n];
		Arrays.fill(solution, -1);
//		if (backtrack(0)) {
//			// print solution
//			printSolution(solution);
//		}
		// print out all solution
		backtrack(0);
	}
	private static void printSolution(int[] Solution) {
		System.out.println("new solution found:");
		for (int i = 0; i < solution.length; i++) {
			for (int j = 0; j < solution[i]; j++) {
				System.out.print("__");
			}
			System.out.print("QQ");
			for (int j = solution[i] + 1; j < solution.length; j++) {
				System.out.print("__");
			}
			System.out.println();
		}
	}
	private static boolean backtrack(int n) {
		if (n == solution.length) {
			printSolution(solution);
			return true;
		}
		for (int i = 0; i< solution.length; i++) {
			if (isValid(n, i, solution)) {
				solution[n] = i;
//				if (backtrack(n+1)) return true;
				// print out all solution
				backtrack(n+1);
			}
		}
		return false;
	}
	private static boolean isValid(int n, int x, int[] solution) {
		if (n != 0) {
			// current y = n, current x = newValue
			for (int i = n - 1; i >= 0; i--) {
				// pre y = i, pre x = solution[i]
				// check column
				int preX = solution[i];
				if (preX == x) return false;
				// check diagonal
				int diff = n - i;
				if ((preX + diff) < solution.length && (preX + diff) == x) return false;
				if ((preX - diff) >= 0 && (preX - diff) == x) return false;
			}
		}
		return true;
	}
	
}
