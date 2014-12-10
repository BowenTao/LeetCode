/*Suppose a sorted array is rotated at some pivot unknown to you beforehand.
 *
 *(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 *
 *Find the minimum element.
 *
 *You may assume no duplicate exists in the array.
*/

public class Solution {
    public int findMin(int[] num) {
        int index=0;
        if (num.length==0 || num.length==1){
        	return num[0];
        }
		for (int i=1;i<num.length;i++){
			if (num[0]>num[i]){
				index=i;
				break;
			}
		}
        return num[index];
    }
}
