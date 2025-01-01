import java.util.Scanner;

public class Mang {
	public static void main(String[] args) {
		// Khai bao mang
		double[] mang1;
		double mang2[];
		
		mang1 = new double[10];
		Scanner sc = new Scanner(System.in);
		for(int i =0;i<mang1.length;i++) {
			System.out.println("Nhap phan tu thu "+i+" : ");
			mang1[i] = sc.nextDouble();
		}
		for(int i=0; i<mang1.length;i++) {
			System.out.println("Phan tu thu "+i+" : "+mang1[i]);
		}	
		
		mang2 = new double[]{1,2,3,4,5};
		for(int i=0; i<mang2.length;i++) {
			System.out.println("Phan tu thu "+i+" : "+mang2[i]);
		}	
		
	}
}
