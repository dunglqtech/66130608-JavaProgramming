package thigk2.LeQuangDung;
import java.io.*;
import java.util.*;

public class Cau3 {
	
	//cach lam:
	//dong tung dong trong file
	//chuyen thanh so va luu	
	//dung for in ra
	//duyet kiem tra X
	public static void main(String[] args) {
		//tao arraylist
		ArrayList<Double> ds = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            String line;

            while (true) {
                line = br.readLine();
                if (line == null) break;

                ds.add(Double.parseDouble(line));
            }

            br.close();
        } catch (Exception e) {
            System.out.println("Loi doc file");
        }
        
     // in danh sach
        System.out.println("Danh sach:");
        for (int i = 0; i < ds.size(); i++) {
            System.out.println(ds.get(i));
        }

	}

}
