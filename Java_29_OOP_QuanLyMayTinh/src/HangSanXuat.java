
public class HangSanXuat {
	private String tenSanXuat;
	private QuocGia quocGia;

	public HangSanXuat(String tenSanXuat, QuocGia quocGia) {
		this.tenSanXuat = tenSanXuat;
		this.quocGia = quocGia;
	}

	public String getTenSanXuat() {
		return tenSanXuat;
	}

	public void setTenSanXuat(String tenSanXuat) {
		this.tenSanXuat = tenSanXuat;
	}

	public QuocGia getQuocGia() {
		return quocGia;
	}

	public void setQuocGia(QuocGia quocGia) {
		this.quocGia = quocGia;
	}

	@Override
	public String toString() {
		return "HangSanXuat [tenSanXuat=" + tenSanXuat + ", quocGia=" + quocGia + "]";
	}
	public String layTenQuocGia() {
		return this.quocGia.getTenQuocGia();
	}

}
