package quangdung;

public class HinhHoc {
	protected String mauSac;

	//constructor
	public HinhHoc(String mauSac) {
		super();
		this.mauSac = mauSac;
	}

	//getter setter
	public String getMauSac() {
		return mauSac;
	}

	public void setMauSac(String mauSac) {
		this.mauSac = mauSac;
	}
	
	//phuong thuc tru tuong lop con phai implement
	public abstract double tinhDienTich();
	public abstract double tinhChuVi();
	
	//phuong thuc tru tuong co tham so
	public abstract void phongTo(double tyLe);
	
	//phuong thuc co san implement
	 public void hienThiThongTin() {
	        System.out.println("Màu sắc: " + mauSac);
	        System.out.println("Diện tích: " + tinhDienTich());
	        System.out.println("Chu vi: " + tinhChuVi());
	    }
}
