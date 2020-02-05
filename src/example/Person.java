package example;

public class Person {
    private String name;
    private String birthday;
    public void setName(String name){
        this.name=name;

    }
    public void setBirthday(String birthday){
        this.birthday=birthday;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return name+" "+birthday;
    }
}
