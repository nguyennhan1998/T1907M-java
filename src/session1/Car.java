package session1;

public class Car {
    protected int year=2015;

    public int getYear() {
        return year;
    }
public Car(){

}
    public Car(int year, String typeCar, String brand) {
        this.year = year;
        this.typeCar = typeCar;
        this.brand = brand;
    }

    public void setYear(int year) {
        this.year = year;
    }

    protected String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getTypeCar() {
        return typeCar;
    }

    public void setTypeCar(String typeCar) {
        this.typeCar = typeCar;
    }

    protected  String typeCar="autoCar";
    protected String brand="Auto";
    public void getInfo(){
        System.out.println("brand: "+brand);
    }

}
