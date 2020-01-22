package example;

import java.util.Scanner;

public class WhileExample {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int number,count;
        System.out.println("enter a number ");
        number=input.nextInt();
        count=1;
        while(count<=number){
            System.out.print(count+1+ " , ");
            count++;


        }
        System.out.println("Booms");
    }
}
