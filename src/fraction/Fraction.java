package fraction;

public class Fraction {
   int a;
   int b;



public Fraction(){

   }
   public Fraction(int a,int b){
       this.a=a;
       this.b=b;
   }
   public void printFraction(){
       System.out.println("the fraction is "+a+ "/"+b);
   }
   public int Ucln(int a,int b){
       if(a%b!=0){
           return Ucln(b,a%b);

       }else{
           return b;
       }
   }
   public void rutGon(){
       int ucln=Ucln(a,b);
       a=a/ucln;
       b=b/ucln;
       if(b!=1){
           System.out.println("the fraction is : "+a+ "/"+b);
       }else{
           System.out.println("the fraction is : "+a);
       }
   }
    public void nghichDao(){
        if(a!=0){
            System.out.println("so nghich dao la: "+b+"/"+a);
        }else{
            System.out.println("khong co so nghich  dao");
        }
    }
    public int add(){
       return a+b;
    }
    public int sub(){
       return a-b;
    }
    public int mul(){
       return a*b;
    }
    public double div(){
       return (double) (a/b);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
