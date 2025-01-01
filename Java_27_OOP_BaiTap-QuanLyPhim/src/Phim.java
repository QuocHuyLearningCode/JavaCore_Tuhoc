
public class Phim {
	private String tenPhim;
	private long namSanXuat;
	HangSanXuat hangSanXuat;
	private double giaVe;
	NgayChieu ngayChieu;
	public Phim(String tenPhim, long namSanXuat, HangSanXuat hangSanXuat, double giaVe, NgayChieu ngayChieu) {
		this.tenPhim = tenPhim;
		this.namSanXuat = namSanXuat;
		this.hangSanXuat = hangSanXuat;
		this.giaVe = giaVe;
		this.ngayChieu = ngayChieu;
	}
	public String getTenPhim() {
		return tenPhim;
	}
	public void setTenPhim(String tenPhim) {
		this.tenPhim = tenPhim;
	}
	public long getNamSanXuat() {
		return namSanXuat;
	}
	public void setNamSanXuat(long namSanXuat) {
		this.namSanXuat = namSanXuat;
	}
	public HangSanXuat getHangSanXuat() {
		return hangSanXuat;
	}
	public void setHangSanXuat(HangSanXuat hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}
	public double getGiaVe() {
		return giaVe;
	}
	public void setGiaVe(double giaVe) {
		this.giaVe = giaVe;
	}
	public NgayChieu getNgayChieu() {
		return ngayChieu;
	}
	public void setNgayChieu(NgayChieu ngayChieu) {
		this.ngayChieu = ngayChieu;
	}
	public boolean kiemTraGiaVe(Phim tenPhim) {
		return this.giaVe > tenPhim.giaVe;
	}
	public String layTenHangSanXuat() {
		return this.hangSanXuat.getTenSanXuat();
	}
	public double giaVeKhuyenMai(double giamGia) {
		return (1-(giamGia/100))*this.giaVe;		
	}
	@Override
	public String toString() {
		return "Phim [tenPhim=" + tenPhim + ", namSanXuat=" + namSanXuat + ", hangSanXuat=" + hangSanXuat + ", giaVe="
				+ giaVe + ", ngayChieu=" + ngayChieu + "]";
	}
	

}
