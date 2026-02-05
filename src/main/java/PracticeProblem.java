import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
	}

	public static void q1() {
		//Write question 1 code here
		Scanner s = new Scanner(System.in);
		System.out.print("In: ");
		String y = s.nextLine();
		System.out.println(y.charAt(0));
	}

	public static void q2() {
		//Write question 2 code here
		Scanner s = new Scanner(System.in);
		System.out.print("In: ");
		boolean y = s.nextBoolean();
		System.out.println(!y);
	}

	public static void q3() {
		//Write question 3 code here
		Scanner s = new Scanner(System.in);
		System.out.print("In: ");
		int y = s.nextInt();
		if (y > 5)
			System.out.println("true");
		else
			System.out.println("false");
	}

	public static void q4() {
		//Write question 4 code here
		Scanner s = new Scanner(System.in);
		System.out.print("In: ");
		double y = s.nextDouble();
		System.out.println(y >= -2 && y <= 2);
		
	}

	public static void q5() {
		//Write question 5 code here
		Scanner s = new Scanner(System.in);
		System.out.print("In: ");
		String y = s.nextLine();
		System.out.println(y.equals("Hello World"));
	}

	public static void q6() {
		//Write question 6 code here
		Scanner s = new Scanner(System.in);
		System.out.print("In: ");
		int x = s.nextInt();
		System.out.print("In: ");
		int y = s.nextInt();
		if (x <= y)
			System.out.println("true");
		else
			System.out.println("false");
	}

	public static void q7() {
		//Write question 7 code here
		Scanner s = new Scanner(System.in);
		System.out.print("In: ");
		double x = s.nextDouble();
		System.out.print("In: ");
		double y = s.nextDouble();
		if (x > y)
			System.out.println("true");
		else
			System.out.println("false");
	}

}
