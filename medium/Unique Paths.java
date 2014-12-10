/*A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).

The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).

How many possible unique paths are there?

*/

public class Solution {
    public int uniquePaths(int m, int n) {
        int[][] k=new int[101][101];
        k[1][1]=1;
        for (int i=2;i<=n;i++){
            k[1][i]=1;
        }
        for (int j=2;j<=m;j++){
            k[j][1]=1;
        }
        for (int i=2;i<=m;i++){
            for (int j=2;j<=n;j++){
                k[i][j]=k[i-1][j]+k[i][j-1];
            }
        }
        return k[m][n];
    }
}
