import java.util.Scanner;

public class Switch_Case {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		switch (n) {
		case 2: {
			System.out.println("Thu hai");
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + n);
		}
	}
}
