package example;


import sun.security.x509.InvalidityDateExtension;

import java.util.Scanner;

public class BreakTest {
    public static void main(String[] args) {
        float sum=0;
        int count,subject;
        Scanner input= new Scanner(System.in);
        System.out.println("enter the number of subject");
        subject=input.nextInt();
        System.out.println("Enter  "+subject+" subject ");
        for(count=0;count<subject;count++){
            float mark;
            mark= input.nextFloat();
            if (mark==0) break;

            sum+=mark;
        }
        if(subject>=count){
            System.out.println("The average is : "+sum/subject);

        }else{
            System.out.println("invalid ");
        }
    }
}
