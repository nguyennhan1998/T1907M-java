package example;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class TestList {
    public static void main(String[] args) {
        Collection<String> list= new LinkedList<String>();
        list.add("one");
        list.add("Two");
        list.add("Three");
        Collection<Integer> intList= new LinkedList<Integer>();
        intList.add(1);
        intList.add(0);
        intList.add(2);
        intList.add(0);
        Iterator<Integer> t= intList.iterator();
        while(t.hasNext()){
            int n= t.next();
            if(n==0) t.remove();

        }


//        Iterator<String> i= list.iterator();
//        while(i.hasNext()){
//            String s= i.next();
//            System.out.println(s);
//        }
        for(String s: list){
            System.out.println(s);
        }
    }
}

