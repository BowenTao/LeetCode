/*Given a roman numeral, convert it to an integer.
 *
 *Input is guaranteed to be within the range from 1 to 3999.
*/

public class Solution {
    public int romanToInt(String s) {
		if (s==null || s.length()<1){
			return 0;
		}
		HashMap<Character, Integer> set=new HashMap<Character,Integer>();
		set.put('M', 1000);
		set.put('D', 500);
		set.put('C', 100);
		set.put('L', 50);
		set.put('X', 10);
		set.put('V', 5);
		set.put('I', 1);
		int sum=0;
		for (int i=0;i<s.length();i++){
			if (i<s.length()-1 && set.get(s.charAt(i))<set.get(s.charAt(i+1))){
				sum-=set.get(s.charAt(i));
			}else{
				sum+=set.get(s.charAt(i));
			}	
		}
		return sum;
    }
}
