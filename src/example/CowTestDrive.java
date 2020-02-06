package example;

public class CowTestDrive {
    public static void main(String[] args) {
        CowE c= new CowE();
        CowE cow1= new CowE("hana");
        CowE cow2=new CowE(cow1);
        System.out.println(cow1.equals(cow2));

//        System.out.println("a cow was born:>");
//        CowE d= new CowE(12.2);
    }
}
