//Given an input string, reverse the string word by word. 

public class Solution {
    public String reverseWords(String s) {
		if (s.length()==0){
		    return s;
		}
		String[] s1=s.split("\\s+");
		if (s1.length>0){
			StringBuilder s2=new StringBuilder();
			for (int i=s1.length-1;i>=0;i--){
				if (i>0){
					s2.append(s1[i]);
					s2.append(" ");
				}else{
					s2.append(s1[i]);
				}
			}
			if (s2.charAt(0)==' '){
				s2.deleteCharAt(0);
			}
			if (s2.charAt(s2.length()-1)==' '){
				s2.deleteCharAt(s2.length()-1);
			}
			return s2.toString();
		}else{
			return "";
		}
    }
}
