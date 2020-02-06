package example;

public class DogTestDrive {
    public static void main(String[] args) {
        AnimalsList list = new AnimalsList();

        Dog d= new Dog();
        list.add(d);
       Animal  a= list.get(0);

       Dog d2= new Dog();
       d2= (Dog) a;
       d2.roam();
      // d2.chaseCat();

    }
}
