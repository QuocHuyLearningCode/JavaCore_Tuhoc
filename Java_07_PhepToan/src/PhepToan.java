import java.util.Scanner;

public class PhepToan {
	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so a = ");
		a = sc.nextInt();
		System.out.println("Nhap so b = ");
		b = sc.nextInt();	
		int tong = a + b;
		System.out.println("Tong a + b = " + tong);
		float thuong = (float)a / b;
		System.out.println("Thuong a / b = " + thuong);
	}

}
