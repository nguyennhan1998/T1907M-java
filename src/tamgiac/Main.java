package tamgiac;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("nhap canh 1: ");
            a=sc.nextInt();
            System.out.println("nhap canh 2: ");
            b=sc.nextInt();
            System.out.println("nhap canh 3: ");
            c=sc.nextInt();
        }while(!checkTamGiac(a,b,c));//viet dung thi la main.checkTamGiac
        TamGiac tg=new TamGiac(a,b,c);
        System.out.println("chu vi: "+tg.chuVi());
        System.out.println("dien tich: "+tg.dienTich());
    }
    public static  boolean checkTamGiac(int a, int b,int c){
        if(a+b>c&&a+c>b&&b+c>a)return true;
        return false;
    }
}
