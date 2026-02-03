package baitapjava;

import java.util.Scanner;

public class tru {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so a: ");
        int a = sc.nextInt();

        System.out.print("Nhap so b: ");
        int b = sc.nextInt();

        int tong = a - b;

        System.out.println("Hieu cua hai so la: " + tong);

        sc.close();
    }
}