//Determine whether an integer is a palindrome. Do this without extra space.

public class Solution {
    public boolean isPalindrome(int x) {
		if (x<0){
			return false;
		}
		int divide=1;
		while (x/divide>=10){
			divide*=10;
		}
		while (x!=0){
			int r=x%10;
			int l=x/divide;
			if (l!=r){
				return false;
			}
			x=(x%divide)/10;
			divide/=100;
		}
		return true;
    }
}
