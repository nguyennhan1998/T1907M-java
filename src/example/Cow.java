package example;

public class Cow {
   String name;
   Cow c1=new Cow();
   Cow c2=new Cow();

   public void eat(){}
   public void productMilk(){}
   public void moo(){
       System.out.println(name+" says Moooo....");
      System.out.println(c1.equals(c2));

   }
}
