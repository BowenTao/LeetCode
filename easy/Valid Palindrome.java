/*Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 *For example,
 *"A man, a plan, a canal: Panama" is a palindrome.
 *"race a car" is not a palindrome.
 *
 *Note:
 *Have you consider that the string might be empty? This is a good question to ask during an interview.
 *
 *For the purpose of this problem, we define empty string as valid palindrome. 
*/

public class Solution {
    public boolean isPalindrome(String s) {
        if (s.length()==0 || s.length()==1){
			return true;
		}
		StringBuffer string=new StringBuffer();
		for (int i=0;i<s.length();i++){
			if (Character.isLetterOrDigit(s.charAt(i))){
				string.append(Character.toLowerCase(s.charAt(i)));
			}
		}
		s=string.toString();
		for (int i=0;i<s.length()/2;i++){
			if (s.charAt(i)!=s.charAt(s.length()-1-i)){
				return false;
			}
		}
		return true;
    }
}
