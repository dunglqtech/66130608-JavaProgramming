class SinhVien{
	String mssv;
	String ten;
	int tuoi;
	String lop;
	
	public SinhVien(String mssv, String ten, int tuoi, String lop) {
		this.mssv = mssv;
		this.ten = ten;
		this.tuoi = tuoi;
		this.lop = lop;
	}
	public void hienthi() {
		System.out.print("MSSV: "+ mssv + "|ten"+ ten + "|tuoi"+ tuoi + "|lop"+ lop);
	}
}
class MonHoc {
	String MaMH;
	String TenMH;
	
	 public MonHoc(String maMon, String tenMon) {
	        this.MaMH = maMon;
	        this.TenMH = tenMon;
	    }
	}


public class QuanLySinhVien {

}
