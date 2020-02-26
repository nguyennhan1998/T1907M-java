package section2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Teacher {
    public static void main(String[] args) {
//        ArrayList<String> stringArrayList= new ArrayList<>();
//        stringArrayList.add("aa");
//        stringArrayList.add("bb");
//        stringArrayList.add("cc");
//        stringArrayList.add("aa");
//        System.out.println("in ra arrayslist");
//        for(String s:stringArrayList){
//            System.out.println(s);
//        }
//        System.out.println("kich thuoc tap hop"+stringArrayList.size());
//        //if(stringArrayList.isEmpty());
//       stringArrayList.remove(0);
//        HashSet<String> stringHashSet= new HashSet<>();
//        stringHashSet.add("aa");
//        stringHashSet.add("bb");
//        stringHashSet.add("cc");
//        stringHashSet.add("aa");
//        System.out.println("in ra hashset");
//        for(String s:stringHashSet){
//            System.out.println(s);
//        }
//    }
//    public String toString(){
//        return "hello world";
//    }
//
        PriorityQueue<String> myQueue= new PriorityQueue<>();
        myQueue.add("Le van nam");
        myQueue.add("mai van dao");
        myQueue.add("do duy hai");
        myQueue.add("pham duc chinh");
        myQueue.add("something");
        System.out.println("in ra priority queue");
        //cai nay chi in ra danh sach
        for(String s: myQueue){
            System.out.println(s);
        }
        System.out.println("lay ra sd");
        //cach lay ra sd priority queue
        //cai nay lay ra de in ra sau do no se vut ra khong vong cho

        for(;!myQueue.isEmpty();){
            System.out.println(myQueue.poll());
        }
//        HashMap<String,String> hashMap= new HashMap<>();
//        hashMap.put("phong_linh","10m2");
//        hashMap.put("phong_vanh","12m2");
//        hashMap.put("phong_huyen","8m2");
//        hashMap.put("phong_nhan","5m2");
//        System.out.println("phong cua linh"+hashMap.get("phong_linh"));
//        HashMap<Integer,String> hashMap1= new HashMap<>();
//        hashMap1.put(0,"xin chao thu 4");
//        hashMap1.put(5,"xin chao thu 7 ");
//        System.out.println(hashMap1.get(5));
    }
}
