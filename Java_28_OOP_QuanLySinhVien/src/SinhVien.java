
public class SinhVien {
	private String maSV;
	private String hoVaTen;
	private NgaySinh ngaySinh;
	private double diemTrungBinh;
	private Lop lop;

	public SinhVien(String maSV, String hoVaTen, NgaySinh ngaySinh, double diemTrungBinh, Lop lop) {
		this.maSV = maSV;
		this.hoVaTen = hoVaTen;
		this.ngaySinh = ngaySinh;
		this.diemTrungBinh = diemTrungBinh;
		this.lop = lop;
	}

	public String getMaSV() {
		return maSV;
	}

	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}

	public String getHoVaTen() {
		return hoVaTen;
	}

	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}

	public NgaySinh getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(NgaySinh ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public double getDiemTrungBinh() {
		return diemTrungBinh;
	}

	public void setDiemTrungBinh(double diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}

	public Lop getLop() {
		return lop;
	}

	public void setLop(Lop lop) {
		this.lop = lop;
	}

	@Override
	public String toString() {
		return "SinhVien [maSV=" + maSV + ", hoVaTen=" + hoVaTen + ", ngaySinh=" + ngaySinh + ", diemTrungBinh="
				+ diemTrungBinh + ", lop=" + lop + "]";
	}

	public String layTenKhoa() {
		return this.lop.getTenKhoa();
	}

	public boolean kiemTraThiDat() {
		return this.diemTrungBinh > 4.0;
	}

	public boolean kiemTraCungNgaySinh(SinhVien sinhVien) {
//		return this.ngaySinh.getDay()==sinhVien.ngaySinh.getDay() && this.ngaySinh.getMonth()==sinhVien.ngaySinh.getMonth() && this.ngaySinh.getYear()==sinhVien.ngaySinh.getYear();
		return this.ngaySinh.equals(sinhVien.ngaySinh);
	}

}
