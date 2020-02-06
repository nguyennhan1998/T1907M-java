package example;

public class AnimalsList {
    private Animal[] animals= new Animal[5];
    private int nextIndex=0;
public Animal get(int index){
        return animals[index];
    }
    public void add(Animal a){
        if(nextIndex<animals.length){
            animals[nextIndex]=a;
            System.out.println("Animals added at "+nextIndex);
            nextIndex++;
        }
    }
}
