/*Given a non-negative number represented as an array of digits, plus one to the number.
 *
 *The digits are stored such that the most significant digit is at the head of the list.
*/

public class Solution {
    public int[] plusOne(int[] digits) {
        int one=1;
        for (int i=digits.length-1;i>=0;i--){
        	int digit=(digits[i]+one)%10;
        	one=(digits[i]+one)/10;
        	digits[i]=digit;
        	if (one==0){
        		return digits;
        	}
        }
        int[] a=new int[digits.length+1];
        a[0]=1;
        return a;
    }
}
