
public class Main {
	public static void main(String[] args) {
		HoaDonCaPhe hd = new HoaDonCaPhe("ca phe", 100, 6);
		System.out.println("Tong tien: " + hd.tinhTong());
		System.out.println("Kiem tra khoi luong lon 2: "+ hd.kiemTraKhoiLuong(2));
		System.out.println("Kiem tra ton tien lon 500: " + hd.kiemTraTongTien());
		System.out.println("Giam gia: "+ hd.tinhTienGiamGia(10));
		System.out.println("Tong tien sau khi giam gia: " +hd.giaSauKhiGiam(10));
	}
}
