package example;

public class Fraction {
    private int numerator, denominator;
    public Fraction(int n,int d) throws Exception{
        if(d==0) throw new Exception();
        numerator= n;
        denominator=d;
    }

}
