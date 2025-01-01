import java.util.Scanner;

public class ChuyenDoi_DectoBit {
public static void main(String[] args) {
	int n;
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhap so thap phan: ");
	n = sc.nextInt();
	String nhiPhan = "";
	/*
	 * Chia lien tuc cho 2 va lay phan du 
	 * Dao nguoc chuoi => Ket qua 
	 * 
	 * 10/2 = 5 du 0
	 * 5/2 = 2 du 1
	 * 2/2 = 1 du 0 
	 * 1/2 = 0 du 1
	 * 10 => 1010
	 */
	int i =0;
	while(n>0) {
		nhiPhan = (n%2) + nhiPhan;
		n = n/2;
		i++;
	}
	System.out.println("So he phi phan la: "+ nhiPhan);
	System.out.println(i);
}
}
