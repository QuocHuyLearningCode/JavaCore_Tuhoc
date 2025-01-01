import java.util.Scanner;

public class Try_case_finally {
	public static void main(String[] args) {
		int n=0;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Nhap n: ");
			n = sc.nextInt();
		} catch (Exception e) {
			System.out.println("Nhap du lieu khong dung");
		} finally {
			System.out.println("Finally!");
		}
		System.out.println("n = "+n);
		System.out.println("Ket thuc chuong trinh");
	}
}
