package magazine;

import java.util.ArrayList;

public class News implements INews{
    private int ID;
    private String title;
    private String publishDate;
    private String author;
    private String content;
    private float averageRate;
    private int[] rateList= new int[3];
    public void setRateList(int a,int b,int c){
        rateList[0]=a;
        rateList[1]=b;
        rateList[2]=c;
    }
    public int[] getRateList(){
        return rateList;
    }

    ArrayList<News> news=new ArrayList<News>();
    public News(){}
    public News(String title,String publishDate,String author,String content, int[] rateList){
        this.title=title;
        this.publishDate=publishDate;
        this.author=author;
        this.content=content;
        this.rateList=rateList;
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

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
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
    public void display(){
        for(News s: news){
            System.out.println(s.getTitle());
            System.out.println(s.getPublishDate());
            System.out.println(s.getAuthor());
            System.out.println(s.getContent());
            System.out.println(s.getAverageRate());
        }
    }
    public float Calculate(){
        int sum=0;
        for(int i=0;i<rateList.length;i++){
            sum+=rateList[i];
        }
       return  averageRate=sum/(rateList.length);
    }
    public void setAverageRate(){
       averageRate= Calculate();
    }
    public void menu(){
        System.out.println("press 1 to insert news");
        System.out.println("press 2 to view list news ");
        System.out.println("press 3 to see average rate");
        System.out.println("press 4  to exit");
    }
    public void insertNew(String title,String publishDate,String author,String content,int[] i){
        news.add(new News(title,publishDate,author,content,i));
    }
}
