package thinkjava;

public class CountDown {
    public static void CountDown(int n){
        if(n==0){
            System.out.println("boom..boom");
        }else{
            System.out.println(n);
            CountDown(n-1);
        }
    }
    public static void nLine(int n){
        if(n>0){
            System.out.println(" ");
            nLine(n-1);
        }
    }
}
