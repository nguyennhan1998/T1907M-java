package tamgiac;

import java.util.Scanner;

public class TamGiacDeu {
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

        }while(!CheckTamGiacDeu(a,b,c));
        System.out.println("Day la tam giac deu ");
    }
    public static boolean CheckTamGiacDeu(int a,int b,int c){
        if(a==b&&b==c)return true;
        return false;


    }
}
