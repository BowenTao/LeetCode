//Implement pow(x, n). 

public class Solution {
   public double pow(double x, int n) {
        if (n>=0){
        	return p(x,n);
        }else{
        	return 1.0/p(x, -n);
        }
    }
	
	public double p(double x, int n){
		if (n==0){
			return 1.0;
		}
		double result=p(x, n/2);
		if (n%2==0){
			return result*result;
		}else{
			return result*result*x;
		}
	}
}
