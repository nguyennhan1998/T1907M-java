package example;

import java.util.Scanner;

public class ForExample{
    public static void main(String[] args) {
        float sum=0;
        int subject=5;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your "+subject+"subjects");
        for(int count=0;count<subject;count++){
            float mark;
            mark=input.nextFloat();
            sum+=mark;
        }
        System.out.println("the average is "+sum/subject);
    }
}
