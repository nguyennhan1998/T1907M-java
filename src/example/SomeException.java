package example;

public class SomeException extends RuntimeException {
    public SomeException(){super("Some Error!");}
    public SomeException(String s){super(s);}
}
