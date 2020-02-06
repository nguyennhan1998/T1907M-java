package example;

public class SonOfBoo extends Boo {
    public SonOfBoo() {
        super("boo");
    }

    public SonOfBoo(int i) {
        super(10);
    }

    public SonOfBoo(String s) {
        super("foo");
    }

    public SonOfBoo(int i, String s) {
        super("h1", 7);
    }
    public SonOfBoo(String a, String b,String c){
        super(a,1);
    }
    public SonOfBoo(int i,int j){
        super("bar",j);
    }
    public SonOfBoo(int i, int x,int y){
        super("foo",i);
    }
}
