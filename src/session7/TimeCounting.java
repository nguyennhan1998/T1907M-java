package session7;

public class TimeCounting extends Thread {
    @Override
    public void run() {
        for(int i=9;i>=0;i--){
            for(int j=59;j>=0;j--){
                if(j<10){
                    System.out.println("0"+i+":"+"0"+j);
                }
                else{
                    System.out.println("0"+i+":"+j);
                }
                try{
                    Thread.sleep(1000);
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
