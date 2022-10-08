import java.util.Scanner;

public class Prime_Number {
	static int i;
	static int num;
	static int count = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a Number: ");
		num = sc.nextInt();

		for (i = 2; i < num; i++) {
			if (num % i == 0) {
				count++;
				break;
			}
		}

		System.out.println();
		if (count == 0)
			System.out.println(num + " is a Prime Number");
		else
			System.out.println(num + " is not a Prime Number");
	}

}
