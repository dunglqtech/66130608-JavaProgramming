package baitapjava;

import java.util.Scanner;

public class hoanvi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so a: ");
        int a = sc.nextInt();

        System.out.print("Nhap so b: ");
        int b = sc.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Sau khi hoan vi:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        int tich  = a * b;
        System.out.println("tich cua a * b la:" + tich);
        int thuong = a / b;
        System.out.print("thuong cua a / b la: " + thuong);

        sc.close();
    }
}
