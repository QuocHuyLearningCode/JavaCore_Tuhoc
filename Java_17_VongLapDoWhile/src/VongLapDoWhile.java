import java.util.Scanner;

public class VongLapDoWhile {
public static void main(String[] args) {
	/*
	 * Do-While thuc thi khoi lenh truoc khi kiem tra dieu kien
	 * While - For kiem tra dieu kien truoc khi thuc hien khoi lenh 
	 */
	int n;
	Scanner sc = new Scanner(System.in);
	do {
		System.out.println("Nhap vao n>0");
		n=sc.nextInt();
	}while(n<=0);
}
}
