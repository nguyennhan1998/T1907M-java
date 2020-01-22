package example;

import java.util.Scanner;

public class YesNoMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your answer");
        String myAnswer=input.next();
        switch (myAnswer){
            case "yes":
                System.out.println("you say : \"yes\"");break;
            case "no":
                System.out.println("you say : \"no\"");break;
            default:
                System.out.println("i dont know what do you mean");
        }

    }
}
