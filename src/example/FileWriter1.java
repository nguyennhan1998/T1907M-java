package example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileWriter1 {
   public static void write(String fileName,String s)  throws FileNotFoundException{

           File file = new File(fileName);
           PrintWriter out= new PrintWriter(file);
           out.println(s);
           out.close();

   }
}