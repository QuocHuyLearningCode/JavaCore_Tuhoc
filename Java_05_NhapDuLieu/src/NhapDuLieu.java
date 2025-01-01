import java.util.Scanner;

public class NhapDuLieu {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhap: ");
	String nhapString = sc.nextLine();
	long nhapSo = sc.nextLong();
	float nhapSoThapPhan = sc.nextFloat();
	System.out.println("String: "+ nhapString);
	System.out.println("long: "+ nhapSo);
	System.out.println("flaot: "+ nhapSoThapPhan);
}
}
