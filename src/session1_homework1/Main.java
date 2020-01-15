package session1_homework1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Triangle triangle= new Triangle();
        double a,b,c;
        Scanner scanner= new Scanner(System.in);
        do{

            a=scanner.nextDouble();
            b=scanner.nextDouble();
            c=scanner.nextDouble();

        }while(triangle.checkTg(a,b,c)==false);
        triangle.setA(a);
        triangle.setB(b);
        triangle.setC(c);
        System.out.println("chu vi : "+triangle.chuVi());
        System.out.println("dien tich: "+triangle.dienTich());

    }
}
