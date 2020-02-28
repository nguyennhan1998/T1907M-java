package session4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Generic g = new Generic();
        g.showMessage("Good Morning");
        g.showMessage(18);
        g.showMessage(g);//day la mot dang tham so hoa
        //khi ma su dung se bao ro rang no la kieu gi
        Generic<String,Integer> g2= new Generic<>();
        g2.setPhone(90988);
        g2.setName("seo dan");
        Generic<Integer,Double> g3= new Generic<>();
        g3.setName(4335);
        g3.setName(7847738);
        ArrayList<String> arrayList;
        HashSet<Double> doubles;
        PriorityQueue<String> stringPriorityQueue;
        HashMap<String,Integer> stringIntegerHashMap;
        ArrayList ar= new ArrayList();
        //up casting --> ep kieu nguoc len
        //down casting -->ep kieu xuoi xuong
        // class B extends A
        //B obj -> casting sang kieu a-> up casting
        // A obj->casting sang kieu B->down casting

    }
}
