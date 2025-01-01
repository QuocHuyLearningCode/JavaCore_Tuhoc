
public class Main {
public static void main(String[] args) {
	NgaySanXuat ngaySanXuat = new NgaySanXuat(26, 11, 2024);
	QuocGia quocGia = new QuocGia("VIE", "Viet Nam");
	HangSanXuat hangSanXuat = new HangSanXuat("Lenovo", quocGia);
	MayTinh mayTinh = new MayTinh(hangSanXuat, ngaySanXuat, 20000000, 2.5);
	System.out.println(mayTinh);
	System.out.println("Ten Quoc Gia: "+mayTinh.layTenQuocGia());
}
}
