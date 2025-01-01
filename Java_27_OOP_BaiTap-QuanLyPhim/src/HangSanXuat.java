
public class HangSanXuat {
	private String tenSanXuat;
	private String quocGia;
	public HangSanXuat(String tenSanXuat, String quocGia) {
		this.tenSanXuat = tenSanXuat;
		this.quocGia = quocGia;
	}
	public String getTenSanXuat() {
		return tenSanXuat;
	}
	public void setTenSanXuat(String tenSanXuat) {
		this.tenSanXuat = tenSanXuat;
	}
	public String getQuocGia() {
		return quocGia;
	}
	public void setQuocGia(String quocGia) {
		this.quocGia = quocGia;
	}
	@Override
	public String toString() {
		return "HangSanXuat [tenSanXuat=" + tenSanXuat + ", quocGia=" + quocGia + "]";
	}
	
}
