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

        sc.close();
    }
}
