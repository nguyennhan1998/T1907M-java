package session7;

import sun.awt.windows.ThemeReader;

public class CounterF1 extends Thread {

    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("F1 - "+i);
            try{
                Thread.sleep(100);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Thread: "+Thread.currentThread().getName());
        Thread.currentThread().setName("Counter f1");
        System.out.println("After change as "+ Thread.currentThread().getName());
        System.out.println("F1 finish");
    }


}
