import java.util.Scanner;
public class Studentgpa {
	public static void main(String[]args) {
		Scanner myObj = new Scanner(System.in);
		String studentName;
		double studentGpa;
		int studentAge;
		
		System.out.println("Enter student's name");
		studentName = myObj.nextLine();
		
		System.out.println("Username is:" + studentName);
		
		System.out.println("Enter student's GPA");
		studentGpa = myObj.nextDouble();
		
		System.out.println("GPA is:" + studentGpa);
		
		System.out.println("Enter student's age");
		studentAge = myObj.nextInt();
		
		System.out.println("Students age is:" + studentAge);
	}
}
