package quangdung;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ViDuDocStream {

	public static void main(String[] args) throws IOException {
		FileInputStream fInput = new FileInputStream("tthcm.txt");
		InputStreamReader ipReader = new InputStreamReader(fInput);
		//Khai báo biến đối tượng InputStreamReader
		//InputStreamReader ipReader = new InputStreamReader(System.in);
		
		//Khai báo biến đối tượng buffer 
		BufferedReader bufReader = new BufferedReader(ipReader);
		
		//In một câu hướng dẫn để biết User cần làm gì
		//System.out.println("Nhap mot chuoi bat ki: ");
				
		//Đọc dữ liệu từ bàn phím, cất vào biến chuỗi
		//String lineDocDuoc = bufReader.readLine();
		
		//In ra dòng đọc được
		//System.out.print(lineDocDuoc);
		//đọc file
		String lineDocDuoc1 = bufReader.readLine();
		
		//In ra dòng đọc được
		System.out.print(lineDocDuoc1);
		
				
		
	}

}
