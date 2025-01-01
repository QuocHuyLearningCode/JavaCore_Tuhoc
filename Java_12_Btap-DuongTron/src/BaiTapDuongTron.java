import java.util.Scanner;

public class BaiTapDuongTron {
public static void main(String[] args) {
	double r, dienTich, chuVi;
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhap r: ");
	r = sc.nextDouble();
	chuVi = 2*(Math.PI)*r;
	System.out.println("Chu Vi: "+(chuVi));
	System.out.println("Chu vi: "+ Math.round(chuVi) ); // lam tron nguyen 
	System.out.println("Chu vi: "+ Math.round(chuVi*100.0)/100.0); // lam tron 2 chu so thap phan 
	
	dienTich = (Math.PI)*(Math.pow(r,2));
	System.out.println("Dien tich: "+ (dienTich));
}
}
