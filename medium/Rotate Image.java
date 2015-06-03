/*You are given an n x n 2D matrix representing an image.

Rotate the image by 90 degrees (clockwise).

Follow up:
Could you do this in-place?
*/

public class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for (int layer=0;layer<n/2;layer++){
			int first=layer;
			int last=n-1-layer;
			for (int i=first;i<last;i++){
				int offset=i-first;
				int top=matrix[first][i];//save top
				matrix[first][i]=matrix[last-offset][first];//left->top
				matrix[last-offset][first]=matrix[last][last-offset];//bottom->left
				matrix[last][last-offset]=matrix[i][last];//right->bottom
				matrix[i][last]=top;//top->right
			}
		}
    }
}

public class Solution {
    public void rotate(int[][] matrix) {
        for (int i=0;i<matrix.length;i++){
			for (int j=i;j<matrix.length;j++){
				int temp=matrix[i][j];
				matrix[i][j]=matrix[j][i];
				matrix[j][i]=temp;
			}
		}
		for (int i=0;i<matrix.length;i++){
			for (int j=0;j<matrix.length/2;j++){
				int temp=matrix[i][j];
				matrix[i][j]=matrix[i][matrix.length-1-j];
				matrix[i][matrix.length-1-j]=temp;
			}
		}
    }
}
