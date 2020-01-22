package session1_demo;
import session1.Car;
public class Toyota extends Car {

protected int price;
   public Toyota(int year ,String typeCar,String brand,int price){
       this.year=year;
       this.typeCar=typeCar;
       this.brand=brand;
       this.price=price;
   }

    public void showInfor(){
        super.getInfo();
        this.setYear(2003);
        System.out.println("year : "+year);
        //System.out.println("year:"+typeCar);
        //System.out.println("");


    }
}
