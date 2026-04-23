package thigk2.LeQuangDung;

public class SanPham {
	private String maSP;
	private String tenSP;
	private String loaiSP;
	//thuoc tinh thu 4
	private double gia;
	
	//contructor khong tham so
	public SanPham() {
		super();
	}

		//contructor co tham so
		public SanPham(String maSP, String tenSP, String loaiSP, double gia) {
			super();
			this.maSP = maSP;
			this.tenSP = tenSP;
			this.loaiSP = loaiSP;
			this.gia = gia;
		}
	
	//getter va setter cho thuoc tinh
	public String getMaSP() {
		return maSP;
	}
	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}
	public String getTenSP() {
		return tenSP;
	}
	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}
	public String getLoaiSP() {
		return loaiSP;
	}
	public void setLoaiSP(String loaiSP) {
		this.loaiSP = loaiSP;
	}
	public double getGia() {
		return gia;
	}
	public void setGia(double gia) {
		this.gia = gia;
	}
	
	
}
