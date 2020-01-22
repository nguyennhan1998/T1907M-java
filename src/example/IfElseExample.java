package example;

import java.util.Scanner;

public class IfElseExample {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double score;
        System.out.println("Enter your score  ");
        score=input.nextDouble();

        if(score<4.0){
            System.out.println("sorry . you've failed the course.");
        }else{
            System.out.println("Congratulation you've passed the course.");
        }

    }
}
