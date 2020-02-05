package example;

import java.util.ArrayList;

public class Ship {
    private ArrayList<String> locationCells;
   private String name;
   public void setName(String name){
       this.name=name;
   }
   public void setLocationCells(ArrayList<String> loc){
       locationCells=loc;
   }
   public String check(String userInput){
       String result="miss";
       int index= locationCells.indexOf(userInput);
       if(index>=0){
           locationCells.remove(index);
           if(locationCells.isEmpty())
               result="kill";
           result="hit";
       }
       return result;

   }
}
