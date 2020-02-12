package magazine;

import java.util.Scanner;

public class Main {
    public static Scanner scanner= new Scanner(System.in);
    public static News myNews = new News();
    public static int[] i;
    public static void main(String[] args) {
        boolean quit=false;
        while(!quit){
            System.out.println("Enter action");
            int action= scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 1: addNews();
                break;
                case 2:display();
                break;
                case 3:
                    case3();
                    break;
                case 4:
                    System.out.println("Exit");
                    quit=true;
                    break;


            }
        }

    }
    public static  void addNews(){
        System.out.println("Enter Title");
        String title= scanner.nextLine();
        System.out.println("Enter publish date");
        String publishDate=scanner.nextLine();
        System.out.println("Enter author");
        String author= scanner.nextLine();
        System.out.println("Enter content");
        String content=scanner.nextLine();
        System.out.println("Enter first rate");
        int first=scanner.nextInt();
        System.out.println("Enter second rate");
        int second=scanner.nextInt();
        System.out.println("Enter third rate");
        int third=scanner.nextInt();
        myNews.setRateList(first,second,third);
        myNews.setAverageRate();
        myNews.insertNew(title,publishDate,author,content,myNews.getRateList());
        //System.out.println("average is"+myNews.getAverageRate());
        System.out.println("you just add a new news");
    }
    public static void display(){
      myNews.display();
    }
    public static void case3(){
        System.out.println("average is"+myNews.getAverageRate());
    }
}

