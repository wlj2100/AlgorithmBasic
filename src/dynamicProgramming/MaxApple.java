package dynamicProgramming;

public class MaxApple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/*
	 * 平面上有N*M个格子，每个格子中放着一定数量的苹果。
	 * 你从左上角的格子开始， 每一步只能向下走或是向右走，
	 * 每次走到一个格子上就把格子里的苹果收集起来
	 * 这样下去，你最多能收集到多少个苹果。
	 */
	public static int maxApple(int[][] grids) {
		if (grids == null || grids.length == 0 || grids[0].length == 0) return 0;
		int row = grids.length;
		int col = grids[0].length;
		int[][] state = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (i > 0 && j > 0) state[i][j] = grids[i][j] 
						+ Math.max(state[i-1][j], state[i][j-1]);
				else if (i == 0 && j > 0) state[i][j] = grids[i][j] + state[i][j-1];
				else if (i > 0 && j == 0) state[i][j] = grids[i][j] + state[i- 1][j];
				else state[i][j] = grids[i][j];
			}
		}
		return state[row-1][col-1];
	}
}
