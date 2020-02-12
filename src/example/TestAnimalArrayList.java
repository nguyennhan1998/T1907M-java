package example;

import java.util.ArrayList;

public class TestAnimalArrayList {

static void makeASymphony(ArrayList <? extends  Animal> a){
    for(Animal anAnimal: a){
        anAnimal.makeNoise();

    }
}

    public static void main(String[] args) {
        ArrayList<Animal> pets= new ArrayList<Animal>();
        pets.add(new Dog());
        pets.add(new Cat());
        makeASymphony(pets);
    }
    public void takeAnimal(ArrayList <Animal> animals){
    animals.add(new Cat());
    }
    public void anInnocentMethod(){
    ArrayList<Animal> dogsOnly= new ArrayList<Animal>();
    dogsOnly.add(new Dog());
    dogsOnly.add(new Dog());
    dogsOnly.add(new Cat());
    takeAnimal(dogsOnly);
    }
}
