package baitapjava;

import java.util.Scanner;

public class cong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so a: ");
        int a = 3;

        System.out.print("Nhap so b: ");
        int b = 5;

        int tong = a + b;

        System.out.println("Tong cua hai so la: " + tong);

        sc.close();
    }
}
