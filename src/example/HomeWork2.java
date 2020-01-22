package example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int x;

        do{
            System.out.println("nhap x");
            x=input.nextInt();

        }while(x<=10);
        System.out.println("you finished the number is grater than 10");


    }
}
