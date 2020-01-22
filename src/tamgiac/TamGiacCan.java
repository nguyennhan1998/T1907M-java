package tamgiac;

import java.util.Scanner;

public class TamGiacCan {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc= new Scanner(System.in);
        do{
            System.out.printf("nhap canh 1");
            a=sc.nextInt();
            System.out.println("nhap canh 2");
            b=sc.nextInt();
            System.out.println("nhap canh 3");
            c=sc.nextInt();
        }while(!CheckTamGiacCan(a,b,c));
        System.out.println("day la tam giac can");

    }
    public static boolean CheckTamGiacCan(int a,int b,int c){
        if(a==b||a==c||b==c)return true;
        return false;
    }
}
