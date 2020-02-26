package assignment3;

public class Student extends Person {
    private int age;

    public Student(){}

    public Student(int id, String name, int age) {
        super(id,name);
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String toString(){
        return "Student id :"+getId()+
                " name: "+getName()+
                " age: "+getAge()+"\n";
    }
}
