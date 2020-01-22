package fraction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        do {
            System.out.println("nhap tu so");
            a = sc.nextInt();
            System.out.println("nhap mau so");
            b = sc.nextInt();

        } while (!checkFraction(a, b));
        Fraction firstFraction = new Fraction(a, b);
        firstFraction.printFraction();
        firstFraction.rutGon();
        firstFraction.nghichDao();
        System.out.println("tong cua hai so a va b la :" + firstFraction.add());
        System.out.println("hieu cua hai so a va b la :" + firstFraction.sub());
        System.out.println("tich cua hai so a va b la : " + firstFraction.mul());
        System.out.println("thuong cua hai so a va b la : " + firstFraction.div());


    }

    public static boolean checkFraction(int a, int b) {
        if (b == 0) return false;
        return true;
    }
}
