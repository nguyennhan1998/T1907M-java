package example;

public class PeopleTest {
    public static void main(String[] args) {
      Person p1= new  Person();
      Person [] p4= new Person[2];
      p4[0]=new Person();
      p4[1]=new Person();
      for(int i=0;i<p4.length;i++){
          System.out.println(p4[i].getName());
      }
      System.out.println(p1.getName());
      Employee2 p2= new Employee2();
      Manager p3= new Manager();

    }
}
