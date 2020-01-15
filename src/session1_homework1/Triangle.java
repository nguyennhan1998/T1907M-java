package session1_homework1;

import java.util.Scanner;

public class Triangle {
    protected double a;
    protected double b;
    protected double c;
public Triangle(){

}
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public boolean checkTg(double a,double b,double c){
        if(a+b-c>=0){
            return true;
        }else{
            return false;
        }
}

    public double chuVi(){

            double cv=a+b+c;

            return cv;

    }
    public double dienTich(){

            double  d= chuVi()/2;
            double t= Math.sqrt(d*(d-a)*(d-b)*(d-c));
           return t;


    }


}
