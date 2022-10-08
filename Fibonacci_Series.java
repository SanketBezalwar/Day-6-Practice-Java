import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String[] args) {
		int num;
		int t1 = 0; 
	    int t2 = 1;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number of terms : ");
		num = sc.nextInt();
		
		System.out.println();
		System.out.println("First " + num + " terms of Fibonnaci Series are : ");

		for (int i = 1; i <= num; ++i) {
			System.out.print(t1 + " ");
			int sum = t1 + t2;
			t1 = t2;
			t2 = sum;
		}
	}

}
