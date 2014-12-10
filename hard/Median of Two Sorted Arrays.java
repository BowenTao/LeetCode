/*There are two sorted arrays A and B of size m and n respectively. Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
*/

public class Solution {
    public double findMedianSortedArrays(int A[], int B[]) {
        int[] C=new int[A.length+B.length];
		if (C.length==0){
			return 0.0;
		}
		if (C.length==1){
			if (A.length==0){
				System.arraycopy(B, 0, C, 0, B.length);
			}else{
				System.arraycopy(A, 0, C, 0, A.length);
			}
			return (double)C[0];
		}
		if (A.length==0){
			System.arraycopy(B, 0, C, 0, B.length);
		}else if (B.length==0){
			System.arraycopy(A, 0, C, 0, A.length);
		}else{
			System.arraycopy(A, 0, C, 0, A.length);
			System.arraycopy(B, 0, C, A.length, B.length);
		}
		Arrays.sort(C);
        double median;
        if (C.length%2==0){
        	median=(C[C.length/2]+C[C.length/2-1])/2.0;
        }else{
        	median=C[C.length/2];
        }
        return median;
    }
}
