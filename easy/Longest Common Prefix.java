//Write a function to find the longest common prefix string amongst an array of strings. 


public class Solution {
    public String longestCommonPrefix(String[] strs) {
		if (strs==null || strs.length<1){
			return "";
		}
		String string=strs[0];
		for (int i=1;i<strs.length;i++){
			int min=Math.min(string.length(), strs[i].length());
			int j=0;
			while (j<min && string.charAt(j)==strs[i].charAt(j)){
				j++;
			}
			string=string.substring(0, j);
		}
		return string;
    }
}
