package Backtracking;

import java.util.HashMap;
import java.util.Map;

public class EnumeratePermutations2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		enumeratePermutation();
	}
	public static void enumeratePermutation(){
		char[] standard = {'a', 'a', 'b', 'c'};
		Map<Character, Integer> map = new HashMap<>();
		for (char chr : standard) {
			if (map.containsKey(chr)) {
				map.put(chr, map.get(chr) + 1);
			} else {
				map.put(chr, 1);
			}
		}
		char[] solution = new char[standard.length];
		backtrack(0, solution, map);
	}
	private static void backtrack(int n, char[] solution, Map<Character,Integer> map) {
		if (n == solution.length) {
			for (char chr : solution) {
				System.out.print(chr);
			}
			System.out.println();
			return;
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 0) {
				map.put(entry.getKey(), entry.getValue() - 1);
				solution[n] = entry.getKey();
				backtrack(n+1, solution, map);
				map.put(entry.getKey(), entry.getValue() + 1);
			}
		}
	}
}
