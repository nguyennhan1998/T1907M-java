package assignment1;

public class Main {
    public static void main(String[] args) {
//        int[] int_arr= {1,3,5,7,9,11};
//        //basic array
//        Fraction[] fractions= new Fraction[10];
//        Fraction fr1= new Fraction();
//        ArrayList arr= new ArrayList();
//        arr.add(fr1);
//        arr.add(1);
//        arr.add("hello");
//        System.out.println("kich thuoc tap hop : "+arr.size());
//        ArrayList<Fraction> frArr= new ArrayList<>();
//        frArr.add(fr1);
//        frArr.remove(fr1);
//        System.out.println("fraction 2");
//        Fraction fr2= new Fraction(9,3);
//        fr2.printFraction();
//        System.out.println("compact fraction 2: ");
//        fr2.compactFraction();
//        fr2.printFraction();
        Fraction fr1 = new Fraction();
        Fraction fr2 = new Fraction();
        fr1.inputFraction();
        fr2.inputFraction();
        System.out.println("fr1 before Fraction is : ");
        fr1.printFraction();
        System.out.println("fr1 after compact Fraction is : ");
        fr1.compactFraction();
        fr1.printFraction();
        System.out.println("fr1 add fr2");
        Fraction fr3 = fr1.addFraction(fr2);
        fr3.printFraction();
        System.out.println("f1-f2");
        fr1.subtractFraction(fr2).printFraction();
        System.out.println("f1*f2");
        fr1.multiFraction(fr2).printFraction();
        System.out.println("f1/f2");
        fr1.divideFraction(fr2).printFraction();


    }
}
