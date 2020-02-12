package example;

public class WriteToFile {
    public static void main(String[] args){
        try{
            FileWriter1.write("Hello.txt","hello");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
