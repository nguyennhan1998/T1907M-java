package session4;

public class Generic<K,V> {
    public K name;//String Name,Integer name , double name
    public V phone;//string phone,Integer phone,double phone
    public K getName(){
        return name;
    }
    public V getPhone(){
        return phone;
    }
    public void setName(K name){
        this.name=name;
    }
    public void setPhone(V phone){
        this.phone=phone;
    }
    public<E> void showMessage(E msg){//ham nay co kieu du lieu la e chua biet
        //khi su dung mooi dung khai bao thi moi biet

        System.out.println(msg);
    }
//    public void showMessage(Integer msg){
//        System.out.println(msg);
//    } public void showMessage(double msg){
//        System.out.println(msg);
//    } public void showMessage(Character msg){
//        System.out.println(msg);
//    } public void showMessage(Generic msg){
//        System.out.println(msg);
//    }

}
