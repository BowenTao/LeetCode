/*Given numRows, generate the first numRows of Pascal's triangle.
 *
 *For example, given numRows = 5,
 *Return
 *
 *[
 *     [1],
 *    [1,1],
 *   [1,2,1],
 *  [1,3,3,1],
 * [1,4,6,4,1]
 *]
*/



public class Solution {
    public List<List<Integer>> generate(int numRows) {
       ArrayList<List<Integer>> a=new ArrayList<List<Integer>>();
       if (numRows<=0){
           return a;
       }
		List<Integer> previous=new ArrayList<Integer>();
		previous.add(1);
		a.add(previous);
		for (int i=2;i<=numRows;i++){
			List<Integer> current=new ArrayList<Integer>();
			current.add(1);
			for (int j=0;j<previous.size();j++){
				if (j+1<previous.size()){
					current.add(previous.get(j)+previous.get(j+1));
				}
			}
			current.add(1);
			a.add(current);
			previous=current;
		}
		return a; 
    }
}
