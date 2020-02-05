package example;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<String>();
        String a= new String("Hello");
        list.add(a);
        String b= new String("Goodbye");
        list.add(0,b);
        System.out.println("list size is "+list.size());
        if(list.contains("hello"))
            System.out.println("hello is in");
        System.out.println("index of  "+a+" is "+list.indexOf(a));
        System.out.println("list is empty "+ list.isEmpty());
        list.remove(a);

    }
}
