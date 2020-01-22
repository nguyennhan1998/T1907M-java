package tamgiac;


import java.util.Scanner;

public class TamGiacVuong extends TamGiac {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc= new Scanner(System.in);
        do{
            System.out.println("nhap canh 1");
            a=sc.nextInt();
            System.out.println("nhap canh 2");
            b=sc.nextInt();
            System.out.println("nhap canh 3");
            c=sc.nextInt();
        }while(!CheckTamGiacVuong(a,b,c));
        System.out.println("day la tam giac vuong ");
        TamGiac tg= new TamGiac(a,b,c);
        System.out.println("chu vi tam giac vuong la : "+tg.dienTich());
        System.out.println("dien tich cua tam giac vuong la : "+tg.chuVi());


    }
    public static  boolean CheckTamGiacVuong(int a,int b,int c){
        if(Math.pow(a,2)==Math.pow(b,2)+Math.pow(c,2)||Math.pow(b,2)==Math.pow(a,2)+Math.pow(c,2)||Math.pow(c,2)==Math.pow(a,2)+Math.pow(b,2))
            return true;
        return false;
    }
}
