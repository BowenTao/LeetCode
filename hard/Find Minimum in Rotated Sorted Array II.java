/*

    Follow up for "Find Minimum in Rotated Sorted Array":
    What if duplicates are allowed?

    Would this affect the run-time complexity? How and why?

Suppose a sorted array is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

Find the minimum element.

The array may contain duplicates.
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
