//Implement atoi to convert a string to an integer.


public class Solution {
    public int atoi(String str) {
		if (str.length()<1 || str==null){
			return 0;
		}
		str=str.trim();
		char bit='+';
		int i=0;
		if (str.charAt(0)=='+'){
			i++;
		}else if (str.charAt(0)=='-'){
			bit='-';
			i++;
		}
		double res=0;
		while (i<str.length() && str.charAt(i)>='0' && str.charAt(i)<='9'){
			res=res*10+(str.charAt(i)-'0');
			i++;
		}
		if (bit=='-'){
			res=-res;
		}
		if (res>Integer.MAX_VALUE){
			return Integer.MAX_VALUE;
		}
		if (res<Integer.MIN_VALUE){
			return Integer.MIN_VALUE;
		}
		return (int)res;
    }
}
