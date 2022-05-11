/* Hannah Kauber
   CSCI 3053
   Project 2: Recursion 
   Ex 20: A program that outputs the first 45 terms of the fibonacci sequence.
*/
public class fibo {

	public static int fibonacci(int n) {
	if (n==0) {
			return 0;
			
	}
	if (n==1 || n==2) {
			return 1;
	}
			return fibonacci (n-2) + fibonacci (n-1);
	}
	
	public static void main(String[] args) {
		int maxNumber = 45;
		System.out.print("The first " +maxNumber+ " terms in the fibonacci sequence are:\n ");
			for (int i = 0; i <maxNumber; i++) {
					System.out.print(fibonacci(i) +" \n ");
			}
	}
}
