package session1;

public class Human {
    public int age = 10;
public Human(){
    System.out.printf("Vua tao mot object human");
}

public Human(String msg){
    System.out.println(msg);
}

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public Human (int x){
    age=x;
    System.out.println("vua set age");
}
public Human(int x,String y){

}
public Human(String y,int x){

}
    public void getInfo(){
        System.out.println("age "+age);
    }

}
