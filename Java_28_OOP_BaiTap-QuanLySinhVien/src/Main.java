
public class Main {
	public static void main(String[] args) {
		NgayChieu ngayChieu1 = new NgayChieu(26,11,2024); 
		HangSanXuat hangSanXuat1 = new HangSanXuat("WH","VietNam");
		Phim boPhim1 = new Phim("lap trinh",2024,hangSanXuat1,20000,ngayChieu1);
		System.out.println(boPhim1);
		System.out.println("Ten hang san xuat: "+boPhim1.layTenHangSanXuat());
	}
}
