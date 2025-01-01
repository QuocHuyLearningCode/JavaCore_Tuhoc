
public class Sach {
	private String tenSach;
	private double giaBan;
	private long namXuatBan;
	private TacGia tacGia;

	public Sach(String tenSach, double giaBan, long namXuatBan, TacGia tacGia) {
		this.tenSach = tenSach;
		this.giaBan = giaBan;
		this.namXuatBan = namXuatBan;
		this.tacGia = tacGia;
	}

	public String getTenSach() {
		return tenSach;
	}

	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}

	public double getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}

	public long getNamXuatBan() {
		return namXuatBan;
	}

	public void setNamXuatBan(long namXuatBan) {
		this.namXuatBan = namXuatBan;
	}

	public TacGia getTacGia() {
		return tacGia;
	}

	public void setTacGia(TacGia tacGia) {
		this.tacGia = tacGia;
	}

	public void tenSach() {
		System.out.println(this.tenSach);
	}

	public boolean kiemtraCungNam(Sach sachKhac) {
		return this.namXuatBan == sachKhac.namXuatBan;
	}

	public double giaSauKhiGiam(double giamGia) {
		return this.giaBan *(1-(giamGia/100));
	}
}
