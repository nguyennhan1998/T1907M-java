package example;

public class Account {
    private int balance;
    private int transactions=0;
    public boolean deposit(int money){
        balance+=money;
        transactions++;
        return true;
    }
    public boolean withDraw(int money){
        transactions++;
        if(money<balance){
            balance-=money;
            return true;
        }else{
            return false;
        }

    }
    public void endMonth(){
        int fee=0;
        balance-=fee;
        System.out.println("balance is "+balance);
        System.out.println("transactions is "+transactions);
        System.out.println("fee is "+fee);
    }
    public void endMonthCharge(){

    }

}
class NormalAccount extends Account{
int fee=100000;


}
class NickelNDime extends Account{

}
class Gambler extends Account{

}