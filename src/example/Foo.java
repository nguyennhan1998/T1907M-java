package example;

public class Foo {
    public static Foo doStuff(){
        Foo newFoo= new Foo();
        return newFoo;
    }
    public static void doStuff1(Foo copyFoo){
        Foo localFoo = copyFoo;
    }

    public static void main(String[] args) {
        Foo f1;
        Foo f2= new Foo();
        Foo f3= new Foo();
        Foo f4= f3;
        f1=doStuff();
        
    }
}
