import java.util.Scanner;

public class ToanTuDieuKien {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so a: ");
		int a = sc.nextInt();
		String ketQua = (a%2==0)?"so chan":"so le";
		System.out.println(ketQua);
	}
}
