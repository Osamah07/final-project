import java.util.Scanner;

public class Final_project1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner r = new Scanner(System.in);
		System.out.print("How many subject do you have :");
		int g = r.nextInt();
		int p[][] = new int[g][g];
		for (int i = 0; i < p.length; i++) {
			System.out.print("Enter your " + (i + 1) + " Degree :");
			p[0][i] = r.nextInt();

		}

		int total = 0;
		for (int i = 0; i < p.length; i++) {
			total = total + p[0][i];

		}

		double o = g * 100;
		double m = total / o;
		double grade = m * 100;
		System.out.println("your grade is " + grade);
		System.out.println("Thank you, bye.");

	}

}
