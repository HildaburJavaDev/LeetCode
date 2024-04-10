package medium;

import java.util.HashSet;
import java.util.Set;

// task №36

public class ValidSudoku {
	public static void main(String[] args) {
		char[][] grid = {
				{ '5', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' },
				{ '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' },
				{ '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' },
				{ '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' },
				{ '.', '.', '.', '.', '8', '.', '.', '7', '9' }
		};
		System.out.println(isValidSudoku(grid));
	}

	public static boolean isValidSudoku(char[][] board) {
		Set<String> setElems = new HashSet<>();
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (board[i][j] != '.') {
					String s = "(" + board[i][j] + ")";
					if (!setElems.add(s + i) || !setElems.add(j + s) || !setElems.add(i / 3 + s + j / 3))
						return false;
				}
			}
		}
		return true;
	}
}
