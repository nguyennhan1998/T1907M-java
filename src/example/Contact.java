package example;

public class Contact implements  Comparable {
    String address;

   String name;
   public int compareTo(Object obj){
       Contact c=(Contact) obj;
       return name.compareTo(c.name);

   }
public Contact(String name, String address){
    this.address=address;
    this.name=name;
}
   public boolean equals(Object obj){
       Contact c= (Contact) obj;
       return name.equals(c.name);
   }
   public int hashCode(){
       return name.hashCode();
   }
}
