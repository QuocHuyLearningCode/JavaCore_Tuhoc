import java.util.Scanner;

public class HoaDonCaPhe {
	private String tenLoaiCaPhe;
	private double giaTien;
	private double khoiLuong;
	Scanner sc = new Scanner(System.in);

	public HoaDonCaPhe(String ten, double gia, double khoiLuong) {
		this.tenLoaiCaPhe = ten;
		this.giaTien = gia;
		this.khoiLuong = khoiLuong;
	}

	public double tinhTong() {
		return this.giaTien * this.khoiLuong;
	}

	public boolean kiemTraKhoiLuong(double khoiLuong) {
		return this.khoiLuong > khoiLuong;
	}

//	public boolean kiemTraTongTien() {
//	    return (this.giaTien * this.khoiLuong) > 500;
//	}
	public boolean kiemTraTongTien() {
		return this.tinhTong() > 500;
	}

	public double tinhTienGiamGia(double giamGia) {
		if (this.kiemTraTongTien()) {
			return (giamGia / 100) * this.tinhTong();
		} else {
			return 0;
		}
	}
	public double giaSauKhiGiam(double giamGia) {
		return this.tinhTong() - this.tinhTienGiamGia(giamGia);
	}
}
