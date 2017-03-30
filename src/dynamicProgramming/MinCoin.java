package dynamicProgramming;

import java.util.Arrays;

import utility.Print;

public class MinCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = {1, 3, 5};
		int target = 11;
		int result = minCoin(coin, target);
		System.out.println(result);
	}
	private static int minCoin(int[] coin, int target) {
		int[] state = new int[target + 1];
		Arrays.fill(state, Integer.MAX_VALUE);
		state[0] = 0;
		for (int i = 0; i < coin.length; i++) {
			state[coin[i]] = 1;
		}
		for (int i = 1; i <= target; i++) {
			// if current state is not pre-defined
			if (state[i] == Integer.MAX_VALUE) {
				for (int j = 0; j < coin.length; j++) {
					if (i - coin[j] > 0 && state[i - coin[j]] != Integer.MAX_VALUE) {
						state[i] = Math.min(state[i], 1 + state[i - coin[j]]);
					}
				}
			}
		}
		Print.print(state);
		return state[target];
	}
}
