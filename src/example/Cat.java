package example;

public class Cat extends Animal{
    private String name;
  public Cat(String name){
      this.name=name;
  }
public Cat (Cat c){
    super(c);
}
public void makeNoise(){
    System.out.println("Meow!");
}
public Cat Clone(){return new Cat(this);}
}
