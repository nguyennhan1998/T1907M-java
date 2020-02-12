package example;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class TestException {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Numerator: ");
        int numerator= scanner.nextInt();
        System.out.println("Denominator: ");
        int denominator=scanner.nextInt();
        int result=numerator/denominator;
       System.out.printf("\nResult: %f /%d = %d\n",numerator,denominator,result);
    }


}
