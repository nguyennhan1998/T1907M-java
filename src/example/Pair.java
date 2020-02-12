package example;



public class Pair <T,U> {
    public Pair(T f, U s){
        this.first=f;
        this.second=s;

    }
    public T getFirst() {return first;}
    public U getSecond() {return second;}
    private T first;
    private U second;
    Pair<String, Integer> mm= new Pair<String, Integer>("1st",1);
    

}
