package session1;

public class Main {
    public static void main(String[] args) {
        Human h = new Human();
        System.out.println("tuoi : " + h.age);
        h.getInfo();
        Human n = new Human("xin chao Abc");
        Car c = new Car();
        c.setYear(1999);
        System.out.println("year: " + c.getYear());

        Human a = new Human(15);//tinh chat da hinh  trong java
        //overload nạp chồng
        Car c2 = new Car();

    }
}
