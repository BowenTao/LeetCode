//Given two binary strings, return their sum (also a binary string). 


public class Solution {
    public String addBinary(String a, String b){
       int m=a.length();
        int n=b.length();
        int maxLen=Math.max(m, n);
        int carry = 0;
        String res="";
        for (int i=0;i<maxLen;i++){
        	int p,q;
        	p= i<m ? a.charAt(m-1-i)-'0' : 0;
        	q= i<n ? b.charAt(n-1-i)-'0' : 0;
        	int t=p+q+carry;
        	carry=t/2;
        	res+=t%2;
        }
        StringBuilder r=new StringBuilder();
        for (int i=res.length()-1;i>=0;i--){
        	r.append(res.charAt(i));
        }
        res=r.toString();
        return carry==0 ? res : "1"+res;
    }
}
