package example;

public class CowE {
    private double weight;
    private String name;
    public CowE(){}
    public CowE(String n){name=n;}
    public CowE(CowE c){this.name=c.name;}
    public CowE(double weight){
        System.out.println("moo....");
        this.weight=weight;
        System.out.println(" my weight is : "+weight);
    }
}
