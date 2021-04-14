package test;
import java.util.Scanner;
import java.math.*;
public class test1 {

	public static void main(String[] args) {
		Scanner r = new Scanner(System.in);
		System.out.print("How many subject do you have :");
		int g = r.nextInt();
		int arr[] = new int[g];
		for (int i = 0; 	i < arr.length; i++) {
			System.out.print("Enter your " + (i + 1) + " Degree: ");
			arr[i] = r.nextInt();
		}

		int Degrees = 0;
		for (int i = 0; i < arr.length; i++) {
			Degrees = Degrees + arr[i];
		}

		double total = g * 100;
		double m = Degrees / total;
		double grade = m * 100;
		System.out.print("your grade is " + grade);
		
		if (grade>=90)
			System.out.println(" Excellent");
		else if (grade>=80)
			System.out.println(" very good");
		else if (grade>=70)
			System.out.println(" good");
		else if (grade>=60)
			System.out.println(" Acceptable");
		else
			System.out.println(" Precipitate");		
		
		System.out.println("Thank you, bye.");
		
		r.close();
	}
	
	

}
