
public class Main {
	public static void main(String[] args) {
		NgaySinh ngay1 = new NgaySinh(26,10,2004);
		TacGia tacGia1 = new TacGia("Quoc Huy", ngay1);
		Sach sach1 = new Sach("Lap trinh Java", 5000,2023,tacGia1);
		Sach sach2 = new Sach("Lap trinh Java Core", 5000,2023,tacGia1);
		sach1.tenSach();
		sach2.tenSach();
		System.out.println("So sanh nam xuat ban: "+ sach1.kiemtraCungNam(sach2));
		System.out.println("Gia sau khi giam 10%: "+ sach1.giaSauKhiGiam(10));
	}
}
