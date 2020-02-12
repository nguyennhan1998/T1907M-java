package example;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.File;

 class FileWriter {
   public static void write(String fileName,String s){
       try{
           File file= new File(fileName);
           PrintWriter out= new PrintWriter(file);
           out.println(s);
           out.close();
       }catch (FileNotFoundException e){
           e.printStackTrace();
       }

   }
}
