package example;

import java.util.Scanner;

public class HomeWorkA {
    public static void main(String[] args) {
        int x,y;
        Scanner input = new Scanner(System.in);

        System.out.println("nhap x");
        x=input.nextInt();
        System.out.println("nhap y");
        y=input.nextInt();
        int z=x+y;
        System.out.println("gia tri cua x khi chua tang len mot don vi la : "+x);
        x++;
        System.out.println("tong cua x va y la : "+z);
        System.out.println("gia tri cua x khi tang len mot don vi la "+x);


    }
}
