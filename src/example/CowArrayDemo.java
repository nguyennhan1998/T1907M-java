package example;

public class CowArrayDemo {
    public static void main(String[] args) {
        Cow cow1= new Cow();
        cow1.moo();
        cow1.name=" nhung ";
        Cow[] myCows= new Cow[3];
        myCows[0]=new Cow();
        myCows[1]=new Cow();
        myCows[2]=cow1;
        myCows[0].name=" Daisy ";
        myCows[1].name=" đức ";
        for(int x=0;x<myCows.length;x++) {
            myCows[x].moo();

        }

    }
}
