//Reverse digits of an integer.

public class Solution {
    public int reverse(int x) {
        int tail=0;
		int a=0;
		while(x!=0){
			tail=x%10;
			a=a*10+tail;
			x/=10;
		}
		return a; 
    }
}
