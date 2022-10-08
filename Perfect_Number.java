import java.util.Scanner;

public class Perfect_Number {

	public static void main(String[] args) {
		int n, sum = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter any Number you want to check :");
		n = s.nextInt();
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == n) {
			System.out.println();
			System.out.println(sum + " is a Perfect Number");
		} else {
			System.out.println(sum + " is not a Perfect Number");
		}
	}

	int divisor(int x) {
		return x;
	}

}
