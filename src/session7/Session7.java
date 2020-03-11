package session7;

public class Session7 {
    public static void main(String[] args) {
//        CounterF1 cf1=new CounterF1();
//        cf1.start();
//        MyThread mt= new MyThread();
//        mt.start();
//        CounterF2 cf2=new CounterF2();
//        Thread th=new Thread();
//        th.start();
//        Runnable n1=new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("thread tao tu mot lop an danh");
//            }
//        };
//        new Thread(n1).start();
//        //lambda expression
//        Runnable n2=()->{
//            System.out.println("Thread tao tu lop an danh");
//        };
////        new Thread(n2);
//        SubThread st1= new SubThread();
//        st1.start();
        TimeCounting tc1=new TimeCounting();
        tc1.start();
//        for(int i=0;i<100;i++){
//            System.out.println("main- "+i);
//            try{
//                Thread.sleep(150);
//            }catch (Exception e){
//                System.out.println(e.getMessage());
//            }
//
//        }
//        System.out.println("Thread :"+Thread.currentThread().getName());
    }
}
