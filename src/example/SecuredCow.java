package example;

public class SecuredCow {
    private int age;

    public  void setAge(int a){
        if(a>0){
            age=a;
        }
    }
    public int getAge(){
        return age;
    }
    void moo(){
        if(age<=5){
            System.out.println("Moooooo....");
        }else{
            System.out.println("Moo.");
        }
    }
}
