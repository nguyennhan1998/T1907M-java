package example;

public class Player {
   int number=0;
   public void guess(){
       number=(int) (Math.random()*10);
       System.out.println("the number you just guess is : "+number);
   }
}
