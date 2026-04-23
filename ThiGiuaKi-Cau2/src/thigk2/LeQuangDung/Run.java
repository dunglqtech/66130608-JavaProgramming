package thigk2.LeQuangDung;

import java.util.ArrayList;
import java.util.Scanner;

public class Run {
	
	//cach lam:
	//tao lop SanPham gom ma, ten loai, gia
	//ham main:
	//tao danh sach arraylist
	//hard-code 3 san pham ban dau va in ra danh sach do
	//them 1 san pham vao trong danh sach(add) va nhap thong tin tu ban phim
	//in ra laij man hinh danh sach san pham
	//in ra man hinh danh sach cac san pham co loaij la "thuc pham chuc nang"
	

	public static void main(String[] args) {
		//tao lop scanner
		Scanner banphim = new Scanner(System.in);
		//tao arraylist
		ArrayList<SanPham> ds = new ArrayList<>();
		
		//hard-code 3 san pham
		SanPham sp1 = new SanPham();
        sp1.setMaSP("SP01");
        sp1.setTenSP("Sua");
        sp1.setLoaiSP("Thuc pham");
        sp1.setGia(10000);

        SanPham sp2 = new SanPham();
        sp2.setMaSP("SP02");
        sp2.setTenSP("Thuoc");
        sp2.setLoaiSP("Thuc pham chuc nang");
        sp2.setGia(20000);

        SanPham sp3 = new SanPham();
        sp3.setMaSP("SP03");
        sp3.setTenSP("Banh");
        sp3.setLoaiSP("Thuc pham");
        sp3.setGia(15000);

        ds.add(sp1);
        ds.add(sp2);
        ds.add(sp3);
        
        //in danh sach
        System.out.println("Danh sach ban dau:");
		for (int i = 0; i < ds.size(); i++) {
			System.out.println(ds.get(i));
		}
		
		//nhap them sanpham moi
		banphim.nextLine();
		System.out.println("Nhap san pham moi:");
		SanPham spMoi = new SanPham();
		System.out.print("Ma: ");
		spMoi.setMaSP(banphim.nextLine());
		System.out.print("Ten: ");
		spMoi.setTenSP(banphim.nextLine());
		System.out.print("Loai: ");
		spMoi.setLoaiSP(banphim.nextLine());
		System.out.print("Gia: ");
		spMoi.setGia(banphim.nextDouble());
		ds.add(spMoi);
		
		//in lai danh sach
		System.out.println("Danh sach sau khi them:");
		for (int i = 0; i < ds.size(); i++) {
			System.out.println(ds.get(i));
		}
		
		//in ra san pham co loai la thuc pham chuc nang
		System.out.println("San pham 'Thuc pham chuc nang':");
		for (int i = 0; i < ds.size(); i++) {
			if (ds.get(i).getLoaiSP().equalsIgnoreCase("Thuc pham chuc nang")) {
				System.out.println(ds.get(i));
			}
		}

	}

}
