import java.util.Scanner;

public class PhepSoSanh {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a, b;
	System.out.println("Nhap so a:");
	a = sc.nextInt();
	System.out.println("Nhap so b:");
	b=sc.nextInt();
	System.out.println(a + " = "+b+" : "+(a==b));
}
}
