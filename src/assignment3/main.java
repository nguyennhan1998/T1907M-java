package assignment3;

public class main {
    public static void main(String[] args) {

       PersonModel persons= new PersonModel();
       Person student1= new Student(1,"seo dan",18);
       Person student2= new Student(2,"huyn bin",18);
       persons.addPerson(student1);
       persons.addPerson(student2);
       persons.display();
       Person employee1= new Employee(3,"Park seo joon",1000);
       Person employee2= new Employee(4,"kim da-mi",2000);
       persons.addPerson(employee1);
       persons.addPerson(employee2);
       persons.display();

    }


}
