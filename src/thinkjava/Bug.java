package thinkjava;

public class Bug {
    private String name;
  public void BugMove(Bug bug){
      System.out.println(name+" move ");
  }
  public void setName(String name){
      this.name=name;
  }
  public String getName(){
      return name;
  }
}
