package example;

import java.io.*;

public class TestDataInputStream {
    public static void main(String[] args) {
        try{
            FileInputStream fin= new FileInputStream(args[0]);
            DataInputStream din= new DataInputStream(fin);
            while(true){
                System.out.println(din.readInt());
            }
        }catch(EOFException e){

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
