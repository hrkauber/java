/* Hannah Kauber
   CSCI 3053
   Project 2: Recursion 
   Ex.15: Code a recursive solution for outputting an array of characters. 
*/
public class PrintArray {
	
	public static void main(String[] args) {
		char[] array = new char[] {'a', 'b', 'c', 'd', 'e' };
		printArray(array, array.length);
	}
	
	public static void printArray(char[] array, int length) {
		if (length == 1) {
			System.out.print(array[0] + " ");
			return;
		}else {
			printArray(array, length - 1);
			System.out.print(array[length - 1] + " ");
		}
	}
}
