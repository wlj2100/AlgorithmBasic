package test;

import utility.Print;

public class PickRock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Print.print(pickRock(99));
		for (int i = 0; i < 100; i++) {
			System.out.format("i: %d , result: %d%n", i, pickRock(i));
			System.out.format("i: %d , result: %d%n", i, pickRock2(i));
		}
	}
	// n = 1, win
	// n = 2, lose
	/*
	 * n = 3, 1,1,1, win
	 * n = 4, 1,1,1,1 lose
	 * n = 5, 2,1,1,1 lose, 1,1,1,1,1 win
	 * n = 6, 2,1,1,1,1, win
	 * n = 7, 3,1,1,1,1 win, 3,2,2, win, 
	 * n = 8, 3, 1,1,1,1,1 lose, 
	 * n = 9
	 * for any n start with n / 3 + 1
	 */
	public static int pickRock(int n) {
		if (n < 1) return 0;
		if (n == 1) return 1;
		int[] dp = new int[n];
		dp[0] = 1;
		dp[1] = 0;
		for (int i = 2; i < n; i++) {
//			for (int j = (i+1)/2 - 1; j > 0; j--) {
			for (int j = 0; j < i / 2; j++) {
				int first = j + 1, rest = dp[i - first];
				if (rest == 0) {
					dp[i] = Math.max(dp[i], first);
					
				}
			}
		}
		return dp[dp.length - 1];
	}
	// below is the wrong ans
	public static int pickRock2(int n) {
		if (n < 1) return 0;
		if (n == 1) return 1;
		int[] dp = new int[n];
		dp[0] = 1;
		dp[1] = 0;
		for (int i = 2; i < n; i++) {
			for (int j = (i+1)/2 - 1; j > 0; j--) {
//			for (int j = 0; j < i / 2; j++) {
				int first = j + 1, rest = dp[i - first];
				if (rest == 0) {
					dp[i] = Math.max(dp[i], first);
					break;
				}
			}
		}
		return dp[dp.length - 1];
	}
}
