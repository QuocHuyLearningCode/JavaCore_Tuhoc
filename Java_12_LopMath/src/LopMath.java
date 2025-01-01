import java.util.Scanner;

public class LopMath {
	public static void main(String[] args) {
		double a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so a: ");
		a = sc.nextDouble();
		System.out.println("Nhap vao so b: ");
		b = sc.nextDouble();
		
		// ham tri tuyet doi  
		System.out.println("|a|= "+ Math.abs(a));
		// ham tim min
		System.out.println("min (a, b) = "+ Math.min(a, b));
		// ham ceil - lam tron nguyen len
		System.out.println("ceil(a) = "+ Math.ceil(a));
		// ham floor - lam tron nguyen xuong 
		System.out.println("floor(a) = "+ Math.floor(a));
		// ham tinh can bac 2 
		System.out.println("sqrt(a) = "+ Math.sqrt(a));
		// ham tinh bac 2 
		System.out.println("a^b = "+ Math.pow(a, b));
	}
}
