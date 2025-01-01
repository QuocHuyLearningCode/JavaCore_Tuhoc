
public class SinhVien {
	private String hoTen;
	private int namSinh;
	private String tenLop;
	private String tenTruong;
	public SinhVien(String hoTen, int namSinh, String tenLop, String tenTruong) {
		this.hoTen = hoTen;
		this.namSinh = namSinh;
		this.tenLop = tenLop;
		this.tenTruong = tenTruong;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	public String getTenLop() {
		return tenLop;
	}
	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}
	public String getTenTruong() {
		return tenTruong;
	}
	public void setTenTruong(String tenTruong) {
		this.tenTruong = tenTruong;
	}
	public void an() {
		System.out.println("Dang an");
	}
	
	public void uong() {
		System.out.println("Dang uong");
	}
	public void ngu() {
		System.out.println("Dang ngu");
	}
	public void lamBaiTap() {
		System.out.println("Dang lam bai tap");
	}

}
