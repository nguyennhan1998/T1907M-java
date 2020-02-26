package assignment3;

import java.util.ArrayList;
import java.util.List;

public class PersonModel {
    List<Person> persons;
    public PersonModel(){
        this.persons= new ArrayList<>();
    }
    public void addPerson(Person person){
        this.persons.add(person);
    }
    public void display(){

            System.out.println(persons.toString());
    }
}
