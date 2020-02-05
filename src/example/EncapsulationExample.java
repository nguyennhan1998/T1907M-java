package example;

public class EncapsulationExample {
    public static void main(String[] args) {
        SecuredCow cow= new SecuredCow();
        cow.setAge(2);
        cow.moo();
        System.out.println(cow.getAge());
    }
}
