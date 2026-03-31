package quangdung;

import java.util.Scanner;
import java.util.ArrayList;

public class Run {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        //Hoc sinh 1 - Hard_Code
        SinhVien hs1 = new SinhVien();
        hs1.setTenHS("Nguyễn Văn A");
        hs1.setTuoiHS((short)18);
        hs1.setLopHS("CNTT1");

        System.out.println(hs1);

        //In ra ds N hoc sinh
        ArrayList<SinhVien> danhsach = new ArrayList<>();

        System.out.println("Nhap so luong hoc sinh: ");
        int n = scanner.nextInt();
        scanner.nextLine(); //Xoa bo nho dem

        for (int i = 0; i < n; i++) {
            System.out.println("====Nhap hoc sinh thu " + (i + 1) + "====");

            System.out.print("Nhap ten hoc sinh: \n");
            String name = scanner.nextLine();

            System.out.print("Nhap tuoi hoc sinh: \n");
            int age = scanner.nextInt();

            scanner.nextLine();
            System.out.print("Nhap lop hoc sinh: \n");
            String HSclass = scanner.nextLine();
            System.out.println("=========================================");

            danhsach.add(new SinhVien(name, (short)age , HSclass));
        }

        System.out.println("=====Danh sach vua nhap=====");
        for (SinhVien nhs : danhsach) {
            System.out.println(nhs);
        }

        //Bo sung HS
        System.out.println("====================");
        System.out.println("1. Nhap HS bo sung");
        System.out.println("2. Khong can nhap");
        int chon = scanner.nextInt();

        if(chon == 1) {
            System.out.println("====Nhap HS can bo sung====");
            scanner.nextLine(); // thêm để tránh lỗi
            System.out.print("Nhap ten HS: ");
            String tenBS = scanner.nextLine();
            System.out.print("Nhap tuoi HS: ");
            int tuoiBS = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Nhap lop HS: ");
            String lopBS = scanner.nextLine();

            danhsach.add(new SinhVien(tenBS, (short)tuoiBS, lopBS));

            System.out.println("Danh sach sau khi bo sung:");
            for (SinhVien nhs : danhsach) {
                System.out.println(nhs);
            }
        }
        else if (chon == 2) {
            System.out.println("===Hoan tat===");
        }

        //Xoa hs ten Hoa
        System.out.println("====Xoa hoc sinh tên 'Hoa'====");
        for (int i = 0; i < danhsach.size(); i++) {
            String tenHienTai = danhsach.get(i).getTenHS();

            if (tenHienTai.equalsIgnoreCase("Hoa")) {
                System.out.println("--> Da tim thay va Xoa: " + tenHienTai);
                danhsach.remove(i);
                i--;
            }
        }

        System.out.println("===Danh sach sau khi xu ly===");
        if (danhsach.isEmpty()) {
            System.out.println("---Danh sach trong---");
        } else {
            for (SinhVien nhs : danhsach) {
                System.out.println(nhs);
            }
        }

        scanner.close();
    }

}
