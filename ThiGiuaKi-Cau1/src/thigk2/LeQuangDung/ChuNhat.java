package thigk2.LeQuangDung;

import java.util.Scanner;

public class ChuNhat {
	
	//cach lam
	//tao cho chuong trinh bat nguoi dung nhap 2 diem (x1,y1) vaf (x2,y2) cua hinh chu nhat
	//tinh chieu dai = |x2-x1|, chieu rong |y2-y1|
	//tinh chu vi = 2*(dai + rong)
	//tinh dien tich = dai * rong

	public static void main(String[] args) {
		//tao lop scanner
		Scanner banphim = new Scanner(System.in);
		
		//nhap du lieu goc toa do tren-trai
		System.out.print("nhap toa do cua diem x1: ");
		double x1 = banphim.nextDouble();
		System.out.print("nhap toa do diem y1: ");
		double y1 = banphim.nextDouble();
		
		//nhap du lieu goc toa do duoi-phai
		System.out.print("nhap toa do cua diem x2: ");
		double x2 = banphim.nextDouble();
		System.out.print("nhap toa do diem y2: ");
		double y2 = banphim.nextDouble();
		
		//cong thuc tinh chieu dai
		double ChieuDai = Math.abs(x2-x1);
		double ChieuRong = Math.abs(y2-y1);
		
		//tinh chu vi hinh chu nhat
		double ChuVi = 2 * (ChieuDai + ChieuRong);
		
		//tinh dien tichs
		double DienTich = ChieuDai * ChieuRong;
		
		//in ra man hinh ket qua
		System.out.print("Chu vi cua hinh chu nhat la: " + ChuVi);
		System.out.print("dien tich cua hinh chu nhat la: " + DienTich);

	}

}
