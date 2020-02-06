package example;

public class Animal {
public Animal(){
    System.out.println("making animal");
}
private String name;
public String getName(){return name;}
public Animal(String n){name=n;}
public Animal (Animal a){
    this.name=a.name;
}
public void makeNoise(){
    System.out.println("Huh?");
}
public Animal Clone(){return new Animal(this);}
}
