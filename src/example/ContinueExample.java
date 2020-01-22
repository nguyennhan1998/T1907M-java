package example;

import java.util.Scanner;

public class ContinueExample {
    public static void main(String[] args) {
        float sum=0;
        int count=0,subject=3;
        Scanner input = new Scanner(System.in);
        System.out.println("enter "+subject+" subject ");
        while(count<subject){
            float mark;
            mark= input.nextFloat();
            if(mark<0){
                System.out.println("The mark less =3than 0 is not ignore ");
                continue;
            }
            sum+=mark;
            count++;
        }
        System.out.println("the average is "+sum/subject);
    }
}
