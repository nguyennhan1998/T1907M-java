package assignment2;

import java.util.Scanner;

public class News implements INews{
    private int ID;
    private String title;
    private String publicDate;
    private String author;
    private String content;
    private float averageRate;
    private int[] rateList=new int[3];
    public News(){

    }

    public News(int ID, String title, String publicDate, String author, String content) {
        this.ID = ID;
        this.title = title;
        this.publicDate = publicDate;
        this.author = author;
        this.content = content;

    }

    public void display(){
        System.out.println("title: "+title+"\n"+
                "Public Date: " +publicDate+"\n"+
                "Author: "+author+"\n"+
                "Content: "+content+"\n"+
                "rate: "+averageRate
                );
    }
    public void calculate(){
        Scanner sc= new Scanner(System.in);
        int sum=0;
        for(int i=0;i<3;i++){
            System.out.println("enter: ");
            rateList[i]=sc.nextInt();
            sum+=rateList[i];
        }
       averageRate=(float) sum/3;
    }
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublicDate() {
        return publicDate;
    }

    public void setPublicDate(String publicDate) {
        this.publicDate = publicDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAverageRate() {
        return averageRate;
    }

}
