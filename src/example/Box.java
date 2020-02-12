package example;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Box implements Serializable {

    private int height;
    private int width;
    Box(int h,int w){height=h;width=w;}
    public static void main(String [] args){
        Box b=new Box(30,37);
        try{
            FileOutputStream fileStream= new FileOutputStream("box.dat");
            ObjectOutputStream os= new ObjectOutputStream(fileStream);
            os.writeObject(b);
            os.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
