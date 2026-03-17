import java.util.ArrayList;
import java.util.Scanner;

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
	public static void main(String[] agrs) {
		Scanner banphim = new Scanner(System.in);
		ArrayList<SinhVien> dsSV = new ArrayList<>();
		ArrayList<MonHoc> dsMH = new ArrayList<>();
		
		while (true){
			System.out.println("QUAN LY SINH VIEN");
			System.out.println("1. Them sinh vien vao danh sach");
			System.out.println("2. Hien thi danh sach sinh vien");
			System.out.println("3. Them mon hoc");
			System.out.println("0. Thoat");
			
			System.out.println("chon: ");
			int chon = banphim.nextInt();
			banphim.nextLine();
			
			if (chon == 0) {
				break;
			}
			 if (chon == 1) {

	                System.out.print("Nhap MSSV: ");
	                String mssv = banphim.nextLine();

	                System.out.print("Nhap ten: ");
	                String ten = banphim.nextLine();

	                System.out.print("Nhap tuoi: ");
	                int tuoi = banphim.nextInt();
	                banphim.nextLine();

	                System.out.print("Nhap lop: ");
	                String lop = banphim.nextLine();

	                SinhVien sv = new SinhVien(mssv, ten, tuoi, lop);
	                dsSV.add(sv);

	                System.out.println("Da them sinh vien.");

	            } 
	            else if (chon == 2) {

	                if (dsSV.size() == 0) {
	                    System.out.println("Danh sach rong");
	                } else {
	                    for (int i = 0; i < dsSV.size(); i++) {
	                        dsSV.get(i).hienthi();
	                    }
	                }

	            } 
	            else if (chon == 3) {

	                System.out.print("Nhap ma mon: ");
	                String ma = banphim.nextLine();

	                System.out.print("Nhap ten mon: ");
	                String ten = banphim.nextLine();

	                MonHoc mh = new MonHoc(ma, ten);
	                dsMH.add(mh);

	                System.out.println("Da them mon hoc.");

	            } 
	            else {
	                System.out.println("Lua chon khong hop le");
	            }

	        }

	    }
	}