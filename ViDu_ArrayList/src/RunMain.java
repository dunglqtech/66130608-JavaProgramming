import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {

	public static void main(String[] args) {
		// Khai bao bien, danh sach chua cac so Nnguyen
		ArrayList<Integer> dsSoNguyen = new ArrayList<Integer>();
		// a.Nhap 10 phan tu tu ban phim
		Scanner banPhim = new Scanner(System.in);      
		
		for (int i=0; i<10; i++) {
			//nhap 1 phan tu
//			System.out.print("Mời nhập phần tử thứ " + i + ": ");
			System.out.print("a[" + i + "]=");
			
			    // cho nhap, cat vao bien tam
			Integer tam = banPhim.nextInt();
			   // them vao cuoi danh sach
			dsSoNguyen.add(tam);
		}
		
		
		//b.In ra danh sach vua nhap
		System.out.print("DANH SÁCH VỪA NHẬP LÀ \n");
//		for (int i=0; i<dsSoNguyen.size(); i++) {
//			// lay gia tri cua phan tu thu i de cat vao bien tam
//			Integer tam = dsSoNguyen.get(i);
//			System.out.print(tam + " ");
//		}
		for (Integer x: dsSoNguyen) {
			System.out.print(x + " ");
		}
		 
       //c. dem phan tu chan
	   int soLuongPTchan=0;
	   for (Integer x: dsSoNguyen) {
			if (x % 2 ==0 ) soLuongPTchan=soLuongPTchan+1;
//			if (x % 2 ==0 ) soLuongPTchan++;
	   }
	   System.out.println("Số phần tử chẵn là: " + soLuongPTchan);
	   
//	 hoac	
//		for (int i=0; i<dsSoNguyen.size(); i++) {
//		  	Integer tam = dsSoNguyen.get(i);
//		  	if (tam % 2 ==0 ) soLuongPTchan=soLuongPTchan+1;
//	    }
	   
	  //d. Tinh tong
	   int TongAll=0;
	   for (Integer x: dsSoNguyen) {
		   TongAll = TongAll +x;
	   }
	   System.out.println("Tổng tất cả các phần tử là: " + TongAll);
	   
		
	}

}