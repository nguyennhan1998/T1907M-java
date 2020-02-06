package example;

public class AnimalTestDrive {
    public static void main(String[] args) {
//        AnimalsList list =new AnimalsList();
//        Animal d=new Dog();
//        Animal  c=new Cat();
//        Animal e= new Dog();
//        list.add(d);
//        list.add(c);
//
//        System.out.println(e.getClass());
//        System.out.println(d.hashCode());
//        System.out.println(d.toString());
       Cat tom= new Cat("Tom");
       Cat c= tom.Clone();
       c.makeNoise();
       Animal a= tom.Clone(); a.makeNoise();

    }
    public void cloneAll(Animal [] group){

        Animal [] copy= new Animal[group.length];
        for(int i=0;i<group.length;i++){
            copy[i]=new Animal(group[i]);
        }
    }
    public void cloneAllB(Animal [] group){
        Animal[] copy= new Animal[group.length];
        for(int i=0;i<group.length;i++){
            copy[i]=group[i].Clone();
        }
    }
}
