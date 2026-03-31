package quangdung;

public class SinhVien {
	//cac thuoc tinh theo yeu cau
	private String tenHS;
	private short tuoiHS;
	private String lopHS;
	
	//cac ham tao
	public SinhVien() {
		
	}
	
	

	//getter va setter
	public String getTenHS() {
		return tenHS;
	}

	public void setTenHS(String tenHS) {
		this.tenHS = tenHS;
	}

	public short getTuoiHS() {
		return tuoiHS;
	}

	public void setTuoiHS(short tuoiHS) {
		this.tuoiHS = tuoiHS;
	}

	public String getLopHS() {
		return lopHS;
	}

	public void setLopHS(String lopHS) {
		this.lopHS = lopHS;
	}
	
}
