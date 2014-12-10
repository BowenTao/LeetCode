//Determine if a Sudoku is valid

public class Solution {
    public boolean isValidSudoku(char[][] board) {
		for (int i=0;i<board.length;i++){
		    HashSet<Character> correct=new HashSet<Character>();
			for (int j=0;j<board[0].length;j++){
				if (board[i][j]!='.' && !correct.add(board[i][j])){
					return false;
				}
			}
		}
		
		for (int i=0;i<board[0].length;i++){
		    HashSet<Character> correct=new HashSet<Character>();
			for (int j=0;j<board.length;j++){
				if (board[j][i]!='.' && !correct.add(board[j][i])){
					return false;
				}
			}
		}
		
		for (int m=0;m<3;m++){
			for (int n=0;n<3;n++){
				HashSet<Character> correct=new HashSet<Character>();
				for (int i=m*3;i<m*3+3;i++){
					for (int j=n*3;j<n*3+3;j++){
						if (board[i][j]!='.' && !correct.add(board[i][j])){
							return false;
						}
					}
				}
			}
		}
		
		return true;
    }
}
