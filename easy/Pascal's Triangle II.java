/*Given an index k, return the kth row of the Pascal's triangle.

 *For example, given k = 3,
 *Return [1,3,3,1].
 *
 *Note:
 *Could you optimize your algorithm to use only O(k) extra space? 
*/

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> a=new ArrayList<Integer>();
        if (rowIndex<0){
        	return a;
        }
        a.add(1);
        for (int i=1;i<=rowIndex;i++){
        	for (int j=a.size()-2;j>=0;j--){
        		a.set(j+1, a.get(j)+a.get(j+1));
        	}
        	a.add(1);
        }
        return a;
    }
}
