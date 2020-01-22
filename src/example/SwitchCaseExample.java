package example;


import java.util.Scanner;

public class SwitchCaseExample {
   public static void main(String[]args){
       Scanner input= new Scanner(System.in);
       System.out.println("enter your String: ");
       String inputGrade=input.next();
       char grade=inputGrade.charAt(0);
       switch (grade){
           case 'a':
               System.out.println("Exellent !");break;
           case 'b':
               System.out.println("Great!");
           case 'c':
           case 'd':
               System.out.println("well done!");break;

           case 'f':
               System.out.println("you Failed! you should try again! ");break;
           default:
               System.out.println("out of the range!");

       }
    }


}
