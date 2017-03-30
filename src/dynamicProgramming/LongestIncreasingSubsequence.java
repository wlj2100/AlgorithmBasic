package dynamicProgramming;

import java.util.Arrays;

import utility.Print;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,6,7,9,4,10,5,6};
		Print.print(findLongest(arr));
	}
	private static int findLongest(int[] nums) {
		if (nums == null || nums.length == 0) return 0;
		int result = 1;
		int[] state = new int[nums.length];
		Arrays.fill(state, 1);
		for (int i = 1; i < nums.length; i++) {
			for (int j = 0; j < i; j++) {
				if (nums[i] > nums[j]) state[i] = Math.max(state[i], state[j] + 1);
			}
			result = Math.max(result, state[i]);
		}
		return result;
	}
}
