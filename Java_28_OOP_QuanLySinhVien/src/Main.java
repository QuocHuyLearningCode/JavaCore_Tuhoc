
public class Main {
	public static void main(String[] args) {
		NgaySinh ngaySinh1 = new NgaySinh(26, 10, 2004);
		NgaySinh ngaySinh2 = new NgaySinh(30, 06, 2004);
		Lop lop1 = new Lop("CN22", "Khoa CNTT");
		Lop lop2 = new Lop("GTH03", "Khoa GDTH");
		SinhVien sinhVien1 = new SinhVien("22H1120071", "Nguyen Quoc Huy", ngaySinh1, 10, lop1);
		SinhVien sinhVien2 = new SinhVien("270422", "Tran Bich Quyen", ngaySinh2, 9.9, lop2);
		SinhVien sinhVien3 = new SinhVien("22H1120071", "Nguyen Quoc Huy", ngaySinh1, 10, lop1);
		System.out.println(sinhVien1);
		System.out.println(sinhVien2);
		System.out.println("Ten khoa SV1: " + sinhVien1.layTenKhoa());
		System.out.println("Ten Khoa SV2: " + sinhVien2.layTenKhoa());
		System.out.println("So sanh ngay sinh: " + sinhVien1.kiemTraCungNgaySinh(sinhVien2));
		System.out.println("So sanh ngay sinh: " + sinhVien1.kiemTraCungNgaySinh(sinhVien3));
	}
}
