/* Hannah Kauber
   CSCI 3053
   Project 2: Recursion 
   Ex.15: Code a recursive solution for a binary search of an array to locate the value  akey. 
*/

public class BinarySearch {
	
	public static int binarySearch(int arr[], int l, int r, int x) {
		if (r >=l) {
			int mid = l + (r - l)/2;
			
		if (arr[mid] == x)
			return mid; 
		
		if (arr[mid] > x)
			return binarySearch(arr, l, mid -1, x);
		
		return binarySearch(arr, mid + 1, r, x);
		}
		
	return -1; 
	}
	
	public static void main(String[]args) {
		int arr[] = {10, 11, 12, 13, 14, 15};
		int result = binarySearch(arr, 0, arr.length -1, 12);
		
		if (result == -1)
				System.out.println("");
		
		else
				System.out.println("Element found at index" + result);
	}
}
