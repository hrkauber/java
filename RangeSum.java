/* Hannah Kauber
   CSCI 3053
   Project 2: Recursion 
   Ex.14: Code a recursive solution for the sum of integers from a to b, a > b. 
*/
public class RangeSum {

	public static int sumRange(int a, int b) {
		
		if(a==b)
			return a;
		
		return a + sumRange(a-1, b);
	}
	
	public static void main(String[] args) {
		
		 System.out.println("Sum in range (11, 9): "+RangeSum.sumRange(11, 9));

	   }
}


