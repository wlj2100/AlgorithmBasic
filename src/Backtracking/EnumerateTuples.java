package Backtracking;

public class EnumerateTuples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		enumerateTuples(2);
	}
	public static void enumerateTuples(int n){
		int[] solution = new int[n];
		backtrack(0, solution);
	}
	private static void backtrack(int i, int[] solution) {
		if (i == solution.length) {
			print(solution);
			return;
		}
		for (int j = 0; j < 10; j++) {
			solution[i] = j;
			backtrack(i+1, solution);
		}
	}
	private static void print(int[] solution) {
		for (int i : solution) {
			System.out.print(i + ", ");
		}
		System.out.println();
	}
}
